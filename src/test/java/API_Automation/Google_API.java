package API_Automation;

import Reusable_Library.Abstract_Class;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class Google_API extends Abstract_Class {
   //declare the api variable outside
   String apiKey = "AIzaSyCWlMb2GrSqF7i6EGwJC-byvj-qJ4vCuCs";
   @Test(priority = 1)
   public void googleSearchApiTest() throws InterruptedException {
      RestAssured.baseURI = "https://www.googleapis.com/customsearch";
      RestAssured.basePath = "/v1";
      Response Resp=
         given()
            .queryParam("key",apiKey)
            .queryParam("cx","83a37427eea196479")
            .queryParam("q","Mercedes")
            .when() //there is no condition for this api
            .get()
            .then()
            .extract()
            .response(); //will allow you to capture the json think of this as getText();

      //want to verify the status code is 200
      if(Resp.statusCode() == 200){
         System.out.println("Status code is 200 and successful");
      } else {
         System.out.println("Status code is not successful " + Resp.statusCode());
      }

      //verify the link count on the items arraylist is at least 1 or more
      ArrayList linkCount = Resp.path("items.link");
      if(linkCount.size() >= 1){
         System.out.println("Link count is greater than or equal to 1 " + linkCount.size());
      } else {
         System.out.println("Link count is not valid " + linkCount.size());
      }

      //run a loop and navigate to top 5 link and very the title matches
      for(int i = 0; i < 5; i++){
         String linkUrl = Resp.path("items.link["+i+"]");
         driver.navigate().to(linkUrl);
         Thread.sleep(2000);
         String title = Resp.path("items.title["+i+"]");
         //with the title that appears on ui using getText method

         //if expected title = actual pass else fail
      }

   }//end of test 1

}
