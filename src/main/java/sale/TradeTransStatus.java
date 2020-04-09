package sale;

public enum TradeTransStatus {
  DONE_SUCCESS_TRADE("trade success."),
  DONE_CANCEL_TRADE("trade canceled."),
  WAIT("wait consign."),
  ERR_SYS("system error.");
  private String transMsg;

  TradeTransStatus(String transMsg) {
    this.transMsg = transMsg;
  }

  public String getTransMsg() {
    return this.transMsg;
  }
}
