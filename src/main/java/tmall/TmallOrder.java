package tmall;

import sale.OrderTransStatus;
import utils.DataConnection;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

public class TmallOrder {

  //<editor-fold desc="Fields">
  private long id;
  private String tenantCode;
  private String tmallTradeId;
  private String shopCode;
  private Long tid;
  private Long oid;
  private Long refundId;
  private BigDecimal adjustFee;
  private Boolean buyerRate;
  private Long cid;
  private Date consignTime;
  private Date created;
  private BigDecimal discountFee;
  private BigDecimal divideOrderFee;
  private Date endTime;
  private String invoiceNo;
  private Boolean isDaixiao;
  private String logisticsCompany;
  private int num;
  private Long numIid;
  private String outerIid;
  private String outerSkuId;
  private BigDecimal partMjzDiscount;
  private BigDecimal payment;
  private String picPath;
  private BigDecimal price;
  private String refundStatus;
  private Boolean sellerRate;
  private String sellerType;
  private String shippingType;
  private Long skuId;
  private String skuPropertiesName;
  private String status;
  private String title;
  private BigDecimal totalFee;
  private String transStatus;
  private String transMsg;
  private Date transAt;
  //</editor-fold>

  //<editor-fold desc="Properties">
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTenantCode() {
    return tenantCode;
  }

  public void setTenantCode(String tenantCode) {
    this.tenantCode = tenantCode;
  }

  public String getTmallTradeId() {
    return tmallTradeId;
  }

  public void setTmallTradeId(String tmallTradeId) {
    this.tmallTradeId = tmallTradeId;
  }

  public String getShopCode() {
    return shopCode;
  }

  public void setShopCode(String shopCode) {
    this.shopCode = shopCode;
  }

  public Long getTid() {
    return tid;
  }

  public void setTid(Long tid) {
    this.tid = tid;
  }

  public Long getOid() {
    return oid;
  }

  public void setOid(Long oid) {
    this.oid = oid;
  }

  public Long getRefundId() {
    return refundId;
  }

  public void setRefundId(Long refundId) {
    this.refundId = refundId;
  }

  public BigDecimal getAdjustFee() {
    return adjustFee;
  }

  public void setAdjustFee(BigDecimal adjustFee) {
    this.adjustFee = adjustFee;
  }

  public Boolean getBuyerRate() {
    return buyerRate;
  }

  public void setBuyerRate(Boolean buyerRate) {
    this.buyerRate = buyerRate;
  }

  public Long getCid() {
    return cid;
  }

  public void setCid(Long cid) {
    this.cid = cid;
  }

  public Date getConsignTime() {
    return consignTime;
  }

  public void setConsignTime(Date consignTime) {
    this.consignTime = consignTime;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public BigDecimal getDiscountFee() {
    return discountFee;
  }

  public void setDiscountFee(BigDecimal discountFee) {
    this.discountFee = discountFee;
  }

  public BigDecimal getDivideOrderFee() {
    return divideOrderFee;
  }

  public void setDivideOrderFee(BigDecimal divideOrderFee) {
    this.divideOrderFee = divideOrderFee;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public String getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public Boolean getIsDaixiao() {
    return isDaixiao;
  }

  public void setIsDaixiao(Boolean daixiao) {
    isDaixiao = daixiao;
  }

  public String getLogisticsCompany() {
    return logisticsCompany;
  }

  public void setLogisticsCompany(String logisticsCompany) {
    this.logisticsCompany = logisticsCompany;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public Long getNumIid() {
    return numIid;
  }

  public void setNumIid(Long numIid) {
    this.numIid = numIid;
  }

  public String getOuterIid() {
    return outerIid;
  }

  public void setOuterIid(String outerIid) {
    this.outerIid = outerIid;
  }

  public String getOuterSkuId() {
    return outerSkuId;
  }

  public void setOuterSkuId(String outerSkuId) {
    this.outerSkuId = outerSkuId;
  }

  public BigDecimal getPartMjzDiscount() {
    return partMjzDiscount;
  }

  public void setPartMjzDiscount(BigDecimal partMjzDiscount) {
    this.partMjzDiscount = partMjzDiscount;
  }

  public BigDecimal getPayment() {
    return payment;
  }

  public void setPayment(BigDecimal payment) {
    this.payment = payment;
  }

  public String getPicPath() {
    return picPath;
  }

  public void setPicPath(String picPath) {
    this.picPath = picPath;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getRefundStatus() {
    return refundStatus;
  }

  public void setRefundStatus(String refundStatus) {
    this.refundStatus = refundStatus;
  }

  public Boolean getSellerRate() {
    return sellerRate;
  }

  public void setSellerRate(Boolean sellerRate) {
    this.sellerRate = sellerRate;
  }

  public String getSellerType() {
    return sellerType;
  }

  public void setSellerType(String sellerType) {
    this.sellerType = sellerType;
  }

  public String getShippingType() {
    return shippingType;
  }

  public void setShippingType(String shippingType) {
    this.shippingType = shippingType;
  }

  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }

  public String getSkuPropertiesName() {
    return skuPropertiesName;
  }

  public void setSkuPropertiesName(String skuPropertiesName) {
    this.skuPropertiesName = skuPropertiesName;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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

  public String getTransStatus() {
    return transStatus;
  }

  public void setTransStatus(String transStatus) {
    this.transStatus = transStatus;
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

  public static TmallOrder transfer(ResultSet rs) throws Exception {
    if (rs == null) {
      return null;
    }
    Map<String, Integer> columnMap = DataConnection.fetchColumnMap(rs);
    TmallOrder order = new TmallOrder();
    order.setId(rs.getLong("b.id"));
    order.setTenantCode(rs.getString("b.tenant_code"));
    order.setTmallTradeId(rs.getString("b.tmall_trade_id"));
    order.setShopCode(rs.getString("b.shop_code"));
    order.setTid(rs.getLong("b.tid"));
    order.setOid(rs.getLong("b.oid"));
    order.setRefundId(rs.getLong("b.refund_id"));
    order.setAdjustFee(rs.getBigDecimal("b.adjust_fee"));
    order.setBuyerRate(rs.getBoolean("b.buyer_rate"));
    order.setCid(rs.getLong("b.cid"));
    order.setConsignTime(rs.getTimestamp("b.consign_time"));
    order.setDiscountFee(rs.getBigDecimal("b.discount_fee"));
    order.setDivideOrderFee(rs.getBigDecimal("b.divide_order_fee"));
    order.setEndTime(rs.getTimestamp("b.end_time"));
    order.setInvoiceNo(rs.getString("b.invoice_no"));
    order.setIsDaixiao(rs.getBoolean("b.is_daixiao"));
    order.setLogisticsCompany(rs.getString("b.logistics_company"));
    order.setNum(rs.getInt("b.num"));
    order.setNumIid(rs.getLong("b.num_iid"));
    order.setOuterIid(rs.getString("b.outer_iid"));
    order.setOuterSkuId(rs.getString("b.outer_sku_id"));
    order.setPartMjzDiscount(rs.getBigDecimal("b.part_mjz_discount"));
    order.setPayment(rs.getBigDecimal("b.payment"));
    order.setPicPath(rs.getString("b.pic_path"));
    order.setPrice(rs.getBigDecimal("b.price"));
    order.setRefundStatus(rs.getString("b.refund_status"));
    order.setSellerRate(rs.getBoolean("b.seller_rate"));
    order.setSellerType(rs.getString("b.seller_type"));
    order.setShippingType(rs.getString("b.shipping_type"));
    order.setSkuId(rs.getLong("b.sku_id"));
    order.setSkuPropertiesName(rs.getString("b.sku_properties_name"));
    order.setStatus(rs.getString("b.status"));
    order.setTitle(rs.getString("b.title"));
    order.setTotalFee(rs.getBigDecimal("b.total_fee"));
    if (columnMap.containsKey("trans_status")) {
      order.setTransStatus(rs.getString("trans_status"));
    }
    if (columnMap.containsKey("trans_msg")) {
      order.setTransMsg(rs.getString("trans_msg"));
    }
    if (columnMap.containsKey("trans_at")) {
      order.setTransAt(rs.getTimestamp("trans_at"));
    }
    return order;
  }

  public void updateTransStatus(String transStatus, String transMsg) throws Exception {
    PreparedStatement pstmt = null;
    try {
      String query = "update tmall_orders \n" +
          "set trans_status=?, \n" +
          "trans_at=?, \n" +
          "trans_msg=? \n" +
          "where id=?";
      pstmt = DataConnection.getInstance().getAppConn().prepareStatement(query);
      int index = 1;
      pstmt.setString(index++, transStatus);
      pstmt.setTimestamp(index++, new Timestamp(System.currentTimeMillis()));
      pstmt.setString(index++, transMsg);
      pstmt.setLong(index++, this.id);
      pstmt.executeUpdate();
    } finally {
      DataConnection.close(null, pstmt, null);
    }
  }

  //TODO: batch update order trans status logic
  public static void updateTransStatus(Map<Long, OrderTransStatus> orderTransStatusMap) {
  }


}
