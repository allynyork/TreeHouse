public class ScrabblePlayer {
	// a String represent all of the tiles this player has
	private String tiles;

	// constructor 
	public ScrabblePlayer() {
		tiles = "";
	}

	// method
	public String getTiles() {
		return tiles;
	}

	public void addTile(char tile) {
		// add the tile to the tiles
		tiles += tile;

	}

	public boolean hasTile(char tile) {
		// does the user have the tile being asked for?
		boolean maybe = tiles.indexOf(tile) != -1;
		return maybe;
	}

	// Create a new method named getCountOfLetter that returns an int, 
	// and requires a parameter of type char named letter. 
	public int getCountOfLetter(char letter) {

		// You'll need to use your skills to loop through each of the tiles, 
		for (char letter : tiles.toCharArray()) {
			// use an equality check, and then increment a counter if the tile and letter match
			if (letter == ) {
				// increment a counter if the tile and letter match
			}
		}

		// Now in your new method, have it return a number representing the count of tiles that match the letter that was passed in to the method.

		// For this task, just make it return 0
		return 0;
	}


}