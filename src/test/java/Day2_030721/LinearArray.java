package Day2_030721;

public class LinearArray {

   public static void main(String[] args) {
      //declare the variables
      String[] cities;
      int[] streetNumber, houseNumber;

      cities = new String[]{"Brooklyn","Queens","Manhattan","Bronx","Staten Island"};
      streetNumber = new int[]{222,345,598,030,1000};
      houseNumber = new int[]{12,324,948,284,491};

      //Printing queens and street number as 222;
      System.out.println("My city is " + cities[1] + ", street number is " + streetNumber[0] + ", and house number is " + houseNumber[0]);

   }//end of main method

}//end of java class
