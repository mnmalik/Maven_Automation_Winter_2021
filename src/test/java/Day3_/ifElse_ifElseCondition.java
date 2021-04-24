package Day3_;

public class ifElse_ifElseCondition {
   public static void main(String[] args) {

      //using multiple conditional statements
      int a,b,c;
      a = 0;
      b = 2;
      c = 3;

      //verify either a+b>c, a+b<c, a+b=c

      if(a+b > c){
         System.out.println("a and b are greater than c");

      } else if (a+b < c) {
         System.out.println("a and b are less than c");

      } else {
         System.out.println("a and b is equal to c");
      }
   }
}
