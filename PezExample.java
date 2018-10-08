public class PezExample {

	public static void main(String[] args) {
		System.out.println("We are making a new PEZ Dispenser");
		// access static class variable, rather than instance variable
		System.out.printf("Fun Fact: There are %d PEZ allowed in every dispenser %n", 
							PezDispenser.MAX_PEZ);
		// new instance of PezDispencer object 
		PezDispenser dispenser = new PezDispenser("Yoda");
		// and then access the getter method of the object
		System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());

		// check to see if the dispenser is empty
		if (dispenser.isEmpty()) {
			System.out.println("Dispenser is empty");
		}

		System.out.println("Filling the dispenser with delicious PEZ...");
		// call the fill method
		dispenser.fill();
		// check the dispenser again, using the negative
		if (!dispenser.isEmpty()) {
			System.out.println("Dispenser is full");
		}

		while (dispenser.dispense()) {
			System.out.println("chomp!");
		}
		if (dispenser.isEmpty()) {
			System.out.println("Ate all the PEZ");
		}

		dispenser.fill(4);
		dispenser.fill(2);
		while (dispenser.dispense()) {
			System.out.println("Chomp!!");
		}

		// testing the exception
		try {
			dispenser.fill(400);
			System.out.println("this will never happen");
		} catch (IllegalArgumentException iae) {
			System.out.println("Whoa there!");
			System.out.printf("The error was %s %n", iae.getMessage());
		}
		

	}
}