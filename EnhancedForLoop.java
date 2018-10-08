public class EnhancedForLoop {
	
	public static void main(String[] args) {
		String example = "hello";
		for (char letter : example.toCharArray()) {
		System.out.println("We've got the letter " + letter);
		}
	}
}