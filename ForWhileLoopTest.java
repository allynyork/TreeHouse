import java.io.Console;

public class ForWhileLoopTest {
  
  public static void main(String[] args) {
    Console console = System.console();
    
    String response; 
    do {  
      response = console.readLine("Do you understand do while loops?\n"); 
    } while(response.equalsIgnoreCase("no"));
    console.printf("Because you said %s, you passed the test!%n", response);
  }  
  
}