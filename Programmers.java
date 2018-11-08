public class Programmers {

  public static void main(String args[]) {

    //public void printMenu() {
      String[] programmers = {
              "Yukihiro Matsumoto",
              "David Nolen",
              "Grace Hopper",
              "Linus Torvalds",
              "You"
      };

      System.out.println("Choose a programmer:");
      // TODO: Print out a menu by looping through the programmers array.
      /*
        The menu should be in the form of (each on a line of its own, starting with 1):
        1. Yukihiro Matsumoto
        2. David Nolen
        ...
      */
      // Standard For Loop
      for (int i = 0; i < programmers.length; i++) {
        // blah blah blah
        System.out.printf("%d. %s %n", 
                          i + 1, 
                          programmers[i]);
      }


    }

  //}

}