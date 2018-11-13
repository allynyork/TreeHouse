package com.example;

import java.util.Date;

public class BlogPost {
  // method variables
    private String mAuthor;
    private String mTitle;
    private String mBody;
    private String mCategory;
    private Date mCreationDate;

    // constructor
    public BlogPost(String author, String title, String body, String category, Date creationDate) {
      mAuthor = author;
      mTitle = title;
      mBody = body;
      mCategory = category;
      mCreationDate = creationDate;
    }
    
    // Override the toString method from java.lang.Object and make it return the following information: "BlogPost: TITLE by AUTHOR" 
    @Override
    public String toString() {
      return "BlogPost: " + mTitle + "by " + mAuthor;
    }


    // getters
    public String getAuthor() {
      return mAuthor;
    }
    
    public String getTitle() {
      return mTitle;
    }
    
    public String getBody() {
      return mBody;
    }
    
    public String getCategory() {
      return mCategory;
    }
    
    public Date getCreationDate() {
      return mCreationDate;
    }
}