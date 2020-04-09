package sale;

public enum OrderTransStatus {
  DONE_SUCCESS("success"),
  DONE_EXIST("already exists"),
  DONE_CANCEL_ORDER("canceled order"),
  DONE_CANCEL_REFUND("canceled refund."),
  WAIT_CONSIGN("wait consign"),
  ERR_NO_SALE("no origin sale"),
  ERR_NO_ORDER("no origin order.");
  private String transStatus;
  private String transMsg;
  OrderTransStatus(
      String transMsg){
    this.transMsg = transMsg;
  }

  public String getTransMsg() {
    return transMsg;
  }
}
