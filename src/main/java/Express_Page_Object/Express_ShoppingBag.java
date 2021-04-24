package Express_Page_Object;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_ShoppingBag extends Abstract_Class {

   //declare a local logger so you can use it in your page class
   ExtentTest logger;
   public Express_ShoppingBag(WebDriver driver){
      PageFactory.initElements(driver,this);
      this.logger = Abstract_Class.logger;
   }//end of constructor class

   //define all the WebElement you need using @FindBy concept
   @FindBy(xpath = "//*[@id = 'qdd-0-quantity']")
   WebElement quantity;

   @FindBy(xpath = "//*[@id='continue-to-checkout']")
   WebElement Checkout;

   @FindBy(xpath = "//*[text()='Checkout as Guest']")
   WebElement CheckoutAsGuest;

   //create a method for changing the quantity
   public void changeQuantity(String userValue){
      Reusable_Actions_PageObject.dropdownByText(driver, quantity, userValue, logger,"Quantity");
   } //end of method for changing the quantity

   //create a method for continuing to checkout
   public void clickOnCheckout (){
      Reusable_Actions_PageObject.clickOnElement(driver, Checkout,logger,"Continue to Checkout");
   } //end of click checkout

   //create a method for continuing as guest
   public void clickOnCheckoutAsGuest(){
      Reusable_Actions_PageObject.clickOnElement(driver,CheckoutAsGuest,logger,"Continue to Checkout As Guest");
   }//end of click  as guest

} //end of class
