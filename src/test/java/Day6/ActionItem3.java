package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ActionItem3 {

   public static void main(String[] args) throws InterruptedException {

      //setting array lists
      String[] purchasePrice, downPayment, mortgageTerm, interestRate, pmi, startMonth, startYear;

      purchasePrice = new String[3];
      purchasePrice[0] = "500,000";
      purchasePrice[1] = "600,000";
      purchasePrice[2] = "700,000";

      downPayment = new String[3];
      downPayment[0]= "15";
      downPayment[1] = "25";
      downPayment[2] = "30";

      mortgageTerm = new String[3];
      mortgageTerm[0] = "5";
      mortgageTerm[1] = "10";
      mortgageTerm[2] = "15";

      interestRate = new String[3];
      interestRate[0] = "4";
      interestRate[1] = "5";
      interestRate[2] = "7";

      pmi = new String[3];
      pmi[0] = "2";
      pmi[1] = "3";
      pmi[2] = "4";

      startMonth = new String[3];
      startMonth[0] = "Jan";
      startMonth[1] = "May";
      startMonth[2] = "Mar";

      startYear = new String[3];
      startYear[0] = "2021";
      startYear[1] = "2022";
      startYear[2] = "2023";

      //set the path to the driver
      System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

      //define chrome options arguments
      ChromeOptions options = new ChromeOptions();

      //set the driver to incognito
      options.addArguments("incognito");

      //define the webdriver
      WebDriver driver = new ChromeDriver(options);

      //verify the title with your expected
      String actualTitle = driver.getTitle();

      if(actualTitle.equals("Auto Loan Calculator")) {
         System.out.println("The title " + actualTitle + " is correct");
      } else{
         System.out.println("The title " + actualTitle + " is incorrect");
      }

      for(int i = 0; i < purchasePrice.length; i++){
         driver.navigate().to("https://www.mlcalc.com/");

         Thread.sleep(3000);

         //Store home value first
         WebElement homeValue = driver.findElement(By.xpath("//*[@name='ma']"));
         //clear the previous data
         homeValue.clear();
         //enter the new home value
         homeValue.sendKeys(purchasePrice[i]);

         //Store dwnPayment first
         WebElement dwnPayment = driver.findElement(By.xpath("//*[@name='dp']"));
         //clear the previous data
         dwnPayment.clear();
         //enter the new home value
         dwnPayment.sendKeys(downPayment[i]);

         //Store mortgageTime first
         WebElement mortgageTime = driver.findElement(By.xpath("//*[@name='mt']"));
         //clear the previous data
         mortgageTime.clear();
         //enter the new home value
         mortgageTime.sendKeys(mortgageTerm[i]);

         //Store int first
         WebElement interestRte = driver.findElement(By.xpath("//*[@name='ir']"));
         //clear the previous data
         interestRte.clear();
         //enter the new home value
         interestRte.sendKeys(interestRate[i]);

         //Store pmi first
         WebElement pmiValue = driver.findElement(By.xpath("//*[@name='mi']"));
         //clear the previous data
         pmiValue.clear();
         //enter the new home value
         pmiValue.sendKeys(pmi[i]);

         //Store start month for the dropdown
         WebElement srtMonth = driver.findElement(By.xpath("//*[@name='sm']"));
         //select the locator using Select command
         Select dropdownMonth = new Select(srtMonth);
         //using by visible text command select month April
         dropdownMonth.selectByVisibleText(startMonth[i]);

         //Store start month for the dropdown
         WebElement srtYear = driver.findElement(By.xpath("//*[@name='sy']"));
         //select the locator using Select command
         Select dropdownYear = new Select(srtYear);
         //using by visible text command select month April
         dropdownYear.selectByVisibleText(startYear[i]);

         //click on Calculate button
         driver.findElement(By.xpath("//*[@value='Calculate']")).click();

         Thread.sleep(3000);

         String mntPayment = driver.findElements(By.xpath("//td[@class='big']")).get(0).getText();
         System.out.println("My monthly payment is " + mntPayment + " for the purchase price of " + purchasePrice[i]);

      }// end of for loop
   } //end of main
} // end of java class
