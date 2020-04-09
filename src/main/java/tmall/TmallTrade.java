package tmall;

import sale.TradeTransStatus;
import utils.DataConnection;

import java.math.BigDecimal;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

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

  public List<TmallOrder> getTmallOrders() {
    return tmallOrders;
  }

  public void addTmallPromotion(TmallPromotion tmallPromotion) {
    this.tmallPromotions.add(tmallPromotion);
  }
  //</editor-fold>

  //<editor-fold desc="QUERY">
  private static String QUERY_INSERT_TRADE = "insert into tmall_trades ( \n" +
      "tenant_code, \n" +
      "shop_code, \n" +
      "adjust_fee, \n" +
      "alipay_id, \n" +
      "alipay_no, \n" +
      "buyer_nick, \n" +
      "buyer_obtain_point_fee, \n" +
      "cod_fee, \n" +
      "cod_status, \n" +
      "consign_time, \n" +
      "created, \n" +
      "discount_fee, \n" +
      "end_time, \n" +
      "modified, \n" +
      "pay_time, \n" +
      "payment, \n" +
      "point_fee, \n" +
      "post_fee, \n" +
      "real_point_fee, \n" +
      "received_payment, \n" +
      "receiver_address, \n" +
      "receiver_city, \n" +
      "receiver_district, \n" +
      "receiver_mobile, \n" +
      "receiver_name, \n" +
      "receiver_state, \n" +
      "receiver_town, \n" +
      "receiver_zip, \n" +
      "seller_nick, \n" +
      "shipping_type, \n" +
      "sid, \n" +
      "status, \n" +
      "tid, \n" +
      "title, \n" +
      "total_fee, \n" +
      "type, \n" +
      "updated_at," +
      "trans_status) \n" +
      "values ( \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,?,?, \n" +
      "?,?,?); ";

  private static String QUERY_INSERT_ORDER = "insert into tmall_orders ( \n" +
      "tenant_code, \n" +
      "tmall_trade_id, \n" +
      "shop_code, \n" +
      "tid, \n" +
      "adjust_fee, \n" +
      "buyer_rate, \n" +
      "cid, \n" +
      "consign_time, \n" +
      "created, \n" +
      "discount_fee, \n" +
      "divide_order_fee, \n" +
      "end_time, \n" +
      "invoice_no, \n" +
      "is_daixiao, \n" +
      "logistics_company, \n" +
      "num, \n" +
      "num_iid, \n" +
      "oid, \n" +
      "outer_iid, \n" +
      "outer_sku_id, \n" +
      "part_mjz_discount, \n" +
      "payment, \n" +
      "pic_path, \n" +
      "price, \n" +
      "refund_id, \n" +
      "refund_status, \n" +
      "seller_rate, \n" +
      "seller_type, \n" +
      "shipping_type, \n" +
      "sku_id, \n" +
      "sku_properties_name, \n" +
      "status, \n" +
      "title, \n" +
      "total_fee ) \n" +
      "values ( \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,?,?, \n" +
      "?,?,?,? \n" +
      ") ";
  private static String QUERY_UPDATE_TRADE = "update tmall_trades\n" +
      "set adjust_fee=?, \n" +
      "alipay_id=?, \n" +
      "alipay_no=?, \n" +
      "buyer_obtain_point_fee=?, \n" +
      "cod_fee=?, \n" +
      "cod_status=?, \n" +
      "consign_time=?, \n" +
      "created=?, \n" +
      "discount_fee=?, \n" +
      "end_time=?, \n" +
      "modified=?, \n" +
      "pay_time=?, \n" +
      "payment=?, \n" +
      "point_fee=?, \n" +
      "post_fee=?, \n" +
      "real_point_fee=?, \n" +
      "received_payment=?, \n" +
      "shipping_type=?, \n" +
      "sid=?, \n" +
      "status=?, \n" +
      "total_fee=?, \n" +
      "updated_at=?, \n" +
      "trans_status=? \n" +
      "where tenant_code=? \n" +
      "and shop_code=? \n" +
      "and tid=? ";
  private static String QUERY_UPDATE_ORDER = "update tmall_orders \n" +
      "set adjust_fee=?, \n" +
      "buyer_rate=?, \n" +
      "consign_time=?, \n" +
      "end_time=?, \n" +
      "invoice_no=?, \n" +
      "logistics_company=?, \n" +
      "outer_iid=?, \n" +
      "outer_sku_id=?,\n" +
      "payment=?, \n" +
      "refund_id=?, \n" +
      "refund_status=?, \n" +
      "seller_rate=?, \n" +
      "seller_type=?, \n" +
      "shipping_type=?, \n" +
      "status=? \n" +
      "where tenant_code=? \n" +
      "and shop_code=? \n" +
      "and oid=? ";
  //</editor-fold>

  public static TmallTrade transfer(ResultSet rs) throws Exception {
    if(rs == null) {
      return null;
    }
    Map<String, Integer> columnMap = DataConnection.fetchColumnMap(rs);
    TmallTrade tmallTrade = new TmallTrade();
    tmallTrade.setId(rs.getLong("a.id"));
    tmallTrade.setTenantCode(rs.getString("a.tenant_code"));
    tmallTrade.setShopCode(rs.getString("a.shop_code"));
    tmallTrade.setAdjustFee(rs.getBigDecimal("a.adjust_fee"));
    tmallTrade.setAlipayId(rs.getLong("a.alipay_id"));
    tmallTrade.setAlipayNo(rs.getString("a.alipay_no"));
    tmallTrade.setBuyerNick(rs.getString("a.buyer_nick"));
    tmallTrade.setBuyerObtainPointFee(rs.getLong("a.buyer_obtain_point_fee"));
    tmallTrade.setCodFee(rs.getBigDecimal("a.cod_fee"));
    tmallTrade.setCodStatus(rs.getString("a.cod_status"));
    tmallTrade.setConsignTime(rs.getTimestamp("a.consign_time"));
    tmallTrade.setCreated(rs.getTimestamp("a.created"));
    tmallTrade.setDiscountFee(rs.getBigDecimal("a.discount_fee"));
    tmallTrade.setEndTime(rs.getTimestamp("a.end_time"));
    tmallTrade.setModified(rs.getTimestamp("a.modified"));
    tmallTrade.setPayment(rs.getBigDecimal("a.payment"));
    tmallTrade.setPayTime(rs.getTimestamp("a.pay_time"));
    tmallTrade.setPointFee(rs.getLong("a.point_fee"));
    tmallTrade.setPostFee(rs.getBigDecimal("a.post_fee"));
    tmallTrade.setRealPointFee(rs.getLong("a.real_point_fee"));
    tmallTrade.setReceivedPayment(rs.getBigDecimal("a.received_payment"));
    tmallTrade.setReceiverAddress(rs.getString("a.receiver_address"));
    tmallTrade.setReceiverCity(rs.getString("a.receiver_city"));
    tmallTrade.setReceiverDistrict(rs.getString("a.receiver_district"));
    tmallTrade.setReceiverMobile(rs.getString("a.receiver_mobile"));
    tmallTrade.setReceiverName(rs.getString("a.receiver_name"));
    tmallTrade.setReceiverState(rs.getString("a.receiver_state"));
    tmallTrade.setReceiverTown(rs.getString("a.receiver_town"));
    tmallTrade.setReceiverZip(rs.getString("a.receiver_zip"));
    tmallTrade.setSellerNick(rs.getString("a.seller_nick"));
    tmallTrade.setShippingType(rs.getString("a.shipping_type"));
    tmallTrade.setSid(rs.getString("a.sid"));
    tmallTrade.setStatus(rs.getString("a.status"));
    tmallTrade.setTid(rs.getLong("a.tid"));
    tmallTrade.setTitle(rs.getString("a.title"));
    tmallTrade.setTotalFee(rs.getBigDecimal("a.total_fee"));
    tmallTrade.setType(rs.getString("a.type"));
    tmallTrade.setUpdatedAt(rs.getTimestamp("a.updated_at"));
    if (columnMap.containsKey("trans_status")) {
      tmallTrade.setTransStatus(rs.getString("trans_status"));
    }
    if (columnMap.containsKey("trans_msg")) {
      tmallTrade.setTransMsg(rs.getString("trans_msg"));
    }if (columnMap.containsKey("trans_at")) {
      tmallTrade.setTransAt(rs.getTimestamp("trans_at"));
    }
    return tmallTrade;
  }

  public static List<TmallTrade> findReadyDataByShopAndPeriod(String tenantCode, String shopCode, Date fromDate, Date toDate, boolean onlyFailed, PeriodType periodType) throws Exception {
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    List<TmallTrade> tmallTradeList = new ArrayList<>();
    try {
      String query = "select a.*,b.* \n" +
          "from tmall_trades a ";
      //强制索引
      if (periodType == PeriodType.CREATED) {
        query += " FORCE INDEX (idx_tmall_trades_created_shop_trans_status) \n";
      } else if (periodType == PeriodType.MODIFIED) {
        query += " \n";
      } else {
        query += " FORCE INDEX (idx_tmall_trades_updatedat_shop_transstatus) \n";
      }
      query +=  "inner join tmall_orders b \n" +
          "on a.id = b.tmall_trade_id \n" +
          "where 1=1 \n" +
          "and a.shop_code = ? \n" +
          "";

      if (periodType == PeriodType.CREATED) {
        query += "and a.created between ? and ? \n";
      } else if (periodType == PeriodType.MODIFIED) {
        query += "and a.modified between ? and ? \n";
      } else {
        query += "and a.updated_at between ? and ? \n";
      }
      if (onlyFailed) {
        query += "and a.trans_status in ('N','E0') \n";
      } else {
        query += "and a.trans_status in ('') \n";
      }
      query += "order by a.id";
//      LOG.info("query: " + query + " \n shop:" + shopCode + "; period: " + DateUtil.toCsvField(fromDate) + "~" + DateUtil.toCsvField(toDate));
      pstmt = DataConnection.getInstance().getAppConn().prepareStatement(query);
      int index = 1;
      pstmt.setString(index++, shopCode);
      pstmt.setTimestamp(index++, new Timestamp(fromDate.getTime()));
      pstmt.setTimestamp(index++, new Timestamp(toDate.getTime()));
      rs = pstmt.executeQuery();
      long preTradeId = 0L;
      TmallTrade tmallTrade = null;
      while (rs.next()) {
        long tradeId = rs.getLong("a.id");
        if (preTradeId != tradeId) {
          tmallTrade = TmallTrade.transfer(rs);
          tmallTradeList.add(tmallTrade);
          preTradeId = tradeId;
        }
        TmallOrder tmallOrder = TmallOrder.transfer(rs);
        tmallTrade.addTmallOrder(tmallOrder);
      }
      return tmallTradeList;
    } finally {
      DataConnection.close(null, pstmt, rs);
    }
  }

  public static TmallTrade findOnlyTradeByTid(Long tid) throws Exception {
    Statement stmt = null;
    ResultSet rs = null;
    try {
      String query = "select a.* \n" +
          "from tmall_trades a \n" +
          "where a.tid=" + tid;
      stmt = DataConnection.getInstance().getAppConn().createStatement();
      rs = stmt.executeQuery(query);
      TmallTrade tmallTrade = null;
      if (rs.next()) {
        tmallTrade = TmallTrade.transfer(rs);
      }
      return tmallTrade;
    } finally {
      DataConnection.close(null, stmt, rs);
    }
  }

  static PreparedStatement pstmtInTrade;
  static PreparedStatement pstmtInOrder;
  static PreparedStatement pstmtUpTrade;
  static PreparedStatement pstmtUpOrder;

  public static void save(TmallTrade tmallTrade) throws Exception {
    List<TmallTrade> tmallTradeList = new ArrayList<>();
    save(tmallTrade.getTenantCode(), tmallTrade.getShopCode(), tmallTradeList);
  }
  public static void save(String tenantCode, String channelShopCode, List<TmallTrade> tradeList) throws Exception {
    if (tradeList == null || tradeList.isEmpty()) {
      return;
    }
    List<TmallTrade> inTradeList = new ArrayList<>();
    List<TmallTrade> upTradeList = new ArrayList<>();
    List<TmallPromotion> promotionList = new ArrayList<>();
    Map<Long, Date> existTradeMap = TmallTrade.fetchExistTradeMap(tenantCode, channelShopCode, tradeList);
    for (TmallTrade trade : tradeList) {

      //如果订单状态为"TRADE_FINISHED",但配送时间为空时不保存
      if ("TRADE_FINISHED".equals(trade.getStatus()) && trade.getConsignTime() == null) {
        continue;
      }
      if (existTradeMap.containsKey(trade.getTid())) {
        //如果该订单的修改日期比原来的小则不保存
        if (trade.getModified().compareTo(existTradeMap.get(trade.getTid())) >= 0) {
          upTradeList.add(trade);
        }
      } else {
        inTradeList.add(trade);
        if (trade.tmallPromotions != null && trade.tmallPromotions.size() > 0) {
          promotionList.addAll(trade.tmallPromotions);
        }
      }
    }
    if (upTradeList.isEmpty() && inTradeList.isEmpty()) {
      if (tradeList.size() > 0) {
//        LOG.info("all tade not consigned.");
      }
      return;
    }

    insert(tenantCode, channelShopCode, inTradeList);
    update(tenantCode, channelShopCode, upTradeList);
//    TmallPromotion.insert(promotionList);
  }

  private static Map<Long, Date> fetchExistTradeMap(String tenantCode, String channelShopCode, List<TmallTrade> tradeList) throws Exception {
    Map<Long, Date> tradeMap = new HashMap<>();
    if (tradeList == null || tradeList.isEmpty()) {
      return tradeMap;
    }
    String tidIn = "";
    String comma = "";
    for (TmallTrade trade : tradeList) {
      tidIn = String.format("%s%s%d", tidIn, comma, trade.getTid());
      comma = ",";
    }
    Statement stmt = null;
    ResultSet rs = null;
    try {
      String query = "select tid, modified \n" +
          "from tmall_trades \n" +
          "where tenant_code = '" + tenantCode + "' \n" +
          "and shop_code = '" + channelShopCode + "' \n" +
          "and tid in (" + tidIn + ");";
      stmt = DataConnection.getInstance().getAppConn().createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()) {
        tradeMap.put(rs.getLong("tid"), rs.getTimestamp("modified"));
      }

    } finally {
      DataConnection.close(null, stmt, rs);
    }
    return tradeMap;
  }

  public static TmallTrade findByTid(Long paramTid) throws Exception {
    Statement stmt = null;
    ResultSet rs = null;
    try {
      String query = "select a.*,b.* \n" +
          "from tmall_trades a \n" +
          "inner join tmall_orders b \n" +
          "on a.id = b.tmall_trade_id \n" +
          "where a.tid=" + paramTid;
      stmt = DataConnection.getInstance().getAppConn().createStatement();
      rs = stmt.executeQuery(query);
      Long before_id = null;
      Long before_tid = null;
      TmallTrade tmallTrade = null;
      while (rs.next()) {
        Long id = rs.getLong("a.id");
        Long tid = rs.getLong("a.tid");
        if (before_id != null && before_tid != null && !id.equals(before_id) && tid.compareTo(before_tid) == 0) {
          break;
        }
        if (!id.equals(before_id)) {
          tmallTrade = TmallTrade.transfer(rs);
          before_id = id;
          before_tid = tid;
        }
        TmallOrder tmallOrder = TmallOrder.transfer(rs);
        tmallTrade.addTmallOrder(tmallOrder);
      }
      return tmallTrade;
    } finally {
      DataConnection.close(null, stmt, rs);
    }
  }

  public static void insert(String tenantCode, String channelShopCode, List<TmallTrade> inTradeList) throws Exception {
    if (inTradeList == null || inTradeList.isEmpty()) {
      return;
    }
    ResultSet rs = null;
    int countTrade = 0;
    int countOrders = 0;

    int index = 1;
    int batchSize = 500;
    List<Long> generateTmallTradeIds = new ArrayList<>();
    try {
      if (pstmtInTrade == null) {
        pstmtInTrade = DataConnection.getInstance().getAppConn().prepareStatement(QUERY_INSERT_TRADE, Statement.RETURN_GENERATED_KEYS);
        DataConnection.getInstance().addPreparedStmt(pstmtInTrade);
      }
      if (pstmtInOrder == null) {
        pstmtInOrder = DataConnection.getInstance().getAppConn().prepareStatement(QUERY_INSERT_ORDER);
        DataConnection.getInstance().addPreparedStmt(pstmtInOrder);
      }
      for (TmallTrade trade : inTradeList) {
        countTrade++;
        //<editor-fold desc="set trade param">
        index = 1;
        pstmtInTrade.setString(index++, tenantCode);
        pstmtInTrade.setString(index++, channelShopCode);
        pstmtInTrade.setObject(index++, trade.getAdjustFee(), Types.DECIMAL);
        pstmtInTrade.setObject(index++, trade.getAlipayId(), Types.BIGINT);
        pstmtInTrade.setString(index++, trade.getAlipayNo());
        pstmtInTrade.setString(index++, trade.getBuyerNick());
        pstmtInTrade.setObject(index++, trade.getBuyerObtainPointFee(), Types.BIGINT);
        pstmtInTrade.setBigDecimal(index++, trade.getCodFee());
        pstmtInTrade.setString(index++, trade.getCodStatus());
        pstmtInTrade.setObject(index++, trade.getConsignTime() != null ? new Timestamp(trade.getConsignTime().getTime()) : null, Types.TIMESTAMP);
        pstmtInTrade.setObject(index++, new Timestamp(trade.getCreated().getTime()), Types.TIMESTAMP);
        pstmtInTrade.setObject(index++, trade.getDiscountFee(), Types.DECIMAL);
        pstmtInTrade.setObject(index++, trade.getEndTime() != null ? new Timestamp(trade.getEndTime().getTime()): null);
        pstmtInTrade.setObject(index++, new Timestamp(trade.getModified().getTime()), Types.TIMESTAMP);
        pstmtInTrade.setObject(index++, trade.getPayTime() != null ? new Timestamp(trade.getPayTime().getTime()) : null, Types.TIMESTAMP);
        pstmtInTrade.setObject(index++, trade.getPayment(), Types.DECIMAL);
        pstmtInTrade.setObject(index++, trade.getPointFee(), Types.BIGINT);
        pstmtInTrade.setObject(index++, trade.getPostFee(), Types.DECIMAL);
        pstmtInTrade.setObject(index++, trade.getRealPointFee(), Types.BIGINT);
        pstmtInTrade.setObject(index++, trade.getReceivedPayment(), Types.DECIMAL);//매장에서 배송한 시간
        pstmtInTrade.setString(index++, trade.getReceiverAddress());
        pstmtInTrade.setString(index++, trade.getReceiverCity());
        pstmtInTrade.setString(index++, trade.getReceiverDistrict());
        pstmtInTrade.setString(index++, trade.getReceiverMobile());
        pstmtInTrade.setString(index++, trade.getReceiverName());
        pstmtInTrade.setString(index++, trade.getReceiverState());
        pstmtInTrade.setString(index++, trade.getReceiverTown());
        pstmtInTrade.setString(index++, trade.getReceiverZip());
        pstmtInTrade.setString(index++, trade.getSellerNick());
        pstmtInTrade.setString(index++, trade.getShippingType());
        pstmtInTrade.setString(index++, trade.getSid());
        pstmtInTrade.setString(index++, trade.getStatus());
        pstmtInTrade.setObject(index++, trade.getTid(), Types.BIGINT);
        pstmtInTrade.setString(index++, trade.getTitle());
        pstmtInTrade.setObject(index++, trade.getTotalFee(), Types.DECIMAL);
        pstmtInTrade.setString(index++, trade.getType());
        pstmtInTrade.setTimestamp(index++, new Timestamp(System.currentTimeMillis()));
        pstmtInTrade.setString(index++, "");
        //</editor-fold>

        pstmtInTrade.addBatch();
        if (countTrade % batchSize == 0 || countTrade == inTradeList.size()) {
          int[] r = pstmtInTrade.executeBatch();
          rs = pstmtInTrade.getGeneratedKeys();

          while (rs.next()) {
            generateTmallTradeIds.add(rs.getLong(1));
          }
          pstmtInTrade.clearBatch();
          rs.close();
          rs = null;
        }

      }

      for (int i = 0; i < inTradeList.size(); i++) {
        TmallTrade eachTrade = inTradeList.get(i);
        if (eachTrade.getTmallOrders() == null || eachTrade.getTmallOrders().isEmpty()) {
          continue;
        }
        Long tmallTradeId = generateTmallTradeIds.get(i);
        for (TmallOrder order : eachTrade.getTmallOrders()) {
          countOrders++;
          //<editor-fold desc="set orders param">
          index = 1;
          pstmtInOrder.setString(index++, tenantCode);
          pstmtInOrder.setObject(index++, tmallTradeId, Types.BIGINT);
          pstmtInOrder.setString(index++, channelShopCode);
          pstmtInOrder.setObject(index++, eachTrade.getTid(), Types.BIGINT);
          pstmtInOrder.setObject(index++, order.getAdjustFee(), Types.DECIMAL);
          pstmtInOrder.setObject(index++, order.getBuyerRate(), Types.BIT);
          pstmtInOrder.setObject(index++, order.getCid(), Types.BIGINT);
          pstmtInOrder.setObject(index++, order.getConsignTime() != null ? new Timestamp(order.getConsignTime().getTime()) : null, Types.TIMESTAMP);
          pstmtInOrder.setObject(index++, order.getCreated());
          pstmtInOrder.setObject(index++, order.getDiscountFee(), Types.DECIMAL);
          pstmtInOrder.setObject(index++, order.getDivideOrderFee(), Types.DECIMAL);
          pstmtInOrder.setObject(index++, order.getEndTime() != null ? new Timestamp(order.getEndTime().getTime()) : null, Types.TIMESTAMP);
          pstmtInOrder.setString(index++, order.getInvoiceNo());
          pstmtInOrder.setObject(index++, order.getIsDaixiao(), Types.BIT);
          pstmtInOrder.setString(index++, order.getLogisticsCompany());
          pstmtInOrder.setObject(index++, order.getNum(), Types.BIGINT);
          pstmtInOrder.setObject(index++, order.getNumIid(), Types.BIGINT);
          pstmtInOrder.setObject(index++, order.getOid(), Types.BIGINT);
          pstmtInOrder.setString(index++, order.getOuterIid());
          pstmtInOrder.setString(index++, order.getOuterSkuId());
          pstmtInOrder.setObject(index++, order.getPartMjzDiscount(), Types.DECIMAL);
          pstmtInOrder.setObject(index++, order.getPayment(), Types.DECIMAL);
          pstmtInOrder.setString(index++, order.getPicPath());
          pstmtInOrder.setObject(index++, order.getPrice(), Types.DECIMAL);
          pstmtInOrder.setObject(index++, order.getRefundId(), Types.BIGINT);
          pstmtInOrder.setString(index++, order.getRefundStatus());
          pstmtInOrder.setObject(index++, order.getSellerRate(), Types.BIT);
          pstmtInOrder.setString(index++, order.getSellerType());
          pstmtInOrder.setString(index++, order.getShippingType());
          pstmtInOrder.setObject(index++, order.getSkuId(), Types.BIGINT);
          pstmtInOrder.setString(index++, order.getSkuPropertiesName());
          pstmtInOrder.setString(index++, order.getStatus());
          pstmtInOrder.setString(index++, order.getTitle());
          pstmtInOrder.setObject(index++, order.getTotalFee(), Types.DECIMAL);

          //</editor-fold>
          pstmtInOrder.addBatch();
          if (countOrders % batchSize == 0) {
            pstmtInOrder.executeBatch();
            pstmtInOrder.clearBatch();
          }
        }
      }
      if (countOrders % batchSize != 0) {
        pstmtInOrder.executeBatch();
        pstmtInOrder.clearBatch();
      }
    } finally {
      DataConnection.close(null, null, rs);
    }
  }

  public static void update(String tenantCode, String channelShopCode, List<TmallTrade> upTradeList) throws Exception {
    if (upTradeList == null || upTradeList.isEmpty()) {
      return;
    }
    int batchSize = 500;
    int index = 1;
    int countTrade = 0;
    int countOrder = 0;

    if (pstmtUpTrade == null) {
      pstmtUpTrade = DataConnection.getInstance().getAppConn().prepareStatement(QUERY_UPDATE_TRADE);
      DataConnection.getInstance().addPreparedStmt(pstmtUpTrade);
    }
    if (pstmtUpOrder == null) {
      pstmtUpOrder = DataConnection.getInstance().getAppConn().prepareStatement(QUERY_UPDATE_ORDER);
      DataConnection.getInstance().addPreparedStmt(pstmtUpOrder);
    }
    List<TmallOrder> orderList = new ArrayList<>();
    for (TmallTrade trade : upTradeList) {
      //<editor-fold desc="set trade param">
      countTrade++;
      index = 1;
      pstmtUpTrade.setObject(index++, trade.getAdjustFee(), Types.DECIMAL);
      pstmtUpTrade.setObject(index++, trade.getAlipayId(), Types.BIGINT);
      pstmtUpTrade.setString(index++, trade.getAlipayNo());
      pstmtUpTrade.setObject(index++, trade.getBuyerObtainPointFee(), Types.BIGINT);
      pstmtUpTrade.setObject(index++, trade.getCodFee(), Types.DECIMAL);
      pstmtUpTrade.setString(index++, trade.getCodStatus());
      pstmtUpTrade.setObject(index++, trade.getConsignTime() != null ? new Timestamp(trade.getConsignTime().getTime()) : null, Types.TIMESTAMP);
      pstmtUpTrade.setTimestamp(index++, new Timestamp(trade.getCreated().getTime()));
      pstmtUpTrade.setObject(index++, trade.getDiscountFee(), Types.DECIMAL);
      pstmtUpTrade.setObject(index++, trade.getEndTime() != null ? new Timestamp(trade.getEndTime().getTime()) : null);
      pstmtUpTrade.setObject(index++, new Timestamp(trade.getModified().getTime()), Types.TIMESTAMP);
      pstmtUpTrade.setObject(index++, trade.getPayTime() != null ? new Timestamp(trade.getPayTime().getTime()) : null, Types.TIMESTAMP);
      pstmtUpTrade.setObject(index++, trade.getPayment(), Types.DECIMAL);
      pstmtUpTrade.setObject(index++, trade.getPointFee(), Types.BIGINT);
      pstmtUpTrade.setObject(index++, trade.getPostFee(), Types.DECIMAL);
      pstmtUpTrade.setObject(index++, trade.getRealPointFee(), Types.BIGINT);
      pstmtUpTrade.setObject(index++, trade.getReceivedPayment(), Types.DECIMAL);
      pstmtUpTrade.setString(index++, trade.getShippingType());
      pstmtUpTrade.setString(index++, trade.getSid());
      pstmtUpTrade.setString(index++, trade.getStatus());
      pstmtUpTrade.setObject(index++, trade.getTotalFee(), Types.DECIMAL);
      pstmtUpTrade.setTimestamp(index++, new Timestamp(System.currentTimeMillis()));
      pstmtUpTrade.setString(index++, "");
      pstmtUpTrade.setString(index++, tenantCode);
      pstmtUpTrade.setString(index++, channelShopCode);
      pstmtUpTrade.setLong(index++, trade.getTid());
      //</editor-fold>
      if (trade.getTmallOrders() != null) {
        orderList.addAll(trade.getTmallOrders());
      }
      pstmtUpTrade.addBatch();
      if (countTrade % batchSize == 0 || countTrade == upTradeList.size()) {
        pstmtUpTrade.executeBatch();
        pstmtUpTrade.clearBatch();
      }
    }

    for (TmallOrder eachOrder : orderList) {
      countOrder++;
      index = 1;

      //<editor-fold desc="set order param">
      pstmtUpOrder.setObject(index++, eachOrder.getAdjustFee(), Types.DECIMAL);
      pstmtUpOrder.setObject(index++, eachOrder.getBuyerRate(), Types.BIT);
      pstmtUpOrder.setTimestamp(index++, eachOrder.getConsignTime() != null ? new Timestamp(eachOrder.getConsignTime().getTime()) : null);
      pstmtUpOrder.setObject(index++, eachOrder.getEndTime() != null ? new Timestamp(eachOrder.getEndTime().getTime()) : null, Types.TIMESTAMP);
      pstmtUpOrder.setString(index++, eachOrder.getInvoiceNo());
      pstmtUpOrder.setString(index++, eachOrder.getLogisticsCompany());
      pstmtUpOrder.setString(index++, eachOrder.getOuterIid());
      pstmtUpOrder.setString(index++, eachOrder.getOuterSkuId());
      pstmtUpOrder.setObject(index++, eachOrder.getPayment(), Types.DECIMAL);
      pstmtUpOrder.setObject(index++, eachOrder.getRefundId(), Types.BIGINT);
      pstmtUpOrder.setString(index++, eachOrder.getRefundStatus());
      pstmtUpOrder.setObject(index++, eachOrder.getSellerRate(), Types.BIT);
      pstmtUpOrder.setString(index++, eachOrder.getSellerType());
      pstmtUpOrder.setString(index++, eachOrder.getShippingType());
      pstmtUpOrder.setString(index++, eachOrder.getStatus());
      pstmtUpOrder.setString(index++, tenantCode);
      pstmtUpOrder.setString(index++, channelShopCode);
      pstmtUpOrder.setLong(index++, eachOrder.getOid());
      //</editor-fold>

      pstmtUpOrder.addBatch();

      if (countOrder % batchSize == 0 || countOrder == orderList.size()) {
        pstmtUpOrder.executeBatch();
        pstmtUpOrder.clearBatch();
      }
    }
  }

  public void updateTransStatus(TradeTransStatus tradeTransStatus) throws Exception {
    updateTransStatus(tradeTransStatus, null);
  }

  public void updateTransStatus(TradeTransStatus tradeTransStatus, String detailMsg) throws Exception {
    String sql = "update tmall_trades \n" +
        "set trans_status = ?, \n" +
        "trans_msg = ?, \n" +
        "trans_at = ? \n" +
        "where id=?";
    PreparedStatement stmt = null;
    try {
      stmt = DataConnection.getInstance().getAppConn().prepareStatement(sql);
      Date nowDate = new Date();
      int index = 1;
      stmt.setString(index++, tradeTransStatus.name());
      stmt.setString(index++, tradeTransStatus == TradeTransStatus.E0 ? detailMsg : tradeTransStatus.getTransMsg());
      stmt.setObject(index++, new Timestamp(nowDate.getTime()), Types.TIMESTAMP);
      stmt.setLong(index++, this.getId());
      stmt.executeUpdate();
    } finally {
      DataConnection.close(null, stmt, null);
    }
  }
}
