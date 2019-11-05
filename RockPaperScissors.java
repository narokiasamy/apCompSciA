import java.util.Scanner;
public class RockPaperScissors {
  public static void main (String [] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // take in user input
    System.out.println("Welcome to Natalie's 'Rock, Paper, Scissors' game!");
    System.out.println("Enter a choice of 'rock', 'paper', 'scissors' (Enter the choices in quotes)."); 
    String userChoice = scan.next();
    
    // picking random number & assigning values
    int randomChoice = (int)(Math.random() * 3) + 1;
    String computerChoice = "";
    
    if (randomChoice == 1)
      computerChoice = "rock";
    else if (randomChoice == 2)
      computerChoice = "paper";
    else if (randomChoice == 3)
      computerChoice = "scissors";
    
    
    // comparing user input with computer choice
    String results = "";
    
    if (userChoice.equals("rock") && computerChoice.equals("paper"))
      results = "lose";
    else if (userChoice.equals("rock") && computerChoice.equals("scissors"))
      results = "win";
    else if (userChoice.equals("paper") && computerChoice.equals("rock"))
      results = "win";
    else if (userChoice.equals("paper") && computerChoice.equals("scissors"))
      results = "lose";
    else if (userChoice.equals("scissors") && computerChoice.equals("rock"))
      results = "lose";
    else if (userChoice.equals("scissors") && computerChoice.equals("paper"))
      results = "win";
    else if (userChoice.equals(computerChoice))
      results = "tied";
               
    
    // outputting the results
    System.out.println("You chose " + userChoice);
    System.out.println("The computer chose " + computerChoice);
    System.out.println("You " + results);
  }
}