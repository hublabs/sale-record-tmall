package sale;

import tmall.TmallTrade;
import utils.DataConnection;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleRecord {

  //<editor-fold desc="Fields">
  private Long id;
  private Long orderId;
  private Long refundId;
  private Long channelId;
  private Long storeId;
  private String outerOrderNo;
  private String tenantCode;
  private BigDecimal totalListPrice;
  private BigDecimal totalDiscountPrice;
  private BigDecimal totalPaymentPrice;
  private BigDecimal freightPrice;
  private String channelType;
  private Long createdId;
  private Long salesmanId;
  private String transactionType;
  private String offlineShopCode;

  private Date tradeCreated;
  private Date createdAt;
  private String sendStatus;

  private List<SaleRecordDtl> saleRecordDtls = new ArrayList<>();
  //</editor-fold>

  //<editor-fold desc="Properties">
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Long getRefundId() {
    return refundId;
  }

  public void setRefundId(Long refundId) {
    this.refundId = refundId;
  }

  public Long getChannelId() {
    return channelId;
  }

  public void setChannelId(Long channelId) {
    this.channelId = channelId;
  }

  public Long getStoreId() {
    return storeId;
  }

  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }

  public String getOuterOrderNo() {
    return outerOrderNo;
  }

  public void setOuterOrderNo(String outerOrderNo) {
    this.outerOrderNo = outerOrderNo;
  }

  public String getTenantCode() {
    return tenantCode;
  }

  public void setTenantCode(String tenantCode) {
    this.tenantCode = tenantCode;
  }

  public BigDecimal getTotalListPrice() {
    return totalListPrice;
  }

  public void setTotalListPrice(BigDecimal totalListPrice) {
    this.totalListPrice = totalListPrice;
  }

  public BigDecimal getTotalDiscountPrice() {
    return totalDiscountPrice;
  }

  public void setTotalDiscountPrice(BigDecimal totalDiscountPrice) {
    this.totalDiscountPrice = totalDiscountPrice;
  }

  public BigDecimal getTotalPaymentPrice() {
    return totalPaymentPrice;
  }

  public void setTotalPaymentPrice(BigDecimal totalPaymentPrice) {
    this.totalPaymentPrice = totalPaymentPrice;
  }

  public BigDecimal getFreightPrice() {
    return freightPrice;
  }

  public void setFreightPrice(BigDecimal freightPrice) {
    this.freightPrice = freightPrice;
  }

  public String getChannelType() {
    return channelType;
  }

  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }

  public Long getCreatedId() {
    return createdId;
  }

  public void setCreatedId(Long createdId) {
    this.createdId = createdId;
  }

  public Long getSalesmanId() {
    return salesmanId;
  }

  public void setSalesmanId(Long salesmanId) {
    this.salesmanId = salesmanId;
  }

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public String getOfflineShopCode() {
    return offlineShopCode;
  }

  public void setOfflineShopCode(String offlineShopCode) {
    this.offlineShopCode = offlineShopCode;
  }

  public Date getTradeCreated() {
    return tradeCreated;
  }

  public void setTradeCreated(Date tradeCreated) {
    this.tradeCreated = tradeCreated;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public List<SaleRecordDtl> getSaleRecordDtls() {
    return saleRecordDtls;
  }

  public void addSaleRecordDtl(SaleRecordDtl saleRecordDtl) {
    this.saleRecordDtls.add(saleRecordDtl);
  }

  public String getSendStatus() {
    return sendStatus;
  }

  public void setSendStatus(String sendStatus) {
    this.sendStatus = sendStatus;
  }
  //</editor-fold>

  //<editor-fold desc="QUERY">
  String QUERY_INSERT_SALE_RECORD = "insert into sale_records (\n" +
      "order_id,\n" +
      "refund_id,\n" +
      "channel_id,\n" +
      "store_id,\n" +
      "outer_order_no,\n" +
      "tenant_code,\n" +
      "total_list_price,\n" +
      "total_discount_price,\n" +
      "total_payment_price,\n" +
      "freight_price,\n" +
      "channel_type,\n" +
      "created_id,\n" +
      "salesman_id,\n" +
      "transaction_type,\n" +
      "offline_shop_code,\n" +
      "trade_created,\n" +
      "created_at,\n" +
      "send_status \n" +
      ") values (\n" +
      "?,?,?,?,?,\n" +
      "?,?,?,?,?,\n" +
      "?,?,?,?,?,\n" +
      "?,?,?\n" +
      ");";
  //</editor-fold>

  private static SaleRecord transfer(ResultSet rs) throws Exception {
    if (rs == null) {
      return null;
    }
    SaleRecord saleRecord = new SaleRecord();
    saleRecord.setId(rs.getLong("id"));
    saleRecord.setOrderId(rs.getLong("order_id"));
    saleRecord.setRefundId(rs.getLong("refund_id"));
    if (rs.wasNull()) {
      saleRecord.setRefundId(null);
    }
    saleRecord.setChannelId(rs.getLong("channel_id"));
    if (rs.wasNull()) {
      saleRecord.setChannelId(null);
    }
    saleRecord.setStoreId(rs.getLong("store_id"));
    saleRecord.setOuterOrderNo(rs.getString("outer_order_no"));
    saleRecord.setTenantCode(rs.getString("tenant_code"));
    saleRecord.setTotalListPrice(rs.getBigDecimal("total_list_price"));
    saleRecord.setTotalDiscountPrice(rs.getBigDecimal("total_discount_price"));
    saleRecord.setTotalPaymentPrice(rs.getBigDecimal("total_payment_price"));
    saleRecord.setFreightPrice(rs.getBigDecimal("freight_price"));
    saleRecord.setChannelType(rs.getString("channel_type"));
    saleRecord.setCreatedId(rs.getLong("created_id"));
    saleRecord.setSalesmanId(rs.getLong("salesman_id"));
    saleRecord.setTransactionType(rs.getString("transaction_type"));
    saleRecord.setOfflineShopCode(rs.getString("offline_shop_code"));
    saleRecord.setTradeCreated(rs.getTimestamp("trade_created"));
    saleRecord.setCreatedAt(rs.getTimestamp("created_at"));
    saleRecord.setSendStatus(rs.getString("send_status"));
    return saleRecord;
  }

  public static SaleRecord generate(List<SaleRecordDtl> saleRecordDtlList, TmallTrade tmallTrade) throws Exception {
    if (saleRecordDtlList == null || saleRecordDtlList.size() == 0) {
      return null;
    }
    BigDecimal totalListPrice = BigDecimal.ZERO;
    BigDecimal totalDiscountFee = BigDecimal.ZERO;
    BigDecimal totalPayment = BigDecimal.ZERO;
    for (SaleRecordDtl eachSaleDtl : saleRecordDtlList) {
      totalListPrice = totalListPrice.add(eachSaleDtl.getTotalListPrice());
      totalDiscountFee = totalDiscountFee.add(eachSaleDtl.getTotalDiscountPrice());
      totalPayment = totalPayment.add(eachSaleDtl.getTotalPaymentPrice());
    }
    SaleRecord saleRecord = new SaleRecord();
    //TODO: 需要在salerecord业务了解后进行
    saleRecord.setChannelId(null);
    saleRecord.setChannelType(null);
    saleRecord.setStoreId(null);
    saleRecord.setTenantCode(null);
    saleRecord.setCreatedId(null);
    saleRecord.setSalesmanId(null);
    saleRecord.setTransactionType(null);

    saleRecord.setOfflineShopCode(tmallTrade.getShopCode());
    saleRecord.setOrderId(tmallTrade.getTid());
    saleRecord.setOuterOrderNo(String.valueOf(tmallTrade.getTid()));
    saleRecord.setTotalListPrice(totalListPrice);
    saleRecord.setTotalDiscountPrice(totalDiscountFee);
    saleRecord.setTotalPaymentPrice(totalPayment);
    saleRecord.setFreightPrice(tmallTrade.getPostFee());

    saleRecord.setTradeCreated(tmallTrade.getCreated());
    return saleRecord;
  }

  public static SaleRecord fetchById(Long id) throws Exception {
    Statement stmt = null;
    ResultSet rs = null;
    String query = "select a.*, b.* \n" +
        "from sale_records a \n" +
        "inner join sale_record_dtls b \n" +
        "on a.id = b.sale_record_id \n" +
        "where a.id = " + id;
    try {
      stmt = DataConnection.getInstance().getAppConn().createStatement();
      rs = stmt.executeQuery(query);
      SaleRecord saleRecord = null;
      while (rs.next()) {
        if (saleRecord == null) {
          saleRecord = SaleRecord.transfer(rs);
        }
        SaleRecordDtl saleRecordDtl = SaleRecordDtl.transfer(rs);
        saleRecord.addSaleRecordDtl(saleRecordDtl);
      }
      return saleRecord;
    } finally {
      DataConnection.getInstance().close(null, stmt, rs);
    }
  }

  private static void setInsertStmt(SaleRecord saleRecord, PreparedStatement pstmt) throws Exception {
    int index = 1;
    pstmt.setObject(index++, saleRecord.getOrderId());
    pstmt.setObject(index++, saleRecord.getRefundId());
    pstmt.setObject(index++, saleRecord.getChannelId());
    pstmt.setObject(index++, saleRecord.getStoreId());
    pstmt.setString(index++, saleRecord.getOuterOrderNo());
    pstmt.setString(index++, saleRecord.getTenantCode());
    pstmt.setBigDecimal(index++, saleRecord.getTotalListPrice());
    pstmt.setBigDecimal(index++, saleRecord.getTotalDiscountPrice());
    pstmt.setBigDecimal(index++, saleRecord.getTotalPaymentPrice());
    pstmt.setBigDecimal(index++, saleRecord.getFreightPrice());
    pstmt.setString(index++, saleRecord.getChannelType());
    pstmt.setObject(index++, saleRecord.getCreatedId());
    pstmt.setObject(index++, saleRecord.getSalesmanId());
    pstmt.setString(index++, saleRecord.getTransactionType());
    pstmt.setString(index++, saleRecord.getOfflineShopCode());
    pstmt.setTimestamp(index++, new Timestamp(saleRecord.getTradeCreated().getTime()));
    pstmt.setTimestamp(index++, new Timestamp(System.currentTimeMillis()));
    pstmt.setString(index++, saleRecord.getSendStatus() != null ? saleRecord.getSendStatus() : null);
  }

  public Long save() throws Exception {
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      Connection appConn = DataConnection.getInstance().getAppConn();
      pstmt = appConn.prepareStatement(QUERY_INSERT_SALE_RECORD, Statement.RETURN_GENERATED_KEYS);
      SaleRecord.setInsertStmt(this, pstmt);
      pstmt.executeUpdate();
      rs = pstmt.getGeneratedKeys();
      Long saleRecordId = 0L;
      if (rs != null && rs.next()) {
        saleRecordId = rs.getLong(1);
      }
      for (SaleRecordDtl eachSaleDtl : this.saleRecordDtls) {
        eachSaleDtl.setSaleRecordId(saleRecordId);
        eachSaleDtl.save();
      }
      return saleRecordId;
    } finally {
      DataConnection.close(null, pstmt, rs);
    }
  }

  public void updateStatus(String status, String msg) throws Exception {
    PreparedStatement pstmt = null;
    String query = "update sale_records \n" +
        "set send_status=?, \n" +
        "send_msg=?, \n" +
        "send_at=? \n" +
        "where id=?";
    try {
      pstmt = DataConnection.getInstance().getAppConn().prepareStatement(query);
      int index = 1;
      pstmt.setString(index++, status);
      pstmt.setString(index++, msg);
      pstmt.setTimestamp(index++, new Timestamp(System.currentTimeMillis()));
      pstmt.setLong(index++, this.getId());
      pstmt.executeUpdate();
    } finally {
      DataConnection.close(null, pstmt, null);
    }
  }
}
