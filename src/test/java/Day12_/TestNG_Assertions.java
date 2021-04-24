package Day12_;

import Day9_.ReusableMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class TestNG_Assertions {

   @Test
   public void assertions() throws InterruptedException, IOException {

      WebDriver driver = ReusableMethod.defineTheDriver();

      driver.navigate().to("https://www.google.com");

      //using hard assert verify the google title
      //Assert.assertEquals("google",driver.getTitle());

      SoftAssert softAssert = new SoftAssert();
      softAssert.assertEquals("google",driver.getTitle());

      //enter something on google search
      ReusableMethod.sendKeysMethod(driver,"//*[@name='q']","Cars","Search");

      //assertAll should be the last step on your test
      softAssert.assertAll();
   }//end of test

}
