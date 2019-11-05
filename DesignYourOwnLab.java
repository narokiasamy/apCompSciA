import java.util.Scanner;

public class DesignYourOwnLab {
  public static void main (String [] args) {
  
    Scanner scan = new Scanner (System.in);
    
    System.out.println("The object of this program is to guess the fruit. The fruit will be either a tropical fruit or a berry. Using a random generator, the computer will select a fruit for you to guess. Depending on the fruit chosen, you will receive clues to help you determine the name of the fruit. Good luck!");
    System.out.println();
    System.out.println("Here are your clues:");
                         
    // list of words
    String string1 = "papaya";
    String string2 = "watermelon";
    String string3 = "coconut";
    String string4 = "guava";
    String string5 = "mango";
    String string6 = "acai berry";
    String string7 = "blackberry";
    String string8 = "raspberry";
    String string9 = "blueberry";
    String string10 = "strawberry";

    // randomly select a fruit for the user to guess
    int randomNumber = (int) (Math.random() * 10) + 1;
    String randomString = "";
    
    // determining clues                       
    if (randomNumber == 1) 
    {
      randomString = string1;

      int length = string1.length();
      System.out.println("Clue #1: The fruit's name contains " + length + " letters.");
      

      String firstLetter = string1.substring(0,1);
      System.out.println("Clue #2: The first letter of the fruit's name is '" + firstLetter + "'.");
      

      int position = string1.indexOf("berry");
      if (position != -1)
        System.out.println("Clue #3: The fruit is a berry.");
      else
        System.out.println("Clue #3: The fruit is not a berry");
    }
    else if (randomNumber == 2) 
    {
      randomString = string2;

      int length = string2.length();
      System.out.println("Clue #1: The fruit's name contains " + length + " letters.");
      
      // first letter of fruit
      String firstLetter = string2.substring(0,1);
      System.out.println("Clue #2: The first letter of the fruit's name is '" + firstLetter + "'.");
      

      int position = string2.indexOf("berry");
      if (position != -1)
        System.out.println("Clue #3: The fruit is a berry.");
      else
        System.out.println("Clue #3: The fruit is not a berry.");
    }
    else if (randomNumber == 3) 
    {
      randomString = string3;

      int length = string3.length();
      System.out.println("Clue #1: The fruit's name contains " + length + " letters.");
      

      String firstLetter = string3.substring(0,1);
      System.out.println("Clue #2: The first letter of the fruit's name is '" + firstLetter + "'.");
      

      int position = string3.indexOf("berry");
      if (position != -1)
        System.out.println("Clue #3: The fruit is a berry.");
      else
        System.out.println("Clue #3: The fruit is not a berry.");
    }
    else if (randomNumber == 4) 
    {
      randomString = string4;      

      int length = string4.length();
      System.out.println("Clue #1: The fruit's name contains " + length + " letters.");
      

      String firstLetter = string4.substring(0,1);
      System.out.println("Clue #2: The first letter of the fruit's name is '" + firstLetter + "' .");
      

      int position = string4.indexOf("berry");
      if (position != -1)
        System.out.println("Clue #3: The fruit is a berry.");
      else
        System.out.println("Clue #3: The fruit is not a berry.");  
    }
    else if (randomNumber == 5) 
    {
      randomString = string5;      

      int length = string5.length();
      System.out.println("Clue #1: The fruit's name contains " + length + " letters.");
      

      String firstLetter = string5.substring(0,1);
      System.out.println("Clue #2: The first letter of the fruit's name is '" + firstLetter + "' .");
      

      int position = string5.indexOf("berry");
      if (position != -1)
        System.out.println("Clue #3: The fruit is a berry.");
      else
        System.out.println("Clue #3: The fruit is not a berry.");
    }
    else if (randomNumber == 6) 
    {
      randomString = string6;      

      int length = string6.length();
      System.out.println("Clue #1: The fruit's name contains " + length + " letters.");
      

      String firstLetter = string6.substring(0,1);
      System.out.println("Clue #2: The first letter of the fruit's name is '" + firstLetter + "' .");
      
      // if fruit a berry?
      int position = string6.indexOf("berry.");
      if (position != -1)
        System.out.println("Clue #3: The fruit is a berry.");
      else
        System.out.println("Clue #3: The fruit is not a berry.");
    }
    else if (randomNumber == 7) 
    {
      randomString = string7;

      int length = string7.length();
      System.out.println("Clue #1: The fruit's name contains " + length + " letters.");
      

      String firstLetter = string7.substring(0,1);
      System.out.println("Clue #2: The first letter of the fruit's name is '" + firstLetter + "' .");
      

      int position = string7.indexOf("berry");
      if (position != -1)
        System.out.println("Clue #3: The fruit is a berry.");
      else
        System.out.println("Clue #3: The fruit is not a berry.");
    }
    else if (randomNumber == 8) 
    {
      randomString = string8;      

      int length = string8.length();
      System.out.println("Clue #1: The fruit's name contains " + length + " letters.");
      

      String firstLetter = string8.substring(0,1);
      System.out.println("Clue #2: The first letter of the fruit's name is '" + firstLetter  + "' .");
      

      int position = string8.indexOf("berry");
      if (position != -1)
        System.out.println("Clue #3: The fruit is a berry.");
      else
        System.out.println("Clue #3: The fruit is not a berry.");
    }
     else if (randomNumber == 9) 
    {
      randomString = string9;

      int length = string9.length();
      System.out.println("Clue #1: The fruit's name contains " + length + " letters.");
      
      // first letter of fruit
      String firstLetter = string9.substring(0,1);
      System.out.println("Clue #2: The first letter of the fruit's name is '" + firstLetter + "' .");
      
      // if fruit a berry?
      int position = string9.indexOf("berry");
      if (position != -1)
        System.out.println("Clue #3: The fruit is a berry.");
      else
        System.out.println("Clue #3: The fruit is not a berry.");
    }
    else if (randomNumber == 10) 
    {
      randomString = string10;      

      int length = string10.length();
      System.out.println("Clue #1: The fruit's name contains " + length + " letters.");
      

      String firstLetter = string10.substring(0,1);
      System.out.println("Clue #2: The first letter of the fruit's name is '" + firstLetter + "'.");
      

      int position = string10.indexOf("berry");
      if (position != -1)
        System.out.println("Clue #3: The fruit is a berry");
      else
        System.out.println("Clue #3: The fruit is not a berry");
    }                                   
                       
    // user guessing
    System.out.println();
    System.out.println("Now try to guess the fruit!");                   
    String userInput = scan.next();

    if (userInput.equals(randomString))
    {
      System.out.println("You guessed the fruit correctly!");                 
    }
    else
    {                     
      System.out.println("Restart the program and try again!");                   
    }                   
                       
  }
}
  