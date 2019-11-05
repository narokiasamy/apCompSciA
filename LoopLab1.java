import java.util.Scanner;

public class LoopLab1 {
  public static void main (String [] args) {
    
    int randomNumber = (int)(Math.random() * 100) + 1;
    Scanner scan = new Scanner(System.in);
    
    int x = 0;
    int count = 0;
    
    while (x != -1)
    {
      System.out.println("Try to guess the random number (from 1-00 inclusive).");
      int userGuess = scan.nextInt();  
      
      if (userGuess > randomNumber)
        System.out.println("Your number is incorrect and too high.");
      else if (userGuess < randomNumber)
        System.out.println("Your number is incorrect and too low.");
      else if (userGuess == randomNumber)
      {
        System.out.println("Your number is correct. You are a winner. It took you " + count + " guesses to win.");
        x = -1;
      }
        
      count ++;
    }


    
  }
}
  