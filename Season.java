import java.util.Scanner; 
public class Season { 
  public static void main (String [] args) { 
     
    boolean invalidInput = true;  
    int month = 0; 
    int day = 0; 
     
    Scanner scan = new Scanner (System.in); 
    
    while (invalidInput == true) 
    { 
      System.out.println("Enter the month (corresponding number)"); 
      month = scan.nextInt(); 
      System.out.println("Enter the day"); 
      day = scan.nextInt(); 
       
      if ((day < 1) || (day > 31) || (month < 1) || (month > 12)) 
      { 
        invalidInput = true; 
        System.out.println("You have entered in an invalid input."); 
      } 
      else 
        invalidInput = false; 
    }   
     
    String season = "";  
         
    if ((month == 12 && day >= 21 ) || (month == 1) || (month == 2) || (month == 3 && day <= 20)) 
      season = "winter"; 
    else if ((month == 3 && day >= 21 ) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) 
      season = "spring"; 
    else if ((month == 6 && day >= 21 ) || (month == 7) || (month == 8) || (month == 9 && day <= 20)) 
      season = "summer"; 
    else if ((month == 9 && day >= 21 ) || (month == 10) || (month == 11) || (month == 12 && day <= 20)) 
      season = "fall"; 
     
    System.out.println ("date: " + month + "/" + day); 
    System.out.println("season: " + season); 
     
  } 
} 
 
