package tmall;

import sale.OrderTransStatus;
import utils.DataConnection;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import java.util.Date;

public class TmallRefund {
  //<editor-fold desc="Fields">
  private Long id;
  private String tenantCode;
  private String alipayNo;
  private String attribute;
  private String buyerNick;
  private String companyName;
  private Date created;
  private String description;
  private Date endTime;
  private Date goodReturnTime;
  private String goodStatus;
  private Boolean hasGoodReturn;
  private Date modified;
  private Long num;
  private Long numIid;
  private Long oid;
  private String orderStatus;
  private String outerId;
  private BigDecimal payment;
  private BigDecimal price;
  private String reason;
  private BigDecimal refundFee;
  private Long refundId;
  private String refundPhase;
  private Long refundVersion;
  private String sellerNick;
  private String shippingType;
  private String sid;
  private String sku;
  private BigDecimal splitSellerFee;
  private BigDecimal splitTaobaoFee;
  private String status;
  private Long tid;
  private String title;
  private BigDecimal totalFee;
  private String shopCode;
  private Date updatedAt;
  private String transSaleStatus;
  private String transMsg;
  private Date transAt;
  //</editor-fold>

  //<editor-fold desc="Properties">
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTenantCode() {
    return tenantCode;
  }

  public void setTenantCode(String tenantCode) {
    this.tenantCode = tenantCode;
  }

  public String getAlipayNo() {
    return alipayNo;
  }

  public void setAlipayNo(String alipayNo) {
    this.alipayNo = alipayNo;
  }

  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public String getBuyerNick() {
    return buyerNick;
  }

  public void setBuyerNick(String buyerNick) {
    this.buyerNick = buyerNick;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public Date getGoodReturnTime() {
    return goodReturnTime;
  }

  public void setGoodReturnTime(Date goodReturnTime) {
    this.goodReturnTime = goodReturnTime;
  }

  public String getGoodStatus() {
    return goodStatus;
  }

  public void setGoodStatus(String goodStatus) {
    this.goodStatus = goodStatus;
  }

  public Boolean getHasGoodReturn() {
    return hasGoodReturn;
  }

  public void setHasGoodReturn(Boolean hasGoodReturn) {
    this.hasGoodReturn = hasGoodReturn;
  }

  public Date getModified() {
    return modified;
  }

  public void setModified(Date modified) {
    this.modified = modified;
  }

  public Long getNum() {
    return num;
  }

  public void setNum(Long num) {
    this.num = num;
  }

  public Long getNumIid() {
    return numIid;
  }

  public void setNumIid(Long numIid) {
    this.numIid = numIid;
  }

  public Long getOid() {
    return oid;
  }

  public void setOid(Long oid) {
    this.oid = oid;
  }

  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public String getOuterId() {
    return outerId;
  }

  public void setOuterId(String outerId) {
    this.outerId = outerId;
  }

  public BigDecimal getPayment() {
    return payment;
  }

  public void setPayment(BigDecimal payment) {
    this.payment = payment;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public BigDecimal getRefundFee() {
    return refundFee;
  }

  public void setRefundFee(BigDecimal refundFee) {
    this.refundFee = refundFee;
  }

  public Long getRefundId() {
    return refundId;
  }

  public void setRefundId(Long refundId) {
    this.refundId = refundId;
  }

  public String getRefundPhase() {
    return refundPhase;
  }

  public void setRefundPhase(String refundPhase) {
    this.refundPhase = refundPhase;
  }

  public Long getRefundVersion() {
    return refundVersion;
  }

  public void setRefundVersion(Long refundVersion) {
    this.refundVersion = refundVersion;
  }

  public String getSellerNick() {
    return sellerNick;
  }

  public void setSellerNick(String sellerNick) {
    this.sellerNick = sellerNick;
  }

  public String getShippingType() {
    return shippingType;
  }

  public void setShippingType(String shippingType) {
    this.shippingType = shippingType;
  }

  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public BigDecimal getSplitSellerFee() {
    return splitSellerFee;
  }

  public void setSplitSellerFee(BigDecimal splitSellerFee) {
    this.splitSellerFee = splitSellerFee;
  }

  public BigDecimal getSplitTaobaoFee() {
    return splitTaobaoFee;
  }

  public void setSplitTaobaoFee(BigDecimal splitTaobaoFee) {
    this.splitTaobaoFee = splitTaobaoFee;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Long getTid() {
    return tid;
  }

  public void setTid(Long tid) {
    this.tid = tid;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BigDecimal getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(BigDecimal totalFee) {
    this.totalFee = totalFee;
  }

  public String getShopCode() {
    return shopCode;
  }

  public void setShopCode(String shopCode) {
    this.shopCode = shopCode;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getTransSaleStatus() {
    return transSaleStatus;
  }

  public void setTransSaleStatus(String transSaleStatus) {
    this.transSaleStatus = transSaleStatus;
  }

  public String getTransMsg() {
    return transMsg;
  }

  public void setTransMsg(String transMsg) {
    this.transMsg = transMsg;
  }

  public Date getTransAt() {
    return transAt;
  }

  public void setTransAt(Date transAt) {
    this.transAt = transAt;
  }
  //</editor-fold>

  //<editor-fold desc="Query">
  private static String QUERY_INSERT_TMALL_REFUND = "insert into tmall_refunds (\n" +
      "tenant_code, \n" +
      "shop_code, \n" +
      "alipay_no, \n" +
      "attribute, \n" +
      "buyer_nick, \n" +
      "company_name, \n" +
      "created, \n" +
      "description, \n" +
      "end_time, \n" +
      "good_return_time, \n" +
      "good_status, \n" +
      "has_good_return, \n" +
      "modified, \n" +
      "num, \n" +
      "num_iid, \n" +
      "oid, \n" +
      "order_status, \n" +
      "outer_id, \n" +
      "payment, \n" +
      "price, \n" +
      "reason, \n" +
      "refund_fee, \n" +
      "refund_id, \n" +
      "refund_phase, \n" +
      "refund_version, \n" +
      "seller_nick, \n" +
      "shipping_type, \n" +
      "sid, \n" +
      "sku, \n" +
      "split_seller_fee, \n" +
      "split_taobao_fee, \n" +
      "status, \n" +
      "tid, \n" +
      "title, \n" +
      "total_fee, \n" +
      "updated_at, \n" +
      "trans_status \n" +
      ")\n" +
      "values (\n" +
      "?, ?, ?, ?, ?, \n" +
      "?, ?, ?, ?, ?, \n" +
      "?, ?, ?, ?, ?, \n" +
      "?, ?, ?, ?, ?, \n" +
      "?, ?, ?, ?, ?, \n" +
      "?, ?, ?, ?, ?, \n" +
      "?, ?, ?, ?, ?, \n" +
      "?, ? \n" +
      ")";

  private static String QUERY_UPDATE_TMALL_REFUND = "update tmall_refunds \n" +
      "set attribute=?, \n" +
      "alipay_no=?, \n" +
      "company_name=?, \n" +
      "created=?, \n" +
      "description=?, \n" +
      "end_time=?, \n" +
      "good_return_time=?, \n" +
      "good_status=?, \n" +
      "modified=?, \n" +
      "num_iid=?, \n" +
      "order_status=?, \n" +
      "price=?, \n" +
      "shipping_type=?, \n" +
      "sid=?, \n" +
      "split_seller_fee=?, \n" +
      "split_taobao_fee=?, \n" +
      "status=?, \n" +
      "payment=?, \n" +
      "refund_fee=?, \n" +
      "updated_at=?, \n" +
      "trans_status=? \n" +
      "where refund_id=? ";
  //</editor-fold>

  public static TmallRefund transfer(ResultSet rs) throws Exception {
    TmallRefund tmallRefund = new TmallRefund();
    tmallRefund.id = rs.getLong("id");
    tmallRefund.tenantCode = rs.getString("tenant_code");
    tmallRefund.alipayNo = rs.getString("alipay_no");
    tmallRefund.attribute = rs.getString("attribute");
    tmallRefund.buyerNick = rs.getString("buyer_nick");
    tmallRefund.companyName = rs.getString("company_name");
    tmallRefund.created = rs.getTimestamp("created");
    tmallRefund.description = rs.getString("description");
    tmallRefund.endTime = rs.getTimestamp("end_time");
    tmallRefund.goodReturnTime = rs.getTimestamp("good_return_time");
    tmallRefund.goodStatus = rs.getString("good_status");
    tmallRefund.hasGoodReturn = rs.getBoolean("has_good_return");
    tmallRefund.modified = rs.getTimestamp("modified");
    tmallRefund.num = rs.getLong("num");
    tmallRefund.numIid = rs.getLong("num_iid");
    tmallRefund.oid = rs.getLong("oid");
    tmallRefund.orderStatus = rs.getString("order_status");
    tmallRefund.outerId = rs.getString("outer_id");
    tmallRefund.payment = rs.getBigDecimal("payment");
    tmallRefund.price = rs.getBigDecimal("price");
    tmallRefund.reason = rs.getString("reason");
    tmallRefund.refundFee = rs.getBigDecimal("refund_fee");
    tmallRefund.refundId = rs.getLong("refund_id");
    tmallRefund.refundPhase = rs.getString("refund_phase");
    tmallRefund.refundVersion = rs.getLong("refund_version");
    tmallRefund.sellerNick = rs.getString("seller_nick");
    tmallRefund.shippingType = rs.getString("shipping_type");
    tmallRefund.sid = rs.getString("sid");
    tmallRefund.sku = rs.getString("sku");
    tmallRefund.splitSellerFee = rs.getBigDecimal("split_seller_fee");
    tmallRefund.splitTaobaoFee = rs.getBigDecimal("split_taobao_fee");
    tmallRefund.status = rs.getString("status");
    tmallRefund.tid = rs.getLong("tid");
    tmallRefund.title = rs.getString("title");
    tmallRefund.totalFee = rs.getBigDecimal("total_fee");
    tmallRefund.shopCode = rs.getString("shop_code");
    tmallRefund.updatedAt = rs.getTimestamp("updated_at");
    return tmallRefund;
  }

  public static TmallRefund findByRefundId(Long refundId) throws Exception {
    Statement stmt = null;
    ResultSet rs = null;
    try {
      stmt = DataConnection.getInstance().getAppConnForRefund().createStatement();
      String query = "select * \n" +
          "from tmall_refunds \n" +
          "where refund_id=" + refundId;
      rs = stmt.executeQuery(query);
      if (rs.next()) {
        return transfer(rs);
      }
      return null;
    } finally {
      DataConnection.close(null, stmt, rs);
    }
  }

  public static List<TmallRefund> findReadyDataByShopAndPeriod(String tenantCode, String shopCode, Date fromDate, Date toDate, boolean onlyFailed, PeriodType periodType) throws Exception {
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      String query = "select * \n" +
          "from tmall_refunds ";
      //强制索引
      if (periodType == PeriodType.CREATED) {
        query += "FORCE INDEX (idx_tmall_refunds_created_shop_trans_status) \n";
      } else if (periodType == PeriodType.MODIFIED) {
        query += " \n";
      } else {
        query += "FORCE INDEX (idx_tmall_refunds_updated_at_shop_trans_status) \n";
      }
      query += "where 1=1 \n" +
          "and shop_code = ? \n" +
          "";

      if (periodType == PeriodType.CREATED) {
        query += "and created between ? and ? \n";
      } else if (periodType == PeriodType.MODIFIED) {
        query += "and modified between ? and ? \n";
      } else {
        query += "and updated_at between ? and ? \n";
      }

      if (onlyFailed) {
        query += "and trans_status in ('N','E0','E10','E11','E12','E13','E15','E16','E17') \n";
      } else {
        query += "and trans_status in ('','U') \n";
      }

//      LOG.info("query: " + query + " \n shop:" + shopCode + "; period: " + EhubUtil.toCsvField(fromDate) + "~" + EhubUtil.toCsvField(toDate));

      pstmt = DataConnection.getInstance().getAppConn().prepareStatement(query);
      int index = 1;
      pstmt.setString(index++, shopCode);
      pstmt.setTimestamp(index++, new Timestamp(fromDate.getTime()));
      pstmt.setTimestamp(index++, new Timestamp(toDate.getTime()));
      rs = pstmt.executeQuery();
      List<TmallRefund> tmallRefundList = new ArrayList<>();
      while (rs.next()) {
        TmallRefund refund = TmallRefund.transfer(rs);
        tmallRefundList.add(refund);
      }
      return tmallRefundList;
    } finally {
      DataConnection.close(null, pstmt, rs);
    }
  }

  static PreparedStatement pstmtInRefund = null;
  static PreparedStatement pstmtUpRefund = null;

  public static void save(List<TmallRefund> refunds) throws Exception {
    if (refunds == null || refunds.isEmpty()) {
      return;
    }
    Map<Long, TmallRefund> existRefundMap = fetchExistRefundMap(refunds);
    List<TmallRefund> refundInList = new ArrayList<>();
    List<TmallRefund> refundUpList = new ArrayList<>();
    for (TmallRefund refund : refunds) {
      if (existRefundMap.containsKey(refund.getRefundId())) {
        TmallRefund existRefund = existRefundMap.get(refund.getRefundId());
        if (existRefund.getModified().compareTo(refund.getModified()) < 0
            || (existRefund.getModified().compareTo(refund.getModified()) == 0 && "SUCCESS,CLOSED".indexOf(refund.getStatus()) >= 0)) {
          if ("SUCCESS".equals(refund.getStatus()) && !"SUCCESS".equals(existRefund.getStatus())) {
            refund.setEndTime(refund.getModified());
          } else {
            refund.setEndTime(existRefund.getEndTime());
          }

          if (refund.getCompanyName() == null && existRefund.getCompanyName() != null) {
            refund.setCompanyName(existRefund.getCompanyName());
            refund.setAlipayNo(existRefund.getAlipayNo());
            refund.setGoodReturnTime(existRefund.getGoodReturnTime());
            refund.setNumIid(existRefund.getNumIid());
            refund.setPrice(existRefund.getPrice());
            refund.setShippingType(existRefund.getShippingType());
            refund.setSplitSellerFee(existRefund.getSplitSellerFee());
            refund.setSplitTaobaoFee(existRefund.getSplitTaobaoFee());
          }

          refundUpList.add(refund);
        }
      } else {
        if ("SUCCESS".equals(refund.getStatus())) {
          refund.setEndTime(refund.getModified());
        }
        refundInList.add(refund);
      }
    }

    insert(refundInList);
    update(refundUpList);
  }

  private static Map<Long, TmallRefund> fetchExistRefundMap(List<TmallRefund> refunds) throws Exception {
    Map<Long, TmallRefund> existRefundMap = new HashMap<>();
    if (refunds == null) {
      return existRefundMap;
    }
    String refundIdIn = "";
    String comma = "";
    for (TmallRefund refund : refunds) {
      refundIdIn = String.format("%s%s%d", refundIdIn, comma, refund.getRefundId());
      comma = ",";
    }
    Statement stmt = null;
    ResultSet rs = null;

    try {
      String query = "select refund_id, modified, status, end_time, alipay_no, company_name,good_return_time,num_iid,price,shipping_type, \n" +
          "split_seller_fee, split_taobao_fee \n" +
          "from tmall_refunds \n" +
          "where 1=1 \n" +
//          "and shop_code = '" + channelShopCode + "' \n" +
          "and refund_id in (" + refundIdIn + ") \n";
      stmt = DataConnection.getInstance().getAppConnForRefund().createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()) {
        TmallRefund resultRefund = new TmallRefund();
        resultRefund.setStatus(rs.getString("status"));
        resultRefund.setEndTime(rs.getTimestamp("end_time"));
        resultRefund.setModified(rs.getTimestamp("modified"));
        resultRefund.setAlipayNo(rs.getString("alipay_no"));
        resultRefund.setCompanyName(rs.getString("company_name"));
        resultRefund.setGoodReturnTime(rs.getTimestamp("good_return_time"));
        resultRefund.setNumIid(rs.getLong("num_iid"));
        resultRefund.setPrice(rs.getBigDecimal("price"));
        resultRefund.setShippingType(rs.getString("shipping_type"));
        resultRefund.setSplitSellerFee(rs.getBigDecimal("split_seller_fee"));
        resultRefund.setSplitTaobaoFee(rs.getBigDecimal("split_taobao_fee"));
        existRefundMap.put(rs.getLong("refund_id"), resultRefund);
      }
      return existRefundMap;
    } finally {
      DataConnection.close(null, stmt, rs);
    }
  }

  public static void insert(List<TmallRefund> refunds) throws Exception {
    if (refunds == null || refunds.isEmpty()) {
      return;
    }
    int countRefund = 0;
    int index = 1;
    int batchSize = 200;

    if (pstmtInRefund == null) {
      pstmtInRefund = DataConnection.getInstance().getAppConnForRefund().prepareStatement(QUERY_INSERT_TMALL_REFUND);
      DataConnection.getInstance().addPreparedStmt(pstmtInRefund);
    }
    for (TmallRefund refund : refunds) {
      index = 1;
      countRefund++;
      //<editor-fold desc="set tmall refund params">
      pstmtInRefund.setString(index++, refund.getTenantCode());
      pstmtInRefund.setString(index++, refund.getShopCode());
      pstmtInRefund.setString(index++, refund.getAlipayNo());
      pstmtInRefund.setString(index++, refund.getAttribute());
      pstmtInRefund.setString(index++, refund.getBuyerNick());
      pstmtInRefund.setString(index++, refund.getCompanyName());
      pstmtInRefund.setTimestamp(index++, new Timestamp(refund.getCreated().getTime()));
      pstmtInRefund.setString(index++, refund.getDescription());
      pstmtInRefund.setTimestamp(index++, refund.getEndTime() != null ? new Timestamp(refund.getEndTime().getTime()) : null);
      pstmtInRefund.setTimestamp(index++, refund.getGoodReturnTime() != null ? new Timestamp(refund.getGoodReturnTime().getTime()) : null);
      pstmtInRefund.setString(index++, refund.getGoodStatus());
      pstmtInRefund.setBoolean(index++, refund.getHasGoodReturn());
      pstmtInRefund.setTimestamp(index++, new Timestamp(refund.getModified().getTime()));
      pstmtInRefund.setObject(index++, refund.getNum());
      pstmtInRefund.setObject(index++, refund.getNumIid());
      pstmtInRefund.setLong(index++, refund.getOid());
      pstmtInRefund.setString(index++, refund.getOrderStatus());
      pstmtInRefund.setString(index++, refund.getOuterId());
      pstmtInRefund.setObject(index++, refund.getPayment(), Types.DECIMAL);
      pstmtInRefund.setObject(index++, refund.getPrice(), Types.DECIMAL);
      pstmtInRefund.setString(index++, refund.getReason());
      pstmtInRefund.setObject(index++, refund.getRefundFee(), Types.DECIMAL);
      pstmtInRefund.setLong(index++, refund.getRefundId());
      pstmtInRefund.setString(index++, refund.getRefundPhase());
      pstmtInRefund.setObject(index++, refund.getRefundVersion());
      pstmtInRefund.setString(index++, refund.getSellerNick());
      pstmtInRefund.setString(index++, refund.getShippingType());
      pstmtInRefund.setString(index++, refund.getSid());
      pstmtInRefund.setString(index++, refund.getSku());
      pstmtInRefund.setObject(index++, refund.getSplitSellerFee(), Types.DECIMAL);
      pstmtInRefund.setObject(index++, refund.getSplitTaobaoFee(), Types.DECIMAL);
      pstmtInRefund.setString(index++, refund.getStatus());
      pstmtInRefund.setLong(index++, refund.getTid());
      pstmtInRefund.setString(index++, refund.getTitle());
      pstmtInRefund.setObject(index++, refund.getTotalFee(), Types.DECIMAL);
      pstmtInRefund.setTimestamp(index++, new Timestamp(System.currentTimeMillis()));
      pstmtInRefund.setString(index++, "");//transSaleStatus
      //</editor-fold>
      pstmtInRefund.addBatch();
      if (countRefund % batchSize == 0 || countRefund == refunds.size()) {
        pstmtInRefund.executeBatch();
        pstmtInRefund.clearBatch();
      }
    }
  }

  public static void update(List<TmallRefund> refunds) throws Exception {
    if (refunds == null || refunds.isEmpty()) {
      return;
    }
    int countRefund = 0;
    int index = 1;
    int batchSize = 500;

    if (pstmtUpRefund == null) {
      pstmtUpRefund = DataConnection.getInstance().getAppConnForRefund().prepareStatement(QUERY_UPDATE_TMALL_REFUND);
      DataConnection.getInstance().addPreparedStmt(pstmtUpRefund);
    }
    for (TmallRefund eachRefund : refunds) {
      index = 1;
      countRefund++;
      //<editor-fold desc="set tmall refund params">
      pstmtUpRefund.setString(index++, eachRefund.getAttribute());
      pstmtUpRefund.setString(index++, eachRefund.getAlipayNo());
      pstmtUpRefund.setString(index++, eachRefund.getCompanyName());
      pstmtUpRefund.setTimestamp(index++, new Timestamp(eachRefund.getCreated().getTime()));
      pstmtUpRefund.setString(index++, eachRefund.getDescription());
      pstmtUpRefund.setTimestamp(index++, eachRefund.getEndTime() != null ? new Timestamp(eachRefund.getEndTime().getTime()) : null);
      pstmtUpRefund.setTimestamp(index++, eachRefund.getGoodReturnTime() != null ? new Timestamp(eachRefund.getGoodReturnTime().getTime()) : null);
      pstmtUpRefund.setString(index++, eachRefund.getGoodStatus());
      pstmtUpRefund.setTimestamp(index++, new Timestamp(eachRefund.getModified().getTime()));
      pstmtUpRefund.setObject(index++, eachRefund.getNumIid());
      pstmtUpRefund.setString(index++, eachRefund.getOrderStatus());
      pstmtUpRefund.setObject(index++, eachRefund.getPrice(), Types.DECIMAL);
      pstmtUpRefund.setString(index++, eachRefund.getShippingType());
      pstmtUpRefund.setString(index++, eachRefund.getSid());
      pstmtUpRefund.setObject(index++, eachRefund.getSplitSellerFee());
      pstmtUpRefund.setObject(index++, eachRefund.getSplitTaobaoFee());
      pstmtUpRefund.setString(index++, eachRefund.getStatus());
      pstmtUpRefund.setObject(index++, eachRefund.getPayment(), Types.DECIMAL);
      pstmtUpRefund.setObject(index++, eachRefund.getRefundFee(), Types.DECIMAL);
      pstmtUpRefund.setTimestamp(index++, new Timestamp(System.currentTimeMillis()));
      pstmtUpRefund.setString(index++, "");//transSaleStatus
      pstmtUpRefund.setLong(index++, eachRefund.getRefundId());
      //</editor-fold>
      pstmtUpRefund.addBatch();
      if (countRefund % batchSize == 0 || countRefund == refunds.size()) {
        pstmtUpRefund.executeBatch();
        pstmtUpRefund.clearBatch();
      }
    }
  }

  public void updateTransStatus(OrderTransStatus transStatus) throws Exception {
    PreparedStatement pstmt = null;
    try {
      String query = "update tmall_refunds \n" +
          "set trans_status=?, \n" +
          "trans_msg=?, \n" +
          "trans_at=? \n" +
          "where refund_id=? \n";
      pstmt = DataConnection.getInstance().getAppConn().prepareStatement(query);
      int index = 1;
      pstmt.setString(index++, transStatus.name());
      pstmt.setString(index++, transStatus.getTransMsg());
      pstmt.setTimestamp(index++, new Timestamp(System.currentTimeMillis()));
      pstmt.setLong(index++, this.getRefundId());
      pstmt.executeUpdate();
    } finally {
      DataConnection.close(null, pstmt, null);
    }
  }

  public static void main(String... args) throws Exception {
    String refundId = "158249219321914252";
    TmallRefund refund = TmallRefund.findByRefundId(Long.parseLong(refundId));
    System.out.println(refund.getTitle());
  }
}
