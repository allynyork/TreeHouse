import java.io.Console;

public class CowArray {
  
  public static void main(String[] args) {
    Console console = System.console();
    
    // TODO: 1. Create an array of good cow names (this should be a String array).
    String[] cowNames = {"Moe", "Curly", "Larry", "Spot"};
    
    
    // TODO: 2. Create an array of Cows the same length as your 'names' array.
    Cows[] myCowArray = new Cows[cowNames.length];
    
    
    // TODO: 3. Use a for loop to populate the 'cows' array with Cows using names from the 'names' array.
    for (int i = 0; i < cowNames.length; i++) {
    	// hmmm
    	myCowArray[i] = cowNames[i]; // this is my solution
    	myCowArray[i] = new Cows(cowNames[i]); // this is the instructor's solution
    }
    
    
    // TODO: 4. Use an enhanced for loop to print the name of each Cow from step #2
    for (Cows cow : myCowArray) {
    	System.out.printf("%s %n", cow);
    }
    
  }
}