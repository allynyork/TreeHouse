public class Hangman {

	public static void main(String[] args) {
		// create instance of game. and populate it with the answer
		HangmanGame game = new HangmanGame("treehouse");

		// make a HangmanPrompter object
		HangmanPrompter prompter = new HangmanPrompter(game);

		// loop while there are still Tries remaining, and the game is not won
		while (game.getRemainingTries() > 0 && !game.isWon()) {
			// method call to our prompter object
			// initial state will just be dashes for each letter in the answer
			prompter.displayProgress();

			prompter.promptForGuess();
		}

		// display outcome
		prompter.displayOutcome();


		// testing code, commented out
		// call the promptForGuess method, and store result in boolean variable
		//boolean isHit = prompter.promptForGuess();
		// if true
		//if (isHit) {
		//	System.out.println("Success!");
		// if false	
		//} else {
		//	System.out.println("Fail!");
		//}
	}
}