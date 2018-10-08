class GoKart {
	private String color;

	public static final int MAX_BARS = 8;
	private int barCount;
	private int lapsDriven;

	public GoKart(String color) {
		this.color = color;
	}

	public void charge() {
		barCount = MAX_BARS;
	}

	public void drive (int lapsToDrive) {
		if (laps > barCount) {
      		throw new IllegalArgumentException("Not enough charge for that many laps");
    	} 
		lapsDriven += lapsToDrive;
		barCount -= lapsToDrive;
	}

	// Create a new method named drive that accepts no arguments. 
	// It should call the newer drive method passing in a 1 for the default.
	public void drive() {
		drive(1);
	}

	public boolean isBatteryEmpty() {
		return barCount == 0;
	}

	public boolean isFullyCharged() {
		return barCount == MAX_BARS;
	}

	public String getColor() {
		return color;
	}
}