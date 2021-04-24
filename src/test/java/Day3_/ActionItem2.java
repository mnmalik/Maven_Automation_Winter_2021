package Day3_;

public class ActionItem2 {

   public static void main(String[] args) {
      //Condition Assignment

      int grade;
      grade = 89; //or int grade = 89

      if( grade >= 90){
         System.out.println("The grade of " + grade + " is A");
      }
      else if( grade >= 80 && grade <90){
         System.out.println("The grade of " + grade + " is B");
      }
      else if( grade >= 70 && grade <80){
         System.out.println("The grade of " + grade + " is C");
      }
      else if( grade >= 60 && grade <70){
         System.out.println("The grade of " + grade + " is D");
      }
      else{
         System.out.println("The grade of " + grade + " is F");
      }
   } // end of main
}
