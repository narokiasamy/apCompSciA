public class ExpandingAnArray{ 
  public static void main (String [] args) { 
     
    // initial array 
    int []testScores = new int[30]; 
    int count = 0; 
    int total = 0; 
    int average = 0; 
     
    for (int i = 0; i < 30; i++) 
    { 
      testScores[i] = (int)(Math.random() * 30) + 70; 
      total += testScores[i]; 
      count++; 
    } 
     
    average = total/count; 
    System.out.println("Average: " + average); 
     
    //temp array 
    int []temp = new int[testScores.length + 1]; 
 
 
    // copying intial array 
    for (int i = 0; i < testScores.length; i++) 
    { 
      temp[i] = testScores[i]; 
    } 
     
    // adding new amount 
    temp[testScores.length] = 100; 
    count += 1; 
    total += temp[testScores.length]; 
     
    average = total/count; 
    System.out.println("Average: " + average); 
     
    //initial = temp 
    testScores = temp; 
     
     
 
     
 
     
     
     
     
  } 
}