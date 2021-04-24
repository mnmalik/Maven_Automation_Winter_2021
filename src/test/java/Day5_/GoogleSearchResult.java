package Day5_;

import Day4_.SplitCommand;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResult {

   public static void main(String[] args) {

      //Set property of chrome driver
      System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
      //define the web driver
      WebDriver driver = new ChromeDriver();

      //navigate to google
      driver.navigate().to("https://www.google.com");

      // maximize the browser screen
      driver.manage().window().maximize();

      // enter a key word
      driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");

      // hit submit on a google search
      driver.findElement(By.xpath("//*[@name='btnK']")).submit();

      // hit submit on a google search
      //driver.findElement(By.xpath("//*[@class='gb_b']")).submit();

      //
      String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

      //split and extract out the search number
      String[] arrayResults = searchResult.split(" ");
      //print

      System.out.println("The search number is " + arrayResults[1]);

   } // end of main method

}
