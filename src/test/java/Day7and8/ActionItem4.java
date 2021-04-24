package Day7and8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;


public class ActionItem4 {

   public static void main(String[] args) throws InterruptedException {

      ArrayList<String> findLocationByZip = new ArrayList<>();
      findLocationByZip.add("11235");
      findLocationByZip.add("11231");
      findLocationByZip.add("10005");

      ArrayList<String> locationType = new ArrayList<>();
      locationType.add("Collection Boxes");
      locationType.add("Self-Service Kiosks");
      locationType.add("Contract Postal Unit");

      ArrayList<String> locationMile = new ArrayList<>();
      locationMile.add("10 Miles");
      locationMile.add("20 Miles");
      locationMile.add("25 Miles");


      //set the path to the driver
      System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

      //define chrome options arguments
      ChromeOptions options = new ChromeOptions();

      //set the driver to incognito
      options.addArguments("incognito");

      //define the webdriver
      WebDriver driver = new ChromeDriver(options);
      Actions mouseAction = new Actions(driver);

      //verify the title with your expected
      String actualTitle = driver.getTitle();
      if(actualTitle.equals("Welcome | USPS")) {
         System.out.println("The title" + actualTitle + " is correct");
      } else{
         System.out.println("The title" + actualTitle + " is incorrect");
      }

      //start of the for loop to account for all of the inputs for variables to create output

      for(int i = 0; i < findLocationByZip.toArray().length; i++) {
         try {
            driver.navigate().to("https://www.usps.com/");
         } catch (Exception e){
            System.out.println("UNABLE to navigate to USPS.com" + e);
         }

         Thread.sleep(3000);

         try {
            WebElement sendHover = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
            mouseAction.moveToElement(sendHover).perform();
         } catch (Exception e){
            System.out.println("UNABLE to hover to Send in the Nav-Bar" + e);
         }

         try {
            WebElement findUSPS = driver.findElement(By.xpath("//a[text()= 'Find USPS Locations']"));
            mouseAction.moveToElement(findUSPS).click().perform();
         } catch (Exception e){
            System.out.println("UNABLE to click on the Find USPS Locations option" + e);
         }

         //Store locationByZip first
         try {
            WebElement locationByZip = driver.findElement(By.xpath("//*[@id='city-state-input']"));
            //clear the previous data
            locationByZip.clear();
            //enter the locationByZip value
            locationByZip.sendKeys(findLocationByZip.get(i));
         } catch (Exception e) {
            System.out.println("UNABLE to input the ZipCode" + e);
         }

         //Store locationType first
         try {
            WebElement locType = driver.findElement(By.xpath("//*[@id='post-offices-select']"));
            //click on the dropdowns options
            mouseAction.moveToElement(locType).click().perform();
            //input the locationType value and enter it
            locationType.get(i);
            driver.findElement(By.xpath("//*[text()='" + locationType.get(i) + "']")).click();
         } catch (Exception e){
            System.out.println("UNABLE to select the collection type" + e);
         }

         //Store locMile first
        try{ WebElement locMile = driver.findElement(By.xpath("//*[@id='within-select']"));
         //click on the dropdowns options
         mouseAction.moveToElement(locMile).click().perform();
         //input the locationMile value and enter it
         driver.findElement(By.xpath("//*[text()='"+locationMile.get(i)+"']")).click();
        } catch (Exception e){
           System.out.println("UNABLE to select miles" + e);
        }

         try{
         WebElement SearchBtn = driver.findElement(By.xpath("//*[@id = 'searchLocations']"));
         mouseAction.moveToElement(SearchBtn).click().perform();
        } catch (Exception e){
           System.out.println("UNABLE to search " + e);
        }
         Thread.sleep(3000);

         try{
         ArrayList<WebElement> Links = new ArrayList<>(driver.findElements(By.xpath("//*[@class='list-item-location popover-trigger']")));

         if(i==0){
            Links.get(0).click();
         } else if(i==1){
            Links.get(1).click();
         } else if(i==2){
            Links.get(2).click();
         }

         } catch (Exception e){
            System.out.println("UNABLE to click on the different links" + e);
         }

         Thread.sleep(6000);

         try{
         //String Address = driver.findElement(By.xpath("//*[@class ='address-wrapper']")).getText();
         String Address1 = driver.findElement(By.xpath("//*[@id ='detailAddress']")).getText();
         String Address2 = driver.findElement(By.xpath("//*[@id ='cityStateZip']")).getText();

         System.out.println("The address is " + Address1 + " " + Address2);
         } catch (Exception e){
            System.out.println("UNABLE to print the address " + e);
         }

         try {
            String Hours = driver.findElement(By.xpath("//*[@class = 'col-md-12 col-sm-12 col-xs-12 store-hour-container']")).getText();
            System.out.println("See here for: " + Hours);
            System.out.println(" ");
         } catch (Exception e){
         System.out.println("UNABLE to print the Hours " + e);
      }

      }
   } //end of main
} // end of java class
