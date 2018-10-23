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
    // verify that only letters or the $ character are used
    for (char isAcceptable: discountCode.toCharArray()) {
      if (! Character.isLetter(isAcceptable) && isAcceptable != '$') {
        // If any other character is used, throw a IllegalArgumentException with the message Invalid discount code
        throw new IllegalArgumentException("Invalid discount code");
      }
    }
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
// In the normalizeDiscountCode verify that only letters or the $ character are used. 
// If any other character is used, throw a IllegalArgumentException with the message Invalid discount code.
// notes: 
// read the String into a char array 
// use enhanced For loop to iterate over the array testing if each character meets the conditions 
// use || for Or test 