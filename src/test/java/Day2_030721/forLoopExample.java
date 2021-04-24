package Day2_030721;

public class forLoopExample {
   public static void main(String[] args) {
      String[] cities, houseAddress, ZipCode;

      cities = new String [4];
      cities[0] = "Brooklyn";
      cities[1] = "Bronx";
      cities[2] = "Manhattan";
      cities[3] = "Queens";

      houseAddress = new String[4];
      houseAddress[0] = "222";
      houseAddress[1] = "489";
      houseAddress[2] = "393";
      houseAddress[3] = "102";

      //set your iteration to loop through all the values from cities
      for(int i = 0;i < cities.length; i++){
         //print out all the values in one print statement
         System.out.println("My city is " + cities[i] + " house address is " + houseAddress[i]);
      }//end of the for loop

   } //end of main method
}//end of java class
