public class Tweet {
  public static final int MAX_CHARS = 140;
  private String text;

  public Tweet(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int getRemainingCharacterCount() {
    return MAX_CHARS - text.length();
  }
}

// task 1
// Add a new constant that defines the max chars allowed and set it 140. Use proper case for constants. 
// Ensure it is accessible off the class, and that it cannot be changed.

// task 2
// Create a public method named getRemainingCharacterCount that returns an 
// int representing how many characters they have left before they 140. 
// Base your calculation on the field that stores the current text.