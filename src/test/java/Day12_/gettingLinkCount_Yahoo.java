package Day12_;

import Reusable_Library.Abstract_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class gettingLinkCount_Yahoo extends Abstract_Class {

   @Test
   public void linkCount() throws IOException, InterruptedException {
      driver.navigate().to("https://www.yahoo.com");

      Thread.sleep(3000);

      //store the arraylist with class attribute for the links
      ArrayList<WebElement> linkCount = new ArrayList(driver.findElements(By.xpath("//*[contains(@class,'_yb_12gb1')]")));
      //print out the count of the links
      System.out.println("Link count is " + linkCount.size());

      //I want to click on each link and navigate back to the home page
      for(int i = 0; i < linkCount.size();i++){
         driver.navigate().to("https://www.yahoo.com");
         Thread.sleep(2000);
         linkCount = new ArrayList(driver.findElements(By.xpath("//*[contains(@class,'_yb_12gb1')]")));
         linkCount.get(i).click();
         Thread.sleep(1000);
      }
   }//end of test
}
