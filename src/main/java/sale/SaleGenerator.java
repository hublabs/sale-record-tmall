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

      for (TmallOrder eachOrder : trade.getTmallOrders()) {
        //1.是否还没有发货
        if (eachOrder.getConsignTime() == null) {
          //1.1发货前取消的子订单或 支付前取消的订单
          if ("TRADE_CLOSED|TRADE_CLOSED_BY_TAOBAO".indexOf(eachOrder.getStatus()) >= 0) {
            orderTransStatusMap.put(eachOrder.getOid(), OrderTransStatus.S4);
            continue;
          }
          //1.2 待发货的子订单.
          else {
            orderTransStatusMap.put(eachOrder.getOid(), OrderTransStatus.N);
            IS_ALL_SUCCESS_TRADE = false;
            continue;
          }
        }
        //TODO 子订单存在退款号，但本地没有获取到时重新从天猫获取

        //2.判断是否为新的或转换失败的子订单
        if (!existSaleDtlMap.containsKey(eachOrder.getOid())) {
          SaleRecordDtl saleRecordDtl = SaleRecordDtl.generate(eachOrder);
          saleRecordDtlList.add(saleRecordDtl);
        }
      }

      SaleRecord saleRecord = SaleRecord.generate(saleRecordDtlList, trade);
      saleRecord.save();

      TmallOrder.updateTransStatus(orderTransStatusMap);
      if (IS_ALL_SUCCESS_TRADE) {
        trade.updateTransStatus(TradeTransStatus.S1);
      } else {
        trade.updateTransStatus(TradeTransStatus.N);
      }
      orderTransStatusMap.clear();

      if (!"test".equals(System.getProperty("APP_ENV"))) {
        appConn.commit();
      }
    } catch (Exception e) {
      appConn.rollback();
      trade.updateTransStatus(TradeTransStatus.E0, e.getMessage());
    } finally {
      if (!"test".equals(System.getProperty("APP_ENV"))) {
        appConn.setAutoCommit(true);
      }
    }
  }
}
