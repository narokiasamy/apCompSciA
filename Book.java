public class Book
{
  private String title;
  private String author;
  private int numPages;
    
  
  public Book()
  {
    title = "To Kill A MockingBird";
    author = "Harper Lee";
    numPages = 250;
  }
  
  public Book(String inTitle, String inAuthor, int inNumPages)
  {
    title = inTitle;
    author = inAuthor;
    numPages = inNumPages;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public String getAuthor()
  {
    return author;
  }
  
  public int getNumPages()
  {
    return numPages;
  }
  
  public void setTitle(String inTitle)
  {
    title = inTitle;
  }
  
  public void setAuthor(String inAuthor)
  {
    author = inAuthor;
  }
  
  public void setNumPages(int inNumPages)
  {
    numPages = inNumPages;
  }
  
  public String toString()
  {
    return "\ntitle: " + title + "\nauthor: " + author;
  }
  
  

}