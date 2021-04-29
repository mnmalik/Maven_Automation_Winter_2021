package FedEx_Page_Object;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedEx_CheckOutPage extends Abstract_Class {

   //declare a local logger so you can use it in your page class
   ExtentTest logger;
   public FedEx_CheckOutPage(WebDriver driver){
      PageFactory.initElements(driver, this);
      this.logger = Abstract_Class.logger;
   }//end of constructor class


   @FindBy(xpath = "//select[@id='radiusSelect']")
   WebElement radiusselect;

   @FindBy(xpath = "//input[@name='locSearchTxt']")
   WebElement zipCode;

   @FindBy(xpath = "//a[@name='delivery_options-saveNcont']")
   WebElement continueButton;

   @FindBy(xpath = "//li[@id='0346']")
   WebElement locationDetails;

   //create a method for dropdown radius update
   public void updateRadius(String userValue) {
      Reusable_Actions_PageObject.dropdownByText(driver, radiusselect,userValue, logger, "Radius Selection");
   }//end of method

   //create a method for inputting the zipcode
   public void inputZipCode(String userValue) {
      Reusable_Actions_PageObject.sendKeysMethod(driver, zipCode, userValue, logger, "ZipCode");
   }//end of click

   public void clickContinue(){
      Reusable_Actions_PageObject.clickOnElement(driver,continueButton,logger,"Continue");
   } //end of click method

   public void captureDetails(){
      String Address = Reusable_Actions_PageObject.captureText(driver,locationDetails,0,logger,"Location Details");
      System.out.println("The address is " + Address);
      logger.log(LogStatus.INFO,"The address is " + Address);
   }//end of capture



}
