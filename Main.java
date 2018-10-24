public class Main {

  public static void main(String[] args) {
    System.out.println("Beginning forum example");
    if (args.length < 2) {
      System.out.println("Usage: java Main <first name> <last name>");
      System.err.println("<first name> and <last name> are required");
      System.exit(1);
    }

    Forum forum = new Forum("Java");
    // TODO: pass in the first name and last name that are in the args parameter
    User author = new User();
    // TODO: initialize the forum post with the user created above and a title and description of your choice
    ForumPost post = new ForumPost();
    forum.addPost(post);


  }

}