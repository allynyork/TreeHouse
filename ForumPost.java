public class ForumPost {
  private User author;
  private String title;
  private String description;

  // TODO: add a constructor that accepts the author, title and description
  public ForumPost(User author, String title, String description) {
    this.author = author;
    this.title = title;
    this.description = description;
  }

  public User getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }
}