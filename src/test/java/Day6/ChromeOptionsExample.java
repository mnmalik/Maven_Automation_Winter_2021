package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
   public static void main(String[] args) {

      //set the path to the driver
      System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

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

      //navigate to the website
      driver.navigate().to("https://www.yahoo.com");
   }
}
