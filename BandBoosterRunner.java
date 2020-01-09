import java.util.Scanner; 

public class BandBoosterRunner
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);

    // create BandBooster objects
    System.out.println("Enter the name of the band booster: ");
    BandBooster student1 = new BandBooster(scan.next());
    System.out.println("Enter the name of the band booster: ");
    BandBooster student2 = new BandBooster(scan.next());
    
    System.out.println();
    
    // prompt for input
    for (int i = 0; i < 3; i++)
    {
      System.out.println("Enter the number of boxes sold by " + student1.getName() + " this week: ");
      student1.updateSales(scan.nextInt());
    }
    
    for (int i = 0; i < 3; i++)
    {
      System.out.println("Enter the number of boxes sold by " + student2.getName() + " this week: ");
      student2.updateSales(scan.nextInt());
    }
   
    System.out.println();
    
    // printing name and total sales
    System.out.println(student1);
    System.out.println(student2);    

    
    
  }
}