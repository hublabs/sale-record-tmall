package tmall;

import java.math.BigDecimal;
import java.util.Date;

public class TmallPromotion {
  //<editor-fold desc="Fields">
  private Long id;
  private String shopCode;
  private Long tid;
  private Long oid;
  private String promotionId;
  private String promotionName;
  private String promotionDesc;
  private BigDecimal discountFee;
  private Date tradeCreated;
  private Date createdAt;
  //</editor-fold>

  //<editor-fold desc="Properties">
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  public String getPromotionName() {
    return promotionName;
  }

  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }

  public String getPromotionDesc() {
    return promotionDesc;
  }

  public void setPromotionDesc(String promotionDesc) {
    this.promotionDesc = promotionDesc;
  }

  public BigDecimal getDiscountFee() {
    return discountFee;
  }

  public void setDiscountFee(BigDecimal discountFee) {
    this.discountFee = discountFee;
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
  //</editor-fold>

}
