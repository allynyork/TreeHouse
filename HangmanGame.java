// this class handles the game logic
class HangmanGame {
	private String answer;
	private String hits;
	private String misses;
	// constructor. requires answer
	public HangmanGame(String answer) {
		this.answer = answer;
		// initialize
		hits = "";
		misses = "";
	} 

	// method 
	public boolean applyGuess(char letter) {
		// is the letter in the answer?
		boolean isHit = answer.indexOf(letter) != -1; 
		// yes
		if (isHit) {
			// concatanate the letter to the hits String
			hits += letter;
		} else {
			//no. concatanate the letter to the misses String
			misses += letter;
		}
		return isHit;
	}

	public String getCurrentProgress() {
		String progress = "";
		// enhanced For Loop
		// use .toCharArray() to put answer into array, and then iterate through each element
		for (char letter: answer.toCharArray()) {
			 // default is to display a dash
			char display = '-';
			// is the letter in array?
			if (hits.indexOf(letter) != -1) {
				// if yes, then assign that letter to display instead of our default _
				display = letter;
			}
			// append each display to progess
			progress += display;
		}
		return progress;
	}

}