class Order {
  private String itemName;
  private int priceInCents;
  private String discountCode;

  public Order(String itemName, int priceInCents) {
    this.itemName = itemName;
    this.priceInCents = priceInCents;
  }

  public String getItemName() {
    return itemName;
  }

  public int getPriceInCents() {
    return priceInCents;
  }

  public String getDiscountCode() {
    return discountCode;
  }

  // create a new private method named normalizeDiscountCode
  // take the discount code that is passed into the method
  private String normalizeDiscountCode(String discountCode) {
    // return the uppercase version
    return discountCode.toUpperCase();
  }

  public void applyDiscountCode(String discountCode) {
    // Call it from the current applyDiscountCode method and set this.discountCode to the result
    this.discountCode = normalizeDiscountCode(discountCode);
  }

}

// task 1
// create a new private method named normalizeDiscountCode. 
// it should take the discount code that is passed into the method and return the uppercase version.
// Call it from the current applyDiscountCode method and set this.discountCode to the result.

// task 2