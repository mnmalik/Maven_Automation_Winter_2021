package FedEx_Page_Object;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedEx_Home extends Abstract_Class {

   //declare a local logger so you can use it in your page class
   ExtentTest logger;
   public FedEx_Home(WebDriver driver){
      PageFactory.initElements(driver, this);
      this.logger = Abstract_Class.logger;
   }//end of constructor class


   //define all the WebElement you need using @FindBy concept
   @FindBy(xpath = "//*[@aria-label='Open Design & Print menu']")
   WebElement DesignAndPrint;

   @FindBy(xpath = "//*[@aria-label='Upload a Print-Ready File']")
   WebElement Upload_PrintReadyFile;


   //create a method for exiting pop-up
   public void clickDesignAndPrint() {
      Reusable_Actions_PageObject.clickOnElement(driver, DesignAndPrint, logger, "Design & Print");
   }//end of exiting pop-up

   // create a method for mens tab hover
   public void clickUploadPrintFile() {
      Reusable_Actions_PageObject.clickOnElement(driver, Upload_PrintReadyFile, logger, "Upload Print Ready File");
   }//end of click



}//end of class
