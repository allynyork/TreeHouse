// this class handles the game logic
class HangmanGame {
	public static final int MAX_MISSES = 7;
	private String answer;
	private String hits;
	private String misses;

	// constructor. requires answer
	public HangmanGame(String answer) {
		// normalize answer using .toLowerCase
		this.answer = answer.toLowerCase();
		// initialize Strings for Hits and Misses
		hits = "";
		misses = "";
	} 

	// private method is only accessible to this Class
	// method takes a char, and returns a char
	private char normalizeGuess(char letter) {
		// is it a letter? if not, throw an exception
		if (! Character.isLetter(letter)) {
			throw new IllegalArgumentException("A letter is required");
		}
		// normalize input 
		letter = Character.toLowerCase(letter);
		// has the letter already been guessed? e.g. is it in Misses or Hits? if so, throw an exception
		if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1) {
			throw new IllegalArgumentException(letter + " has already been guessed");
		}
		return letter;
	}

	// overloaded Method takes String instead of char
	public boolean applyGuess(String letters) {
		// check length == 0, error
		if (letters.length() == 0) {
			throw new IllegalArgumentException("No letter found");
		}
		// what is the first character of the String? 
		// return that char to our other applyGuess() that takes a char to use it's normalize and other logic
		return applyGuess(letters.charAt(0));
	}


	// Apply Guess method returns a boolean and takes a char 
	public boolean applyGuess(char letter) {
		// call private method that has validated and normalized the input
		letter = normalizeGuess(letter);

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

	// calculate remaining tries 
	// public method, returns integer
	public int getRemainingTries() {
		return MAX_MISSES - misses.length();
	}

	public String getCurrentProgress() {
		// initialize empty String to store our progress
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