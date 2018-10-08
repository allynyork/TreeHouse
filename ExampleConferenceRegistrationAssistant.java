public class ExampleConferenceRegistrationAssistant {

  public static void main(String[] args) {
    /*
      IMPORTANT:  You can compare characters using <, >. <=, >= and == just like numbers
     */
    if ('C' < 'D') {
      System.out.println("C comes before D");
    }

    if ('B' > 'A') {
      System.out.println("B comes after A");
    }

    if ('E' >= 'E') {
      System.out.println("E is equal to or comes after E");
    }

    // This code is here for demonstration purposes only...
    ConferenceRegistrationAssistant assistant = new ConferenceRegistrationAssistant();
    /*
      Remember that there are 2 lines.
      Line #1 is for A-M
      Line #2 is for N-Z
     */
    int lineNumber = 0;
    /*
      This should set lineNumber to 2 because
      The last name is Zimmerman which starts with a Z.
      Therefore it is between N-Z
     */
    lineNumber = assistant.getLineNumberFor("Zimmerman");

    /*
      This method call should set lineNumber to 1, because 'A' from "Anderson" is between A-M.
     */
    lineNumber = assistant.getLineNumberFor("Anderson");

    /*
      Likewise Charlie Brown's 'B' is between 'A' and 'M', so lineNumber should be set to 1
     */
    lineNumber = assistant.getLineNumberFor("Brown");
  }

}