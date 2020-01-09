import java.util.Scanner;
public class GradingQuizzes {
  public static void main (String [] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // taking in userInputs
    System.out.println("How many questions are in the quiz?");
    int questions = scan.nextInt();
    
    int[] key = new int[questions];
    int keyInput;
    
    System.out.println("Please enter the key.");
    for (int i = 0; i < questions; i++)
    {
      keyInput = scan.nextInt();
      key[i] = keyInput;  
    }
    

    
    
    System.out.println("Grade another quiz? (y/n).");
    String shouldGrade = scan.next();
    
    while (shouldGrade.equals("y"))
    {
      // variables
      int correct = 0;
      int answers = 0;
      
      // grading quizzes
      System.out.println("Enter the student's answers.");
      for (int i = 0; i < questions; i++)
      {
        answers = scan.nextInt();
        if (answers == key[i])
          correct += 1;
      }
      
      double average = (double)correct/questions * 100;
      
      // results
      System.out.println("This student got " + correct + " questions correct.");
      System.out.println("This student got a " + average + "%");
      
      System.out.println("Grade another quiz? (y/n).");
      shouldGrade = scan.next();
    }
    
  }
}