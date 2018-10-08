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
		System.out.print("Enter a letter:  ");
		// use Scanner helper method to get input and store it in a String
		String guessInput = scanner.nextLine();
		// store the first character of the input as a char
		char guess = guessInput.charAt(0);
		// return answer from HangmanGame.applyGuess method that is going to take the char guess
		return game.applyGuess(guess);
	}

	// method to display our progress
	// note the method call to our game object to populate our formatted print
	public void displayProgress() {
		System.out.printf("Try to solve: %s%n", game.getCurrentProgress());
	}

}

// note to self, can Scanner go directly to char? or does it have to be a String first? 