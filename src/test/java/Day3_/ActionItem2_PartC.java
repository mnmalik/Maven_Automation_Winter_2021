package Day3_;

public class ActionItem2_PartC {
   public static void main(String[] args) {

      String cities[] = new String[4];
      cities[0] = "Manhattan";
      cities[1] = "Brooklyn";
      cities[2] = "Queens";
      cities[3] = "Bronx";


      for( int i = 0; i < cities.length; i++){

         if (cities[i] == "Brooklyn") {
            System.out.println("The city is " + cities[i]);
         }
         else if (cities[i] == "Manhattan") {
            System.out.println("The city is " + cities[i]);
         }
      } // end of for loop
   } //end of main
}
