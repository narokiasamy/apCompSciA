public class BandBooster 
{
  // instance variables
  private String name;
  private int boxesSold;
  
  // constructor
  public BandBooster(String inName)
  {
    name = inName;
    boxesSold = 0;
  }
  
  // method getName: returns name of bandbooster
  public String getName()
  {
    return name;
  }
  
  // method updateSales: adds to boxesSold
  public void updateSales(int additionalBoxes)
  {
    boxesSold += additionalBoxes;
  }
  
  // toString method
  public String toString()
  {
    return name + ": " + boxesSold + " boxes";
  }
  
}