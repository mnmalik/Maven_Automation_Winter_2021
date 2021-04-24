package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class mortageCalcTestScenario {
   public static void main(String[] args) throws InterruptedException {

      //set the path to the driver
      System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

      //define chrome options arguments
      ChromeOptions options = new ChromeOptions();

      //set the driver to maximize (only works for Windows)
      options.addArguments("start-maximized");

      //set the driver to incognito
      options.addArguments("incognito");

      //start headless
      //options.addArguments("headless");

      //define the webdriver
      WebDriver driver = new ChromeDriver(options);

      driver.navigate().to("https://www.mortgagecalculator.org");

      //verify the title with your expected

      String actualTitle = driver.getTitle();
      String actualURL = driver.getCurrentUrl();
      if (actualTitle.equals("Mortgage Calculator")) {

         System.out.println("Title Matches for " + actualURL );
      } else {
         System.out.println("Title doesn't match" + actualTitle);
      }// end of condition

      //Store home value first
            System.out.println("Entering value on home value");
            WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
      //clear the previous data
            homeValue.clear();
      //enter the new home value
            homeValue.sendKeys("350000");

      //Store down payment first
            System.out.println("Entering value on down payment");
            WebElement dPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
      //clear the previous data
            dPayment.clear();
      //enter the new down payment
            dPayment.sendKeys("220000");

      //select april on month dropdown
            WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
      //select the locator using Select command
            Select dropdown = new Select(startMonth);
      //using by visible text command select month April
            dropdown.selectByVisibleText("Apr");

      //if dropdown is not under select tag then you have to use click command twice
      //click on dropdown
      //startMonth.click();
      //click on dropdown value by text
      //driver.findElement(By.xpath("//*[text()='May']")).click();

      //click on Calculate button
            driver.findElement(By.xpath("//*[@value='Calculate']")).click();

            Thread.sleep(3000);

      //capture the monthly payment using findElements with first index
            String mntPayment = driver.findElements(By.xpath("//div[@class='left-cell']")).get(0).getText();
            System.out.println("My monthly payment is " + mntPayment);

   } // end of main
} // end of java class

