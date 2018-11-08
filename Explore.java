public class Explore {

	public static void main(String[] args) {
		// create array literal
		String[] friends = {"Ben", "Alena", "Pasan"};

		int[][] scoreCards = {
			{1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2}, 
			{2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2}, 
			{4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
		};

		// pseudo code for planning
		// for each friend
		// use the Standard For Loop because we want access to the index 
		for (int i = 0; i < friends.length; i++) {
			// print their name
			System.out.printf("%s %n---------------------%n", 
								friends[i]);
			// for each hole 
			// nested For Loop 
			for (int j = 0; j < scoreCards[i].length; j++) {
				// print their score
				System.out.printf("Hole #%d: %d %n", 
									j + 1, 
									scoreCards[i][j]);
			}
		}

		System.out.printf("%n");

		System.out.printf("%n");
		

		// enhanced For Loop, works well for iterating over all elements in an array
		System.out.println("This is an example of an Enhanced For Loop");
		for (String friend : friends) {
			System.out.printf("Hey %s! the movie starts at 7:00pm %n",
								 friend);
		}

		System.out.printf("%n");

		System.out.println("This is an example of a standard For Loop");
		// standard For Loop
		// contains three expressions. the three expressions are separated by semicolons
		// the first expression e.g. int i = 0 is known as the initialization expression 
		// we're starting with 0 because 0 is the first index of our array
		// the second expression e.g. i < friends.length is known as the conditional (or termination expression). 
		// if this expression is true, the loop continues. if this expression is false, the loop stops.
		// in our example here, we're checking to see if our index is less than the length of our array
		// the third expression e.g.  is known as the increment, or step expression
		// the typical way to do this is to use the post increment operator
		for (int i = 0; i < friends.length; i++) {
			// assign to friend whatever is at the index i of our array friends
			// e.g. the first time through i = 0 therefore friend is Ben because Ben is the first element of our array
			String friend = friends[i];
			// same Print statement from Enhanced For Loop
			System.out.printf("Hey %s! the movie starts at 7:00pm %n",
								 friend);
		}

		System.out.printf("%n");

		// array of golf scores
		// note that hole 1 is at index 0
		int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
		// standard For Loop, follows the same pattern as above
		for (int i = 0; i < bensScoreCard.length; i++) {
			// each time through our loop we're going to print out the hole number (which is index +1), and then the score for that hole.
			System.out.printf("Hole #%d: %d %n", 
								i + 1, 
								bensScoreCard[i]);
		}

	}
}