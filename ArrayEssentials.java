import java.util.Scanner;

public class ArrayEssentials {
  public static void main (String [] args) {
    
    Scanner scan = new Scanner(System.in);
    
    int [] numList = new int[25];
    
    int numItems = 0;
    int min = 100;
    int max = 0;
    int total = 0;
    
    // first 20 values
    for (int i = 0; i < 20; i++)
    {
      // y = 10x - 5
      numList[i] = ((i + 1) * 10) - 5;
      numItems += 1;   
    }
    
    int randomNumber3 = (int)(Math.random() * 20);
    int valueNumber3 = numsList[randomNumber3];
    System.out.println(valueNumber3);
    numsList[random3] = 0;
    
    // randomNumberAddition1
    int randomNumber = (int)(Math.random() * 804) + 196;
    numItems += 1;
    numList[numItems - 1] = randomNumber;
    
    for (int i = 0; i < numItems; i++)
    {
      System.out.print(numList[i] + " ");
    }
    
    // randomNumberAddition2
    int randomNumber2 = (int)(Math.random() * 196);
    numItems += 1;
    numList[numItems - 1] = randomNumber2;   
    
    for (int i = 0; i < numItems; i++)
    {
      System.out.print(numList[i] + " ");
    }
                              
    
    // extrema & printing array
    System.out.print("numList: ");  
    for (int i = 0; i < numItems; i++)
    {
      System.out.print(numList[i] + " ");
      
      if (numList[i] > max)
      {
        max = numList[i];
      }
      
      if (numList[i] < min)
      {
        min = numList[i];
      }
      
      total += numList[i];  
      
    }
    
    double average = (double)(total/numItems); 
    
    // print statements
    System.out.println(" ");
    System.out.println("\nMinimum value: " + min);
    System.out.println("Maximum value: " + max);
    System.out.println("Total: " + total);
    System.out.println("Average: " + average);
    
    
  }
}