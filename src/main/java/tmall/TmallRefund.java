package tmall;

import java.math.BigDecimal;
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
}
