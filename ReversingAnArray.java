import java.util.Scanner;

public class ReversingAnArray {
  public static void main (String [] args) {
    
    //creating array
    Scanner scan = new Scanner(System.in);
    
    System.out.print("How numbers do you want to enter?");
    int numbers = scan.nextInt();
    int userInput = 0;
    int currentValue = 0;
    
    int[] numList = new int[numbers];
    
    System.out.println("Enter the values you would like.");
    for (int i = 0; i < numbers; i++)
    {
      userInput = scan.nextInt();
      numList[i] = userInput;
    }
    
    // printing array
    System.out.println("Your input:");
    for (int i = 0; i < numbers; i++)
    {
     System.out.println(numList[i]);
    }
    
    // reversing array
    int[] temp = new int[numbers];
    int positionTemp = 0;
    for (int i = numbers - 1; i >= 0; i--)
    {
      temp[positionTemp] = numList[i];
      positionTemp++;
    }
    
    numList = temp;
    
    // printing reversed array
    System.out.println("Reversed input:");
    for (int i = 0; i < numbers; i++)
    {
     System.out.println(numList[i]);
    }
    
  }
}