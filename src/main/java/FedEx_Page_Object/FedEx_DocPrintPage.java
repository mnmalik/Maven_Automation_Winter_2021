package FedEx_Page_Object;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedEx_DocPrintPage extends Abstract_Class {

   //declare a local logger so you can use it in your page class
   ExtentTest logger;
   public FedEx_DocPrintPage(WebDriver driver){
      PageFactory.initElements(driver, this);
      this.logger = Abstract_Class.logger;
   }//end of constructor class


   @FindBy(xpath = "//a[@class='get-started']")
   WebElement GetStarted;


   //create a method for get started on doc printing
   public void clickGetStarted() {
      Reusable_Actions_PageObject.clickOnElement(driver, GetStarted, logger, " Get Started on Doc Printing");
   }//end of exiting pop-up

}
