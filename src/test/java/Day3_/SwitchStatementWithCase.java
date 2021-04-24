package Day3_;

public class SwitchStatementWithCase {
/* a switch statement allows a variable to be
 tested for equality against a list of values
 each value is called a case and the variable being
 switched on is checked for each case */
   public static void main(String[] args) {

      /* Using switch case statements print if milkType
      is oat milk, almond milk, or organic milk
      else milk type is not recognized */

      String milkType = "oat milk";

      switch(milkType){

         case "oat milk":
            System.out.println("milk type is oat milk");
         break;
         case " almond milk":
            System.out.println("milk type is almond milk");
         break;
         case "organic milk":
            System.out.println("milk type if organic milk");
         break;
         default:
            System.out.println("Milk type not found: "+ milkType);
      } // END OF SWITCH STATEMENT

   } //END OF MAIN METHOD

} // END OF JAVA CLASS
