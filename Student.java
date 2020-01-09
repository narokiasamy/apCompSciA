// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student’s info. 
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data 
    private String name;
    private int testScore1;
    private int testScore2;
    
    Scanner scan = new Scanner(System.in);

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
      name = studentName;
      testScore1 = 0;
      testScore2 = 0;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
      System.out.println("Enter " + name +"'s score for test 1:");
      testScore1 = scan.nextInt();
      System.out.println("Enter " + name +"'s score for test 2:");
      testScore2 = scan.nextInt();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //Write the header for getAverage
    public double getAverage()
    {
      return (testScore1 + testScore2)/2;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //Write the header for printName
    public String printName()
    {
      return name;
    }

    // Write the toString method:  Output in the following format
    public String toString()
    {
      return ("Name: " + name + "\tTest1: " + testScore1 + " \tTest2: " + testScore2);
    }
    // Name: Joe  Test1: 85  Test2: 91


}
