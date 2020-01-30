public class People 
{
  private String firstName;
  private String lastName;
  private int age;
 
  public People(String inFirst, String inLast, int inAge)
  {
  //using setters to validate parameters
    this.setFirst(inFirst);
    this.setLast(inLast);
    this.setAge(inAge);
  }
 
  //setters
  public void setFirst(String inF) 
  {
    if(inF.length() > 0)
      firstName = inF;
  }
  public void setLast(String inL) 
  {
    if(inL.length() > 0)
      lastName = inL;
  }
  
  public void setAge(int inA) 
  {
    if(inA > 0)
      age = inA;
  }
   
  //getters
  public String getFirst()  { return firstName;}
  public String getLast()  { return lastName;}
  public int getAge() { return age;}
    
  public boolean equals (People p)
  {
    if (this.toString().equals(p.toString()))
      return true;
    else
      return false;
  }
    
  public String toString()
  {
    return firstName + " " + lastName + " Age: " + age; 
  }
    
  //calculate & return the youngest age in a group of people
  public static int youngest(People [] temps)
  {
    int youngest = temps[0].getAge();
    for (int i = 0; i < temps.length; i++)
    {
      if (youngest > temps[i].getAge())
        youngest = temps[i].getAge();
    }
    return youngest;
  }
    
  // calculate & return the oldest age in a group of people
  public static int oldest(People [] temps)
  {
    int oldest = temps[0].getAge();
    for (int i = 0; i < temps.length; i++)
    {
      if (oldest < temps[i].getAge())
        oldest = temps[i].getAge();
    }
    return oldest;   
  }
    
  //compute and return the average age of a group of people
  public static double avgAge (People [] temps)
  {
    double sum = 0; 
    for (int i = 0; i < temps.length; i++)
    {
      sum += temps[i].getAge();
    } 
    return sum / temps.length;
  }
    
  //given a first name, return true if someone in the group has the 
  //same first name.  Return false if the name isn't found
  public static boolean sameFirst(People [] temps, String inFirst)
  {
    for (int i = 0; i < temps.length; i++)
    {
      if (temps[i].getFirst().equals(inFirst))
        return true;
    }
    return false;
        
  }
    
  //return true if all people have even numbered ages; false if any are odd
  public static boolean allEven (People [] temps)
  {
    for (int i = 0; i < temps.length; i++)
    {
      if (temps[i].getAge() % 2 != 0)
      return false;
    }
    return true;
  }
    
  //given a last name, return the number of people who have the same last name
  public static int sameLastName (People [] temps, String inLast)
  {
    int sameLastName = 0;
    
    for (int i = 0; i < temps.length; i++)
    {
      if (temps[i].getLast().equals(inLast))
        sameLastName += 1;
    }
    return sameLastName;
  }
    
  //return true if there are any duplicates of first names; false if no duplicates
  public static boolean duplicateFirstNames (People [] temps)
  {
    String tempString = "";
    for (int j = 0; j < temps.length; j++)  
    {
      tempString = temps[j].getFirst();
      for (int i = j + 1; i < temps.length; i++)  
      {
        if (temps[i].getFirst().equals(tempString))
          return true;
      }
    }
    return false;
  }
    
   
    
  /*determine if two consective (side by side) first names start with the same
  letter.  If so, output the name and the index location of each.  The method should output
  all occurences within the array.  If there are no occurences, the method should
  output "No side by side names with the same first letter"*/
  public static void sideBySide (People [] temps)
  {
    boolean tempBoolean = false;
    for (int i = 0; i < temps.length - 1; i++)  
    {
      if (temps[i].getFirst().substring(0,1).equals(temps[i + 1].getFirst().substring(0,1)))
      {
        tempBoolean = true;
        System.out.println(temps[i].getFirst()  + "at position " + i + " has the same first letter as " + temps[i + 1].getFirst() + " at position " + (i+1));
      }
    }
    if (tempBoolean == false)
      System.out.println("No side by side names with the same first letter.");
  }
}
    
    
    