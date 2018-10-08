import java.io.Console;

public class DoWhile { 
	public static void main(String[] args) {
		Console console = System.console();
		String prompt = "Do you understand do while loops?  \n";

		String response;
		boolean learnMore;
		do { 
		  response = console.readLine(prompt);
		  learnMore = (response.equalsIgnoreCase("no"));
		  if (!learnMore); {
		    //console.printf(prompt);
		  }
		} while(learnMore);
		console.printf("Because you said %s, you passed the test. \n", response);
	}

}