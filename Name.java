public class Name
{
  // instance variables
  private String firstName;
  private String middleName;
  private String lastName;
  
  // constructor
  public Name (String first, String middle, String last)
  {
    firstName = first;
    middleName = middle;
    lastName = last;
  }
  
  // getters
  public String getFirst()
  {
    return firstName;
  }
  
  public String getMiddle()
  {
    return middleName;
  }
  
  public String getLast()
  {
    return lastName;
  }
  
  // method for full name
  public String firstMiddleLast()
  {
    return firstName + " " + middleName + " " + lastName;
  }
  
  // method for last name, first name & middle name 
  public String lastFirstMiddle()
  {
    return lastName + ", " + firstName + " " + middleName;
  }
  
  // equals method
  public boolean equals(Name otherName)
  {
    if (this.firstName.equalsIgnoreCase(otherName.firstName) && this.middleName.equalsIgnoreCase(otherName.middleName) && this.lastName.equalsIgnoreCase(otherName.lastName))
      return true;
    else
      return false;
  }
  
  // method for initials
  public String initials()
  {
    String lowerCaseInitials = firstName.substring(0,1) + middleName.substring(0,1) + lastName.substring(0,1);
    return lowerCaseInitials.toUpperCase();
  }
  
  // total number of characters
  public int length()
  {
    String fullName = firstName + middleName + lastName;
    return fullName.length();
  }
  
}