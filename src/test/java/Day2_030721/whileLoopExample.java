package Day2_030721;

public class whileLoopExample {
   public static void main(String[] args) {
      String[] cities;

      cities = new String[4];
      cities[0] = "Brooklyn";
      cities[1] = "Brooklyn";
      cities[2] = "Brooklyn";
      cities[3] = "Brooklyn";

      //set the initializer i
      int i = 0;

      //set the gate keeper/end point for while
      while( i < cities.length){

         System.out.println("My city is " + cities[i]);

         //set the counter
         i = i +1;

      } //end of while loop

   }

}
