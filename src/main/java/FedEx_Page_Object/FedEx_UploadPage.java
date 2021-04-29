package FedEx_Page_Object;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FedEx_UploadPage extends Abstract_Class {

   //declare a local logger so you can use it in your page class
   ExtentTest logger;
   public FedEx_UploadPage(WebDriver driver){
      PageFactory.initElements(driver, this);
      this.logger = Abstract_Class.logger;
   }//end of constructor class


   @FindBy(xpath = "//*[text()='Use Your File']")
   WebElement UseFile;

   @FindBy(xpath = "//*[@class='button__ok']")
   WebElement ContinueLowRes;

   @FindBy(xpath = "//*[@class='quantity-field']")
   WebElement Quantity;

   @FindBy(xpath = "//*[@name='update_quanity-addToCart-lbl']")
   WebElement Cart;


   //create a method for click on upload a file
   public void clickUseFile() {
      Reusable_Actions_PageObject.clickOnElement(driver, UseFile, logger, "Use My File");
   }//end of click

   //create a method for continuing with low res
   public void continueLowResolution() {
      Reusable_Actions_PageObject.clickOnElement(driver, ContinueLowRes, logger, "Continue with Existing");
   }//end of click

   //create a method for changing quantity
   public void changeQuantity(String quantity) {
      Reusable_Actions_PageObject.sendKeysMethod(driver, Quantity, quantity, logger, "Update Quantity");
   }//end of send keys

   //create a method for continuing with low res
   public void AddToCart() {
      Reusable_Actions_PageObject.clickOnElement(driver, Cart, logger, "Add To Cart");
   }//end of click


   public void uploadFile(String fileLocation){
      try {
         //Setting clipboard with file location
         StringSelection stringSelection = new StringSelection(fileLocation);
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
         //native key strokes for CTRL, V and ENTER keys
         Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
      } catch (Exception exp) {
         exp.printStackTrace();
      }
   }

}
