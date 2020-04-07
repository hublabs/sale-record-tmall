package masterdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlineShop {
  //<editor-fold desc="Fields">
  private long id;
  private String tenantCode;
  private String channelCode;//TB,TM,JD,VIP
  private String shopCode;
  private String shopName;
  private String shopFullName;
  private String mainBrandCode;
  private String shopLogo;
  private Date openDate;
  private Date closeDate;
  private boolean active;
  private boolean activeTransSale;
  private boolean activeSendSale;
  private boolean activeSendPay;
  private Date createdAt;

  public static List<OnlineShop> find(boolean onlyActive, boolean onlyGenerateSale) {
    List<OnlineShop> shopList = new ArrayList<>();
    //TODO: 다음 스프린트에서 작성
    OnlineShop onlineShop = new OnlineShop();
    onlineShop.setShopCode("T001");
    shopList.add(onlineShop);
    return shopList;
  }
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

  public String getChannelCode() {
    return channelCode;
  }

  public void setChannelCode(String channelCode) {
    this.channelCode = channelCode;
  }

  public String getShopCode() {
    return shopCode;
  }

  public void setShopCode(String shopCode) {
    this.shopCode = shopCode;
  }

  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public String getShopFullName() {
    return shopFullName;
  }

  public void setShopFullName(String shopFullName) {
    this.shopFullName = shopFullName;
  }

  public String getMainBrandCode() {
    return mainBrandCode;
  }

  public void setMainBrandCode(String mainBrandCode) {
    this.mainBrandCode = mainBrandCode;
  }

  public String getShopLogo() {
    return shopLogo;
  }

  public void setShopLogo(String shopLogo) {
    this.shopLogo = shopLogo;
  }

  public Date getOpenDate() {
    return openDate;
  }

  public void setOpenDate(Date openDate) {
    this.openDate = openDate;
  }

  public Date getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(Date closeDate) {
    this.closeDate = closeDate;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public boolean isActiveransSale() {
    return activeTransSale;
  }

  public void setActiveransSale(boolean activeransSale) {
    this.activeTransSale = activeransSale;
  }

  public boolean isActiveSendSale() {
    return activeSendSale;
  }

  public void setActiveSendSale(boolean activeSendSale) {
    this.activeSendSale = activeSendSale;
  }

  public boolean isActiveSendPay() {
    return activeSendPay;
  }

  public void setActiveSendPay(boolean activeSendPay) {
    this.activeSendPay = activeSendPay;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  //</editor-fold>
}
