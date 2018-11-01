public class Explore {

	public static void main(String[] args) {
		// create array literal
		String[] friends = {"Ben", "Alena", "Pasan"};
		// enhanced For Loop, works well for iterating over all elements in an array
		for (String friend : friends) {
			System.out.printf("Hey %s! the movie starts at 7:00pm %n",
								 friend);
		}
	}
}