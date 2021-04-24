package Day2_030721;

import java.io.PrintStream;

public class ActionItem1 {
   public static void main(String[] args) {
      String[] zipCode, streetNumber;

      zipCode = new String[4];
      zipCode[0] = "11235";
      zipCode[1] = "10219";
      zipCode[2] = "10005";
      zipCode[3] = "10193";

      streetNumber = new String[4];
      streetNumber[0] = "91";
      streetNumber[1] = "1223";
      streetNumber[2] = "213";
      streetNumber[3] = "33";

      int i=0;

      while(i < zipCode.length){

         System.out.println("My zip code is " + zipCode[i] + " and my street number is " + streetNumber[i]);

         i = i+1;
      }
   }
}
