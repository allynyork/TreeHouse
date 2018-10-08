class PezDispenser {
	// constant
	 public static final int MAX_PEZ = 12;
	// member variables
	 final private String characterName;
	 private int pezCount;


	 // constructor
	 public PezDispenser(String characterName) {
	 	this.characterName = characterName;
	 	pezCount = 0;
	 } 

	 // void means no return
	 public void fill() {
	 	fill(MAX_PEZ);
	 }

	 // overloaded method. note parameter not in original verson of method
	 public void fill(int pezAmount) {
	 	int newAmount = pezCount += pezAmount;
	 	if (newAmount > MAX_PEZ) {
	 		throw new IllegalArgumentException("Too many PEZ!!!");
	 	}
	 	pezCount = newAmount;
	 }

	 public boolean dispense() {
	 	boolean wasDispensed = false;
	 	if (!isEmpty()) {
	 		pezCount--;
	 		wasDispensed = true;
	 	}
	 	return wasDispensed;
	 }

	 public boolean isEmpty() {
	 	return pezCount == 0;
	 }

	 // getter method
	 public String getCharacterName() {
	 	return characterName;
	 }
}