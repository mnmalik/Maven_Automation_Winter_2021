package Day9_;

import Reusable_Library.Reusable_Actions;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class test {

   public static void main(String[] args) throws IOException, InterruptedException {

      WebDriver driver = ReusableMethod.defineTheDriverByHeadless();

      //navigate to google

      driver.navigate().to("https://www.google.com");

      Thread.sleep(2300);
      //enter something on search field
      ReusableMethod.sendKeysMethod(driver, "//*[@name='q']", "Cars", "Search Field");

      //click on google search
      ReusableMethod.clickOnElement(driver, "//*[@name='btnK']", "Google Search");

   }
}


