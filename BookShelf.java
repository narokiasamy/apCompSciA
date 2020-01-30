import java.util.*;

public class BookShelf
{
  public static void main (String [] args)
  {
    // array
    System.out.println("ARRAY");
    System.out.println("-------------------------------------");
    Book[] bookshelf = new Book[4];
    
    Book tempBook = new Book();
    bookshelf[0] = tempBook;
    
    tempBook = new Book("The Lightning Theif", "Rick Riordan", 500);
    bookshelf[1] = tempBook;
    
    tempBook = new Book("The Giver", "Lois Lowry", 200);
    bookshelf[2] = tempBook;
    
    tempBook = new Book("Little Women", "Luisa May Alcott", 600);
    bookshelf[3] = tempBook;
    
    for (int i = 0; i < bookshelf.length; i++)
    {
      System.out.println(bookshelf[i]);
    }
    
    System.out.println();
    System.out.println("ARRAY LIST");
    System.out.println("-------------------------------------");
    
    /* setting up an arraylist */
    ArrayList <Book> bookshelf2 = new ArrayList <Book> ();
    
    /*adding to arrayList */
    bookshelf2.add(new Book());
    bookshelf2.add(new Book("The Lightning Theif", "Rick Riordan", 500));
    
    /*printing an arraylist*/
    System.out.println(bookshelf2);
    
    /*printing arraylist length*/
    System.out.println(bookshelf2.size());
    
    /*delete book at position 1*/
    bookshelf2.remove(1);
    System.out.println(bookshelf2);
    System.out.println(bookshelf2.size());
    
    /*adding to arrayList */
    bookshelf2.add(new Book());
    bookshelf2.add(new Book("The Lightning Theif", "Rick Riordan", 500));
    bookshelf2.add(new Book());
    bookshelf2.add(new Book("The Lightning Theif", "Rick Riordan", 500));
    bookshelf2.add(new Book());
    bookshelf2.add(new Book("The Lightning Theif", "Rick Riordan", 500));
    
    /*ARRAY LISTS CAN ONLY HOLD OBJECTS*/
  }
}