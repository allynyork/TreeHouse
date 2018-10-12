// import Scanner
import java.util.Scanner;

class HangmanPrompter {
	// this class handles the IO of the game

	// needs to know about Game object
	// use private variable that is an instance of the HangmanGame
	private HangmanGame game;

	// constructor, requires HangmanGame
	public HangmanPrompter(HangmanGame game) {
		// avoid naming collision with this.
		this.game = game;
	} 

	// method to prompt for guess
	// and returns whether the guess is correct or not
	public boolean promptForGuess() {
		// new Scanner object
		Scanner scanner = new Scanner(System.in);
		// declare variable outside of try block so that it is accessible
		boolean isHit = false;
		// new variable to keep track of state
		boolean isAcceptable = false;
		// do while loop. keep iterating through until we get acceptable input
		do {
			System.out.print("Enter a letter:  ");
			// use Scanner helper method to get input and store it in a String
			String guessInput = scanner.nextLine();
			// store the first character of the input as a char
			char guess = guessInput.charAt(0);

			// try catch
			try {
		      // call applyGuess method from Game, which also normalizes the input and assign value to isHit variable
			  isHit = game.applyGuess(guess);
			  // and because the input was normalized, we know it is now acceptable
			  isAcceptable = true;	
			  // or if not, we iterate through our exception until we do have acceptable input
			} catch(IllegalArgumentException iae) {
				System.out.printf("%s. Please try again. %n",
										 iae.getMessage());
				}
		} while(! isAcceptable);
			return isHit;		
	}

	// method to display our progress
	// note the method call to our game object to populate our formatted print
	public void displayProgress() {
		System.out.printf("You have %d tries left to solve: %s%n",
						game.getRemainingTries(),
						game.getCurrentProgress());
	}

}

// note to self, can Scanner go directly to char? or does it have to be a String first? 