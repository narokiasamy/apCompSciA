import java.util.Scanner;

public class TestNames 
{
  public static void main (String [] args)
  {
    
    Scanner scan = new Scanner(System.in);

    // creating objects
    System.out.println("Enter the full name of person1 on each line.");
    String first1 = scan.next();
    String middle1 = scan.next();
    String last1 = scan.next();
    Name person1 = new Name(first1, middle1, last1);
    
    System.out.println("Enter the full name of person2 on each line.");
    String first2 = scan.next();
    String middle2 = scan.next();
    String last2 = scan.next();
    Name person2 = new Name(first2, middle2, last2);
    
    System.out.println();
    
    // printing person1
    System.out.println("Information for " + person1.getFirst());
    System.out.println("--------------------------------------------");
    System.out.println("first-middle-last: " + person1.firstMiddleLast());
    System.out.println("last-first-middle: " + person1.lastFirstMiddle());
    System.out.println("intials: " + person1.initials());
    System.out.println("length: " + person1.length());
    
    System.out.println();
    
    // printing person2
    System.out.println("Information for " + person2.getFirst());
    System.out.println("--------------------------------------------");
    System.out.println("first-middle-last: " + person2.firstMiddleLast());
    System.out.println("last-first-middle: " + person2.lastFirstMiddle());
    System.out.println("intials: " + person2.initials());
    System.out.println("length: " + person2.length());
    
    System.out.println();
    System.out.println();
    
    //testing equality
    if (person1.equals(person2))
      System.out.println("These two people DO have the same name");
    else 
      System.out.println("These two people DON'T have the same name");
     
  }
}