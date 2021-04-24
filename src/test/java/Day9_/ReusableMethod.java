package Day9_;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


import java.io.IOException;
import java.util.Collections;

public class ReusableMethod {

   //create a reusable method for navigate to a page
   public static WebDriver defineTheDriver() throws InterruptedException, IOException {
      //kill all chrome instances that are opened
      //Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
      Thread.sleep(1000);
      //set the path to the driver
      System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
      //define the chromeoptions arguments
      ChromeOptions options = new ChromeOptions();
      //maximize my driver
      options.addArguments("start-maximized");
      //set the driver to incognito(private)
      options.addArguments("incognito");
      //set it to headless
      //options.addArguments("headless");
      //define the webdriver
      WebDriver driver = new ChromeDriver(options);

      return driver;
   }//end of navigate method

   public static WebDriver defineTheDriverByHeadless() throws InterruptedException, IOException {
      //kill all chrome instances that are opened
      Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
      Thread.sleep(1000);
      //set the path to the driver
      System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
      //define the chromeoptions arguments
      ChromeOptions options = new ChromeOptions();
      //maximize my driver
      options.addArguments("start-maximized");
      //set the driver to incognito(private)
      options.addArguments("incognito");
      //set it to headless
      options.addArguments("headless");
      //define the webdriver
      WebDriver driver = new ChromeDriver(options);

      return driver;
   }//end of navigate method with headless


   //method to click on any webelement by explicit wait
   public static void clickOnElement(WebDriver driver, String xpathLocator, String elementName) {
      //define by explicit wait
      WebDriverWait wait = new WebDriverWait(driver, 15);
      //use try catch to locate an element and click on it
      try {
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator))).click();
      } catch (Exception e) {
         System.out.println("Unable to click on element " + elementName + " " + e);
      }
   }//end of click method

   //method to click on any webelement by explicit wait
   public static void clickOnElement2(WebDriver driver, String xpathLocator, String userValue, String elementName) {
      //define by explicit wait
      WebDriverWait wait = new WebDriverWait(driver, 10);
      //use try catch to locate an element and click on it
      try {
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator))).click();
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(userValue))).click();

      } catch (Exception e) {
         System.out.println("Unable to click on element " + elementName + " " + e);
      }
   }//end of click method

   //method to type on any webelement by explicit wait
   public static void sendKeysMethod(WebDriver driver, String xpathLocator, String userValue, String elementName) {
      //define by explicit wait
      WebDriverWait wait = new WebDriverWait(driver, 10);
      //use try catch to locate an element and click on it
      try {
         WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator)));
         element.clear();
         element.sendKeys(userValue);
      } catch (Exception e) {
         System.out.println("Unable to enter value on element " + elementName + " " + e);
      }
   }//end of sendkeys method

   public static void sendKeysMethodtwo(WebDriver driver, String xpathLocator, String elementName) {
      //define by explicit wait
      WebDriverWait wait = new WebDriverWait(driver, 10);
      //use try catch to locate an element and click on it
      try {
         WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator)));
         element.clear();
      } catch (Exception e) {
         System.out.println("Unable to enter value on element " + elementName + " " + e);
      }
   }//end of sendkeys method

   //  ReusableMethod.sendKeysMethod(driver,"//input[@id='ma']",size,"Purchase Price");

   public static void dropdownByText(WebDriver driver, String xpath, String userValue, String elementName) {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      try {
         WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
         Select dropDown = new Select(element);
         dropDown.selectByVisibleText(userValue);
      } catch (Exception e) {
         System.out.println("Unable to select a value from " + elementName + " " + e);
      }
   }//end of dropdown by text

   public static String captureText(WebDriver driver, String xpath, int index, String elementName) {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      String result = "";
      try {
         WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
         result = element.getText();
      } catch (Exception e) {
         System.out.println("Unable to select a value from " + elementName + " " + e);
      }
      return result;
   }//end of dropdown by text

   public static void mouseHover(WebDriver driver, String xpath, String elementName) {
      Actions mouseAction = new Actions(driver);

      try {
         WebElement sendHover = driver.findElement(By.xpath(xpath));
         mouseAction.moveToElement(sendHover).perform();
      } catch (Exception e) {
         System.out.println("UNABLE to hover to hover to element" + elementName + e);
      }//end of mouse hover

   }

   //method to submit on any webelement by explicit wait
   public static void submitOnElement(WebDriver driver,String xpathLocator, String elementName){
      //define by explicit wait
      WebDriverWait wait = new WebDriverWait(driver,10);
      //use try catch to locate an element and click on it
      try{
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator))).submit();
      } catch (Exception e) {
         System.out.println("Unable to submit on element " + elementName + " " + e);
      }
   }//end of submit method



   //method to click on any webelement by explicit wait
   public static void mouseHover(WebDriver driver, String xpathLocator, ExtentTest logger, String elementName){
      //define by explicit wait
      WebDriverWait wait = new WebDriverWait(driver,10);
      //mouse action command
      Actions actions = new Actions(driver);
      //use try catch to locate an element and click on it
      try{
         WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator)));
         actions.moveToElement(element).perform();
         logger.log(LogStatus.PASS,"Successfully hover to " + elementName);
         Thread.sleep(1000);
      } catch (Exception e) {
         System.out.println("Unable to hover to an element " + elementName + " " + e);
         logger.log(LogStatus.FAIL,"Unable to hover to an element " + elementName + " " + e);
      }
   }//end of mouseHover



   //method to click on any webelement by explicit wait
   public static void closePopupIfExist(WebDriver driver,String xpathLocator, String elementName){
      //define by explicit wait
      WebDriverWait wait = new WebDriverWait(driver,10);
      //use try catch to locate an element and click on it
      try{
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator))).click();
      } catch (Exception e) {
         System.out.println("Popup " + elementName + " is not present. Move on to the next step");
      }
   }//end of closePopupIfExist

   //method to submit on any webelement by explicit wait
   public static void submitOnElement(WebDriver driver, String xpathLocator, ExtentTest logger, String elementName){
      //define by explicit wait
      WebDriverWait wait = new WebDriverWait(driver,10);
      //use try catch to locate an element and click on it
      try{
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator))).submit();
         logger.log(LogStatus.PASS,"Successfully submit on " + elementName);
      } catch (Exception e) {
         logger.log(LogStatus.FAIL,"Unable to submit on element " + elementName + " " + e);
         System.out.println("Unable to submit on element " + elementName + " " + e);
      }
   }//end of submit method

   //method to type on any webelement by explicit wait
   public static void sendKeysMethod(WebDriver driver,String xpathLocator, String userValue,ExtentTest logger,String elementName){
      //define by explicit wait
      WebDriverWait wait = new WebDriverWait(driver,10);
      //use try catch to locate an element and click on it
      try{
         WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator)));
         element.clear();
         element.sendKeys(userValue);
         logger.log(LogStatus.PASS,"Successfully entered a value on " + elementName);
      } catch (Exception e) {
         logger.log(LogStatus.FAIL,"Unable to enter value on element " + elementName + " " + e);
         System.out.println("Unable to enter value on element " + elementName + " " + e);
      }
   }//end of sendkeys method


  /* public static void dropdownByText(WebDriver driver,String xpath,String userValue,String elementName){
      WebDriverWait wait = new WebDriverWait(driver,10);
      try{
         WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
         Select dropDown = new Select(element);
         dropDown.selectByVisibleText(userValue);
      } catch (Exception e) {
         System.out.println("Unable to select a value from " + elementName + " " + e);
      }
   }//end of dropdown by text */

   public static String captureText(WebDriver driver,String xpath,int index,ExtentTest logger,String elementName){
      WebDriverWait wait = new WebDriverWait(driver,10);
      String result = "";
      try{
         WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
         result = element.getText();
         logger.log(LogStatus.PASS,"Successfully captured a text on " + elementName);
      } catch (Exception e) {
         logger.log(LogStatus.FAIL,"Unable to select a value from " + elementName + " " + e);
         System.out.println("Unable to select a value from " + elementName + " " + e);
      }
      return result;
   }//end of capture element by text


}
