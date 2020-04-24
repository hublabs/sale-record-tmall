package sale;

import tmall.TmallOrder;
import tmall.TmallRefund;
import tmall.TmallTrade;
import utils.DataConnection;
import utils.ResourceUtil;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.*;

public class SaleRecordDtl {

  //<editor-fold desc="Field">
  private Long id;
  private Long saleRecordId;
  private Long orderItemId;
  private Long refundItemId;
  private Long brandId;
  private String brandCode;
  private Long productId;
  private Long skuId;
  private BigDecimal feeRate;
  private BigDecimal listPrice;
  private BigDecimal salePrice;
  private Integer quantity;
  private BigDecimal totalListPrice;
  private BigDecimal totalDiscountPrice;
  private BigDecimal totalPaymentPrice;

  private Long tid;
  private Long oid;
  private Long refundId;
  private Date tradeCreated;
  private Date receivedAt;

  private Date createdAt;
  //</editor-fold>

  //<editor-fold desc="Properties">
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getSaleRecordId() {
    return saleRecordId;
  }

  public void setSaleRecordId(Long saleRecordId) {
    this.saleRecordId = saleRecordId;
  }

  public Long getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
  }

  public Long getRefundItemId() {
    return refundItemId;
  }

  public void setRefundItemId(Long refundItemId) {
    this.refundItemId = refundItemId;
  }

  public Long getBrandId() {
    return brandId;
  }

  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }

  public String getBrandCode() {
    return brandCode;
  }

  public void setBrandCode(String brandCode) {
    this.brandCode = brandCode;
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }

  public BigDecimal getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(BigDecimal feeRate) {
    this.feeRate = feeRate;
  }

  public BigDecimal getListPrice() {
    return listPrice;
  }

  public void setListPrice(BigDecimal listPrice) {
    this.listPrice = listPrice;
  }

  public BigDecimal getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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

  public Date getTradeCreated() {
    return tradeCreated;
  }

  public void setTradeCreated(Date tradeCreated) {
    this.tradeCreated = tradeCreated;
  }

  public Date getReceivedAt() {
    return receivedAt;
  }

  public void setReceivedAt(Date receivedAt) {
    this.receivedAt = receivedAt;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
  //</editor-fold>

  //<editor-fold desc="QUERY">
  String QUERY_INSERT_SALE_RECORD_DTL = "insert into sale_record_dtls (\n" +
      "sale_record_id,\n" +
      "order_item_id,\n" +
      "refund_item_id,\n" +
      "brand_id,\n" +
      "brand_code,\n" +
      "product_id,\n" +
      "sku_id,\n" +
      "fee_rate,\n" +
      "list_price,\n" +
      "sale_price,\n" +
      "quantity,\n" +
      "total_list_price,\n" +
      "total_discount_price,\n" +
      "total_payment_price,\n" +
      "tid,\n" +
      "oid,\n" +
      "refund_id,\n" +
      "trade_created,\n" +
      "received_at,\n" +
      "created_at )\n" +
      "values (\n" +
      "?,?,?,?,?,\n" +
      "?,?,?,?,?,\n" +
      "?,?,?,?,?,\n" +
      "?,?,?,?,?\n" +
      ");";
  //</editor-fold>

  public static SaleRecordDtl transfer(ResultSet rs) throws Exception {
    if (rs == null) {
      return null;
    }
    SaleRecordDtl saleRecordDtl = new SaleRecordDtl();
    saleRecordDtl.setId(rs.getLong("b.id"));
    saleRecordDtl.setSaleRecordId(rs.getLong("b.sale_record_id"));
    saleRecordDtl.setOrderItemId(rs.getLong("b.order_item_id"));
    saleRecordDtl.setRefundItemId(rs.getLong("b.refund_item_id"));
    if (rs.wasNull()) {
      saleRecordDtl.setRefundItemId(null);
    }
    saleRecordDtl.setBrandId(rs.getLong("b.brand_id"));
    saleRecordDtl.setBrandCode(rs.getString("b.brand_code"));
    saleRecordDtl.setProductId(rs.getLong("b.product_id"));
    saleRecordDtl.setSkuId(rs.getLong("b.sku_id"));
    saleRecordDtl.setFeeRate(rs.getBigDecimal("b.fee_rate"));
    saleRecordDtl.setListPrice(rs.getBigDecimal("b.list_price"));
    saleRecordDtl.setSalePrice(rs.getBigDecimal("b.sale_price"));
    saleRecordDtl.setQuantity(rs.getInt("b.quantity"));
    saleRecordDtl.setTotalListPrice(rs.getBigDecimal("b.total_list_price"));
    saleRecordDtl.setTotalDiscountPrice(rs.getBigDecimal("b.total_discount_price"));
    saleRecordDtl.setTotalPaymentPrice(rs.getBigDecimal("b.total_payment_price"));
    saleRecordDtl.setTid(rs.getLong("b.tid"));
    saleRecordDtl.setOid(rs.getLong("b.oid"));
    saleRecordDtl.setRefundId(rs.getLong("b.refund_id"));
    if (rs.wasNull()) {
      saleRecordDtl.setRefundId(null);
    }
    saleRecordDtl.setTradeCreated(rs.getTimestamp("b.trade_created"));
    saleRecordDtl.setReceivedAt(rs.getTimestamp("b.received_at"));
    saleRecordDtl.setCreatedAt(rs.getTimestamp("b.created_at"));

    return saleRecordDtl;
  }

  public static SaleRecordDtl generate(TmallOrder tmallOrder) throws Exception {
    if (tmallOrder == null) {
      return null;
    }
    BigDecimal listPrice = tmallOrder.getPrice();
    BigDecimal salePrice = tmallOrder.getPrice();
    Integer quantity = tmallOrder.getNum();
    BigDecimal adjustFee = tmallOrder.getAdjustFee() == null ? BigDecimal.ZERO : tmallOrder.getAdjustFee();
    BigDecimal partMjzDiccount = tmallOrder.getPartMjzDiscount() == null ? BigDecimal.ZERO : tmallOrder.getPartMjzDiscount();
    BigDecimal totalDiscountPrice = adjustFee.add(tmallOrder.getDiscountFee()).add(partMjzDiccount);
    BigDecimal totalListPrice = listPrice.multiply(new BigDecimal(quantity));
    BigDecimal totalPayment = totalListPrice.subtract(totalDiscountPrice);

    SaleRecordDtl saleRecordDtl = new SaleRecordDtl();
    //TODO: 需要在salerecord业务了解后进行
    saleRecordDtl.setSaleRecordId(null);
    saleRecordDtl.setOrderItemId(null);
    saleRecordDtl.setRefundItemId(null);
    saleRecordDtl.setBrandId(null);
    saleRecordDtl.setBrandCode(null);
    saleRecordDtl.setProductId(null);
    saleRecordDtl.setSkuId(null);
    saleRecordDtl.setFeeRate(null);

    saleRecordDtl.setListPrice(listPrice);
    saleRecordDtl.setSalePrice(salePrice);
    saleRecordDtl.setQuantity(quantity);
    saleRecordDtl.setTotalListPrice(totalListPrice);
    saleRecordDtl.setTotalDiscountPrice(totalDiscountPrice);
    saleRecordDtl.setTotalPaymentPrice(totalPayment);

    saleRecordDtl.setTid(tmallOrder.getTid());
    saleRecordDtl.setOid(tmallOrder.getOid());
    saleRecordDtl.setTradeCreated(tmallOrder.getCreated());
    saleRecordDtl.setReceivedAt(tmallOrder.getEndTime());

    return saleRecordDtl;
  }

  public static SaleRecordDtl transToRefundSale(List<SaleRecordDtl> lastSaleDtlList, TmallRefund tmallRefund) {
    return null;
  }

  public static SaleRecordDtl transToRefundSale(SaleRecordDtl saleDtl, TmallRefund tmallRefund) {
    if (saleDtl == null) {
      return null;
    }
    BigDecimal MINUS_ONE = new BigDecimal(-1);
    SaleRecordDtl refundSaleDtl = new SaleRecordDtl();
    //TODO: 需要在salerecord业务了解后进行
    refundSaleDtl.setSaleRecordId(null);
    refundSaleDtl.setOrderItemId(null);
    refundSaleDtl.setRefundItemId(null);
    refundSaleDtl.setBrandId(null);
    refundSaleDtl.setBrandCode(null);
    refundSaleDtl.setProductId(null);
    refundSaleDtl.setSkuId(null);
    refundSaleDtl.setFeeRate(null);

    refundSaleDtl.setListPrice(saleDtl.getListPrice());
    refundSaleDtl.setSalePrice(saleDtl.getSalePrice());
    refundSaleDtl.setQuantity(saleDtl.getQuantity() * -1);
    refundSaleDtl.setTotalListPrice(saleDtl.getTotalListPrice());
    refundSaleDtl.setTotalDiscountPrice(saleDtl.getTotalDiscountPrice().multiply(MINUS_ONE));
    refundSaleDtl.setTotalPaymentPrice(saleDtl.getTotalPaymentPrice().multiply(MINUS_ONE));

    refundSaleDtl.setTid(tmallRefund.getTid());
    refundSaleDtl.setOid(tmallRefund.getOid());
    refundSaleDtl.setTradeCreated(saleDtl.getTradeCreated());
    refundSaleDtl.setReceivedAt(tmallRefund.getEndTime());
    return refundSaleDtl;
  }

  //TODO: find oid from saleRecordDtl by tid
  public static Map<Long, Boolean> findOidMap(long tid) throws Exception {
    Map<Long, Boolean> oidMap = new HashMap<>();

    return oidMap;
  }

  //TODO: fetch sale record dtl by oid
  public static List<SaleRecordDtl> findByOid(Long oid) throws Exception {
    List<SaleRecordDtl> saleDtlList = new ArrayList<>();

    return saleDtlList;
  }

  static PreparedStatement saleRecordDtlPstmt = null;

  public void save() throws Exception {
    if (saleRecordDtlPstmt == null) {
      saleRecordDtlPstmt = DataConnection.getInstance().getAppConn().prepareStatement(QUERY_INSERT_SALE_RECORD_DTL);
      DataConnection.getInstance().addPreparedStmt(saleRecordDtlPstmt);
    }
    SaleRecordDtl.setInsertPstmt(this, saleRecordDtlPstmt);
    saleRecordDtlPstmt.executeUpdate();
  }

  private static void setInsertPstmt(SaleRecordDtl saleRecordDtl, PreparedStatement pstmt) throws Exception {
    int index = 1;
    pstmt.setLong(index++, saleRecordDtl.getSaleRecordId());
    pstmt.setObject(index++, saleRecordDtl.getOrderItemId());
    pstmt.setObject(index++, saleRecordDtl.getRefundItemId());
    pstmt.setObject(index++, saleRecordDtl.getBrandId());
    pstmt.setString(index++, saleRecordDtl.getBrandCode());
    pstmt.setObject(index++, saleRecordDtl.getProductId());
    pstmt.setObject(index++, saleRecordDtl.getSkuId());
    pstmt.setBigDecimal(index++, saleRecordDtl.getFeeRate());
    pstmt.setBigDecimal(index++, saleRecordDtl.getListPrice());
    pstmt.setBigDecimal(index++, saleRecordDtl.getSalePrice());
    pstmt.setInt(index++, saleRecordDtl.getQuantity());
    pstmt.setBigDecimal(index++, saleRecordDtl.getTotalListPrice());
    pstmt.setBigDecimal(index++, saleRecordDtl.getTotalDiscountPrice());
    pstmt.setBigDecimal(index++, saleRecordDtl.getTotalPaymentPrice());
    pstmt.setLong(index++, saleRecordDtl.getTid());
    pstmt.setLong(index++, saleRecordDtl.getOid());
    pstmt.setObject(index++, saleRecordDtl.getRefundId());
    pstmt.setTimestamp(index++, new Timestamp(saleRecordDtl.getTradeCreated().getTime()));
    pstmt.setTimestamp(index++, saleRecordDtl.getReceivedAt() == null ? null : new Timestamp(saleRecordDtl.getReceivedAt().getTime()));
    pstmt.setTimestamp(index++, new Timestamp(System.currentTimeMillis()));
  }
}
