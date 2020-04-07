package sale;

import tmall.TmallTrade;

import java.math.BigDecimal;
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
  //</editor-fold>

  public static SaleRecord generate(List<SaleRecordDtl> saleRecordDtlList, TmallTrade tmallTrade) throws Exception {
    if(saleRecordDtlList == null || saleRecordDtlList.size() == 0) {
      return null;
    }
    BigDecimal totalListPrice = BigDecimal.ZERO;
    BigDecimal totalDiscountFee = BigDecimal.ZERO;
    BigDecimal totalPayment = BigDecimal.ZERO;
    for(SaleRecordDtl eachSaleDtl: saleRecordDtlList) {
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

  //TODO: 在下一个迭代进行
  public void save() throws Exception {

  }
}
