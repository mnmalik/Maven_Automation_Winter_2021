package FedEx_Page_Object;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedEx_CartPage extends Abstract_Class {

   //declare a local logger so you can use it in your page class
   ExtentTest logger;
   public FedEx_CartPage(WebDriver driver){
      PageFactory.initElements(driver, this);
      this.logger = Abstract_Class.logger;
   }//end of constructor class


   @FindBy(xpath = "//*[@id='cartToCheckoutBtn']")
   WebElement CheckOut;

   @FindBy(xpath = "//a[@name='fedexSignin-continueAsGuest-btn']")
   WebElement GuestCheckOut;



   //create a method for click checkout
   public void ClickCheckOut() {
      Reusable_Actions_PageObject.clickOnElement(driver, CheckOut, logger, "CheckOut");
   }//end of click

   //create a method for click guest checkout
   public void ClickGuestCheckOut() {
      Reusable_Actions_PageObject.clickOnElement(driver, GuestCheckOut, logger, "Guest CheckOut");
   }//end of click



}
