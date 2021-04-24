package Express_Page_Object;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_CheckOutPage extends Abstract_Class {

   //declare a local logger so you can use it in your page class
   ExtentTest logger;
   public Express_CheckOutPage(WebDriver driver){
      PageFactory.initElements(driver,this);
      this.logger = Abstract_Class.logger;
   }//end of constructor class

   //define all the WebElement you need using @FindBy concept
   @FindBy(xpath = "//*[@name ='lastname']")
   WebElement LastName;

   @FindBy(xpath = "//*[@name ='firstname']")
   WebElement FirstName;

   @FindBy(xpath = "//*[@name ='email']")
   WebElement Email;

   @FindBy(xpath = "//*[@name ='confirmEmail']")
   WebElement ConfirmEmail;

   @FindBy(xpath = "//*[@name ='phone']")
   WebElement PhoneNumber;

   @FindBy(xpath = "//*[@class='btn _9yfmt _194FD _2tFXQ _2SogC']")
   WebElement Continue1;

   @FindBy(xpath = "//*[@name ='shipping.line1']")
   WebElement Addy;

   @FindBy(xpath = "//*[@name ='shipping.postalCode']")
   WebElement ZipCode;

   @FindBy(xpath = "//*[@name ='shipping.city']")
   WebElement City;

   @FindBy(xpath = "//*[@name = 'shipping.state']")
   WebElement State;

   @FindBy(xpath = "//*[@class='btn _9yfmt _194FD _2tFXQ _2SogC']")
   WebElement Continue2;

   @FindBy(xpath = "//*[@class='btn _9yfmt _194FD _2tFXQ _2SogC']")
   WebElement ContinueForDeliveryOptions;

   @FindBy(xpath = "//*[@name ='creditCardNumber']")
   WebElement CCNumber;

   @FindBy(xpath = "//*[@name = 'expMonth']")
   WebElement CCMonth;

   @FindBy(xpath = "//*[@name = 'expYear']")
   WebElement CCYear;

   @FindBy(xpath = "//*[@name ='cvv']")
   WebElement CVV;

   @FindBy(xpath = "//*[text()='Place Order']")
   WebElement PlaceOrder;

   @FindBy(xpath = "//*[@id='rvn-note-NaN']")
   WebElement ErrorMessage;

   //create a method for inputting last name
   public void inputLastName(String userValue){
      Reusable_Actions_PageObject.sendKeysMethod(driver, LastName,userValue, logger,"Last Name");
   } //end of method for inputting last name

   public void inputFirstName(String userValue) {
      Reusable_Actions_PageObject.sendKeysMethod(driver, FirstName, userValue, logger, "First Name");
   }

   public void inputEmail(String userValue){
      Reusable_Actions_PageObject.sendKeysMethod(driver, Email, userValue, logger, "Email Address");
   }

   public void inputConfirmEmail(String userValue){
      Reusable_Actions_PageObject.sendKeysMethod(driver, ConfirmEmail, userValue, logger, "Confirm Email Address");
   }

   public void inputPhoneNumber(String userValue){
      Reusable_Actions_PageObject.sendKeysMethod(driver, PhoneNumber, userValue, logger, "Input Phone Number");
   }

   public void clickOnContinue(){
      Reusable_Actions_PageObject.clickOnElement(driver, Continue1, logger, "Click on Continue");
   }

   public void inputAddress(String userValue){
      Reusable_Actions_PageObject.sendKeysMethod(driver, Addy, userValue, logger, "Input Street Address");
   }

   public void inputZipCode(String userValue){
      Reusable_Actions_PageObject.sendKeysMethod(driver, ZipCode, userValue, logger, "Input ZipCode");
   }

   public void inputCity(String userValue){
      Reusable_Actions_PageObject.sendKeysMethod(driver, City, userValue, logger, "City");
   }

   public void inputState(String userValue){
      Reusable_Actions_PageObject.dropdownByText(driver, State, userValue, logger, "State");
   }

   public void clickOnContinue2(){
      Reusable_Actions_PageObject.clickOnElement(driver, Continue2, logger, "Click on Continue");
   }

   public void clickOnContinueDelivery(){
      Reusable_Actions_PageObject.clickOnElement(driver, ContinueForDeliveryOptions, logger, "Click on Continue");
   }

   public void inputCCNumber(String userValue){
      Reusable_Actions_PageObject.sendKeysMethod(driver, CCNumber, userValue, logger, "CCNumber");
   }

   public void inputCCMonth(String userValue){
      Reusable_Actions_PageObject.dropdownByText(driver, CCMonth, userValue, logger, "CCMonth");
   }

   public void inputCCYear(String userValue){
      Reusable_Actions_PageObject.dropdownByText(driver, CCYear, userValue, logger, "CCYear");
   }

   public void inputCCV(String userValue){
      Reusable_Actions_PageObject.sendKeysMethod(driver, CVV, userValue, logger, "CCV Code");
   }

   public void clickOnPlaceOrder(){
      Reusable_Actions_PageObject.clickOnElement(driver, PlaceOrder, logger, "Click on Place Order");
   }

   public void captureErrorMessage(){
      String Error = Reusable_Actions_PageObject.captureText(driver, ErrorMessage, 0 ,logger, "Capture Error Message");
      logger.log(LogStatus.INFO,"The error message is " + Error);
   }

}//end of class
