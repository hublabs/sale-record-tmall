package tmall;

import java.math.BigDecimal;
import java.util.Date;

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

  public Boolean getDaixiao() {
    return isDaixiao;
  }

  public void setDaixiao(Boolean daixiao) {
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
}
