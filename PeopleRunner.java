public class PeopleRunner
{
 public static void main(String [] args)
 {
   //DO NOT CHANGE ANY CODE IN THIS FILE.  ALL YOU NEED TO DO IS UNCOMMENT THE PRINTLNS
   //AT THE BOTTOM OF THE PAGE AS YOU COMPLETE THE METHODS IN YOUR PEOPLE.JAVA FILE
   //first array of people
   People [] myPeeps = new People [5];
   People p = new People("Pam", "Whitlock", 50);
   myPeeps[0] = p;
   p = new People("Brittany", "Whitlock", 26);
   myPeeps[1] = p;
   p = new People("Mickey", "Mouse", 76);
   myPeeps[2] = p;
   p = new People("Mickey", "Mantle", 100);
   myPeeps[3] = p;
   p = new People("John", "Doe", 20);
   myPeeps[4] = p;
   
   //second array of people
   People [] myPeeps2 = new People [5];
   p = new People("Pam", "Whitlock", 5);
   myPeeps2[0] = p;
   p = new People("Brittany", "Whitlock", 26);
   myPeeps2[1] = p;
   p = new People("Minnie", "Mouse", 32);
   myPeeps2[2] = p;
   p = new People("Fred", "Mantle", 11);
   myPeeps2[3] = p;
   p = new People("John", "Doe", 28);
   myPeeps2[4] = p;
   
      
   System.out.println("Youngest age:  " +People.youngest(myPeeps));
   System.out.println("Oldest age:  " + People.oldest(myPeeps));
   System.out.println("Average age:  " + People.avgAge(myPeeps));
   System.out.println("Does anyone have the first name of John? : " +  People.sameFirst(myPeeps, "John"));
   System.out.println("Does anyone have the first name of Sandy? : " +  People.sameFirst(myPeeps, "Sandy"));
   System.out.println("Do all people have even numbered ages? :  " +People.allEven(myPeeps));
   System.out.println("Do all people have even numbered ages? :  " +People.allEven(myPeeps2));
   System.out.println("How many people have the last name:  Whitlock?  " + People.sameLastName(myPeeps, "Whitlock"));
   System.out.println("How many people have the last name:  Brackett?  " + People.sameLastName(myPeeps, "Brackett"));
   System.out.println("Are there any duplicate first names in myPeeps?  " + People.duplicateFirstNames(myPeeps));
   System.out.println("Are there any duplicate first names in myPeeps2? " + People.duplicateFirstNames(myPeeps2));
   People.sideBySide(myPeeps);
   People.sideBySide(myPeeps2);
 }
}