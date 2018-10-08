class Example {

  public static void main(String[] args) {
    GoKart kart = new GoKart("purple");
    if (kart.isBatteryEmpty()) {
      System.out.println("The battery is empty");
    }

    try {
    	kart.drive(42);
    } catch (IllegalArgumentException iae) {
    	System.out.printf("%s %n", iae.getMessage());
    }
    
  }

}