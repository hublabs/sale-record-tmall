package sale;

public enum OrderTransStatus {
  S1("Success"),
  S2("Already exists"),
  S3("freight fee"),
  S4("Canceled order"),
  S5(""),
  S6("Canceled refund."),
  S7("Less than base date."),
  S8("ex change sku"),
  S9("refund lucky money"),
  N("To be delivery order"),
  E00("System Error"),
  E01("Can't find product code"),
  E02("Can't find ean code"),
  E03("Can't find brand code"),
  E04("Can't find shop code"),
  E05("Can't find shop margin"),
  E06("Can't find sale event"),
  E07("outer sku is null"),
  E08("outer sku is fudai"),
  E09("outer sku is 0000000000");
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
