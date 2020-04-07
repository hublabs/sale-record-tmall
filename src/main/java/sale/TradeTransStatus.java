package sale;

public enum TradeTransStatus {
  S1("All completed."),
  S4("Canceled trade."),
  N("Not All completed."),
  E0("system error.");
  private String transMsg;

  TradeTransStatus(String transMsg) {
    this.transMsg = transMsg;
  }

  public String getTransMsg() {
    return this.transMsg;
  }
}
