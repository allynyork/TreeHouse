public class Hangman {

	public static void main(String[] args) {
		// create instance of game
		HangmanGame game = new HangmanGame("treehouse");

		// make a HangmanPrompter object
		HangmanPrompter prompter = new HangmanPrompter(game);

		// method call to our prompter object
		// initial state will just be dashes for each letter in the answer
		prompter.displayProgress();

		// call the promptForGuess method, and store result in boolean variable
		boolean isHit = prompter.promptForGuess();
		// if true
		if (isHit) {
			System.out.println("Success!");
		// if false	
		} else {
			System.out.println("Fail!");
		}

		// display our progress
		prompter.displayProgress();

	}
}