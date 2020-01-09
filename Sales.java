// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter the number of sales people: ");
      final int SALESPEOPLE = scan.nextInt();
      
      int[] sales = new int[SALESPEOPLE];
      int sum = 0;
      int max = 0;
      int idMAX = 0;
      int min = 100;
      int idMIN = 0;
      int total = 0;


      for (int i=0; i<sales.length; i++)
      {
        System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
        sales[i] = scan.nextInt();
        if (sales[i] > max)
        {
          max = sales[i];
          idMAX = i + 1;  
        }
        
        if (sales[i] < min)
        {
          min = sales[i];
          idMIN = i + 1;
        }
      }
      
      System.out.println("\nSalesperson   Sales");
      System.out.println("--------------------");
      sum = 0;
      for (int i=0; i<sales.length; i++)
      {
        System.out.println("     " + (i + 1) + "         " + sales[i]);
        sum += sales[i];
      }
      
      System.out.println("\nTotal sales: " + sum);
      System.out.println("\nAverage: " + (sum/sales.length));
      System.out.println("\nSalesperson " + idMAX + " had the highest sale of $" + max);
      System.out.println("\nSalesperson " + idMIN + " had the lowest sale of $" + min);
      
      System.out.println("\nEnter a value: ");
      int userInput = scan.nextInt();
      System.out.println("\nIDs of salespeople who exceeded the amount you entered: ");
      
      for (int i  = 0; i < sales.length; i++)
      {
        if (sales[i] > userInput)
        {
          System.out.println(i + 1);
          total += 1;
        }
        
      }
      
      System.out.println("\n" + total + " people exceeded the amount you entered.");
    }
}