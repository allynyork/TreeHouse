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
    // initialize counter
    int count = 0;
    // loop through each of the tiles
    for (char maybe : tiles.toCharArray()) {
      // use an equality check. is the letter passed into this method equal to the tile being examined in each iteration?
      if (maybe == letter) {
        //  increment a counter if the tile and letter match
        count++;
      }
    }
    return count;
  }

}
