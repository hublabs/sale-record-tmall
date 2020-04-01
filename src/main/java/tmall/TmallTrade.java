package tmall;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmallTrade {

  //<editor-fold desc="Fields">
  private long id;
  private String tenantCode;
  private String shopCode;
  private BigDecimal adjustFee;
  private Long alipayId;
  private String alipayNo;
  private String buyerNick;
  private Long buyerObtainPointFee;
  private BigDecimal codFee;
  private String codStatus;
  private Date consignTime;
  private Date created;
  private BigDecimal discountFee;
  private Date endTime;
  private Date modified;
  private BigDecimal payment;
  private Date payTime;
  private Long pointFee;
  private BigDecimal postFee;
  private Long realPointFee;
  private BigDecimal receivedPayment;
  private String receiverAddress;
  private String receiverCity;
  private String receiverDistrict;
  private String receiverMobile;
  private String receiverName;
  private String receiverState;
  private String receiverTown;
  private String receiverZip;
  private String sellerNick;
  private String shippingType;
  private String sid;
  private String status;
  private long tid;
  private String title;
  private BigDecimal totalFee;
  private String type;
  private Date updatedAt;
  private String transStatus;
  private String transMsg;
  private Date transAt;
  private List<TmallPromotion> tmallPromotions = new ArrayList<>();

  private List<TmallOrder> tmallOrders = new ArrayList<>();
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

  public String getShopCode() {
    return shopCode;
  }

  public void setShopCode(String shopCode) {
    this.shopCode = shopCode;
  }

  public BigDecimal getAdjustFee() {
    return adjustFee;
  }

  public void setAdjustFee(BigDecimal adjustFee) {
    this.adjustFee = adjustFee;
  }

  public Long getAlipayId() {
    return alipayId;
  }

  public void setAlipayId(Long alipayId) {
    this.alipayId = alipayId;
  }

  public String getAlipayNo() {
    return alipayNo;
  }

  public void setAlipayNo(String alipayNo) {
    this.alipayNo = alipayNo;
  }

  public String getBuyerNick() {
    return buyerNick;
  }

  public void setBuyerNick(String buyerNick) {
    this.buyerNick = buyerNick;
  }

  public Long getBuyerObtainPointFee() {
    return buyerObtainPointFee;
  }

  public void setBuyerObtainPointFee(Long buyerObtainPointFee) {
    this.buyerObtainPointFee = buyerObtainPointFee;
  }

  public BigDecimal getCodFee() {
    return codFee;
  }

  public void setCodFee(BigDecimal codFee) {
    this.codFee = codFee;
  }

  public String getCodStatus() {
    return codStatus;
  }

  public void setCodStatus(String codStatus) {
    this.codStatus = codStatus;
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

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public Date getModified() {
    return modified;
  }

  public void setModified(Date modified) {
    this.modified = modified;
  }

  public BigDecimal getPayment() {
    return payment;
  }

  public void setPayment(BigDecimal payment) {
    this.payment = payment;
  }

  public Date getPayTime() {
    return payTime;
  }

  public void setPayTime(Date payTime) {
    this.payTime = payTime;
  }

  public Long getPointFee() {
    return pointFee;
  }

  public void setPointFee(Long pointFee) {
    this.pointFee = pointFee;
  }

  public BigDecimal getPostFee() {
    return postFee;
  }

  public void setPostFee(BigDecimal postFee) {
    this.postFee = postFee;
  }

  public Long getRealPointFee() {
    return realPointFee;
  }

  public void setRealPointFee(Long realPointFee) {
    this.realPointFee = realPointFee;
  }

  public BigDecimal getReceivedPayment() {
    return receivedPayment;
  }

  public void setReceivedPayment(BigDecimal receivedPayment) {
    this.receivedPayment = receivedPayment;
  }

  public String getReceiverAddress() {
    return receiverAddress;
  }

  public void setReceiverAddress(String receiverAddress) {
    this.receiverAddress = receiverAddress;
  }

  public String getReceiverCity() {
    return receiverCity;
  }

  public void setReceiverCity(String receiverCity) {
    this.receiverCity = receiverCity;
  }

  public String getReceiverDistrict() {
    return receiverDistrict;
  }

  public void setReceiverDistrict(String receiverDistrict) {
    this.receiverDistrict = receiverDistrict;
  }

  public String getReceiverMobile() {
    return receiverMobile;
  }

  public void setReceiverMobile(String receiverMobile) {
    this.receiverMobile = receiverMobile;
  }

  public String getReceiverName() {
    return receiverName;
  }

  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }

  public String getReceiverState() {
    return receiverState;
  }

  public void setReceiverState(String receiverState) {
    this.receiverState = receiverState;
  }

  public String getReceiverTown() {
    return receiverTown;
  }

  public void setReceiverTown(String receiverTown) {
    this.receiverTown = receiverTown;
  }

  public String getReceiverZip() {
    return receiverZip;
  }

  public void setReceiverZip(String receiverZip) {
    this.receiverZip = receiverZip;
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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getTid() {
    return tid;
  }

  public void setTid(long tid) {
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

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
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

  public void addTmallOrder(TmallOrder tmallOrder) {
    this.tmallOrders.add(tmallOrder);
  }

  public void addTmallPromotion(TmallPromotion tmallPromotion) {
    this.tmallPromotions.add(tmallPromotion);
  }
  //</editor-fold>


}
