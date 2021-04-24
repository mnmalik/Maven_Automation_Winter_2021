package Day3_;

public class ActionItem2_PartB {
   public static void main(String[] args) {
      String letterGrade = "B";

      switch (letterGrade){
         case("A"):
            System.out.println("Excellent");
         break;
         case("B"):
            System.out.print("Well Done");
         break;
         case("C"):
            System.out.println("Satisfactory");
            break;
         case("D"):
            System.out.println("Passed");
            break;
         case("F"):
            System.out.println("Failed");
            break;
         default: System.out.println("Invalid Grade");
      }
   }
}
