package sale;

import tmall.TmallOrder;
import tmall.TmallRefund;
import tmall.TmallTrade;
import utils.DataConnection;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.*;

public class SaleGenerator {
  public static void generateSaleRecord(TmallTrade trade) throws Exception {
    Connection appConn = DataConnection.getInstance().getAppConn();
    try {
      appConn.setAutoCommit(false);
      Map<Long, OrderTransStatus> orderTransStatusMap = new HashMap<>();
      Boolean IS_ALL_SUCCESS_TRADE = true;
      Map<Long, Boolean> existSaleDtlMap = SaleRecordDtl.findOidMap(trade.getTid());

      List<SaleRecordDtl> saleRecordDtlList = new ArrayList<>();
      //发货前取消订单
      if (trade.getConsignTime() == null && "TRADE_CLOSED|TRADE_CLOSED_BY_TAOBAO".indexOf(trade.getStatus()) >= 0) {
        for (TmallOrder eachOrder : trade.getTmallOrders()) {
          orderTransStatusMap.put(eachOrder.getOid(), OrderTransStatus.DONE_CANCEL_ORDER);
        }

        TmallOrder.updateTransStatus(orderTransStatusMap);
        orderTransStatusMap.clear();
        trade.updateTransStatus(TradeTransStatus.DONE_CANCEL_TRADE,"trade canceled.");

        if (!"test".equals(System.getProperty("APP_ENV"))) {
          appConn.commit();
        }

        return;
      }

      for (TmallOrder eachOrder : trade.getTmallOrders()) {
        //1.是否还没有发货
        if (eachOrder.getConsignTime() == null) {
          //1.1发货前取消的子订单或 支付前取消的订单
          if ("TRADE_CLOSED|TRADE_CLOSED_BY_TAOBAO".indexOf(eachOrder.getStatus()) >= 0) {
            orderTransStatusMap.put(eachOrder.getOid(), OrderTransStatus.DONE_CANCEL_ORDER);
            continue;
          }
          //1.2 待发货的子订单.
          else {
            orderTransStatusMap.put(eachOrder.getOid(), OrderTransStatus.WAIT_CONSIGN);
            IS_ALL_SUCCESS_TRADE = false;
            continue;
          }
        }
        //TODO 子订单存在退款号，但本地没有获取到时重新从天猫获取

        //2.判断是否为新的或转换失败的子订单
        if (!existSaleDtlMap.containsKey(eachOrder.getOid())) {
          SaleRecordDtl saleRecordDtl = SaleRecordDtl.generate(eachOrder);
          saleRecordDtlList.add(saleRecordDtl);
          orderTransStatusMap.put(eachOrder.getOid(), OrderTransStatus.DONE_SUCCESS);
        }
      }

      SaleRecord saleRecord = SaleRecord.generate(saleRecordDtlList, trade);
      saleRecord.save();

      TmallOrder.updateTransStatus(orderTransStatusMap);
      if (IS_ALL_SUCCESS_TRADE) {
        trade.updateTransStatus(TradeTransStatus.DONE_SUCCESS_TRADE);
      } else {
        trade.updateTransStatus(TradeTransStatus.WAIT);
      }
      orderTransStatusMap.clear();

      if (!"test".equals(System.getProperty("APP_ENV"))) {
        appConn.commit();
      }
    } catch (Exception e) {
      appConn.rollback();
      trade.updateTransStatus(TradeTransStatus.ERR_SYS, e.getMessage());
    } finally {
      if (!"test".equals(System.getProperty("APP_ENV"))) {
        appConn.setAutoCommit(true);
      }
    }
  }

  public static void generateRefundSaleRecord(TmallRefund tmallRefund) throws Exception {
    if (tmallRefund == null) {
      return;
    }
    switch (tmallRefund.getStatus()) {
      case "CLOSED":
        tmallRefund.updateTransStatus(OrderTransStatus.DONE_CANCEL_REFUND);
        break;
      case "SUCCESS":
        createRefundSale(tmallRefund);
        break;
      default:
        //TODO: 未完成的退款单自顾客退款申请时间超过7天时重新从天猫api拉取的逻辑
        break;
    }
  }

  private static void createRefundSale(TmallRefund tmallRefund) throws Exception {
    TmallOrder tmallOrder = TmallOrder.findByOid(tmallRefund.getOid());
    TmallTrade tmallTrade = TmallTrade.findOnlyTradeByTid(tmallRefund.getTid());
    //TODO: 退款单对应的订单没有获取或对应子订单的状态还处于进行态时重新从天猫api获取。
    if (tmallOrder == null || "TRADE_FINISHED|TRADE_CLOSED".indexOf(tmallOrder.getStatus()) == -1) {
      //blabla
    }
    //如果经过上面处理还是找不到原订单，转换失败处理
    if (tmallOrder == null) {
      tmallRefund.updateTransStatus(OrderTransStatus.ERR_NO_ORDER);
      return;
    }
    //如果对应的订单发货前退了货。
    if (tmallOrder.getConsignTime() == null) {
      tmallRefund.updateTransStatus(OrderTransStatus.DONE_CANCEL_ORDER);
      return;
    }

    List<SaleRecordDtl> saleRecordDtlList = SaleRecordDtl.findByOid(tmallRefund.getOid());
    //如果没有退款对应的原销售则生成。
    if (saleRecordDtlList == null || saleRecordDtlList.isEmpty()) {
      TmallTrade originTrade = TmallTrade.findByTid(tmallRefund.getTid());
      generateSaleRecord(originTrade);
      saleRecordDtlList = SaleRecordDtl.findByOid(tmallRefund.getOid());
      if (saleRecordDtlList == null || saleRecordDtlList.isEmpty()) {
        tmallRefund.updateTransStatus(OrderTransStatus.ERR_NO_SALE);
        return;
      }
    }

    if (exsitRefundSale(saleRecordDtlList, tmallRefund.getRefundId())) {
      tmallRefund.updateTransStatus(OrderTransStatus.DONE_EXIST);
      return;
    }
    List<SaleRecordDtl> lastSaleDtlList = findLastSaleDtlList(saleRecordDtlList);

    BigDecimal adjustFee = tmallOrder.getAdjustFee() == null ? BigDecimal.ZERO : tmallOrder.getAdjustFee();
    BigDecimal partMjzDiscount = tmallOrder.getPartMjzDiscount() == null ? BigDecimal.ZERO : tmallOrder.getPartMjzDiscount();
    BigDecimal orderPayment = tmallOrder.getPrice().multiply(new BigDecimal(tmallOrder.getNum()))
        .subtract(tmallOrder.getDiscountFee()).subtract(partMjzDiscount).add(adjustFee);
    BigDecimal refundPayment = tmallRefund.getPayment();
    BigDecimal refundFee = tmallRefund.getRefundFee();

    BigDecimal freightAmt = BigDecimal.ZERO;
    //1. 全部退款
    if (refundPayment.compareTo(BigDecimal.ZERO) == 0) {
      //1.1 退款金额与销售金额相同
      if (orderPayment.compareTo(refundFee) == 0) {
        //TODO:以后还要考虑套装的情况
        SaleRecordDtl saleRecordDtl = SaleRecordDtl.transToRefundSale(lastSaleDtlList.get(0), tmallRefund);
        freightAmt = BigDecimal.ZERO;
        List<SaleRecordDtl> saleRecordDtls = new ArrayList<>();
        saleRecordDtls.add(saleRecordDtl);
        SaleRecord saleRecord = SaleRecord.generate(saleRecordDtls, tmallTrade);
        saleRecord.save();
        tmallRefund.updateTransStatus(OrderTransStatus.DONE_SUCCESS);
        return;
      }
      //TODO: 其他退款类型的数据处理
    }
    //TODO: 其他退款类型的数据处理
  }

  private static Boolean exsitRefundSale(List<SaleRecordDtl> saleDtlList, Long refundId) throws Exception {
    for (SaleRecordDtl eachSaleDtl : saleDtlList) {
      if (eachSaleDtl.getRefundId() != null && eachSaleDtl.getRefundId().compareTo(refundId) == 0) {
        return true;
      }
    }
    return false;
  }

  private static List<SaleRecordDtl> findLastSaleDtlList(List<SaleRecordDtl> saleRecordDtlList) {
    List<SaleRecordDtl> lastSaleDtlList = new ArrayList<>();
    //TODO: 查找该子订单最后的销售数据

    return lastSaleDtlList;
  }


}
