public class multiplicationTable {
    public static void main (String [] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer. The program wil generate a multiplication table up to the integer that has been entered.");
    int userInput = scan.nextInt();
    
    for (int i = 1; i <= userInput; i++)
    {
      System.out.print(i + ":");
      for (int j = 1; j <= userInput; j++)
        System.out.print(i*j + " ");
      
      System.out.println();
    }    
    }
}    
    
    