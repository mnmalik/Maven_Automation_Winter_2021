package Express_Page_Object;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_Home extends Abstract_Class {

   //declare a local logger so you can use it in your page class
   ExtentTest logger;
   public Express_Home(WebDriver driver){
      PageFactory.initElements(driver, this);
      this.logger = Abstract_Class.logger;
   }//end of constructor class


   //define all the WebElement you need using @FindBy concept
   @FindBy(xpath = "//a[@href='/mens-clothing']")
   WebElement MensTab;

   @FindBy(xpath = "//button[@aria-label='Focus Close Modal']")
   WebElement PopUpButton;

   @FindBy(xpath = "//a[@href='/mens-clothing/shirts/cat410008']")
   WebElement MenShirts;


   //create a method for exiting pop-up
   public void ExitPopUpButton() {
      Reusable_Actions_PageObject.clickOnElement(driver, PopUpButton, logger, "Close Pop-Up");
   }//end of exiting pop-up

   // create a method for mens tab hover
   public void hoverToMensTab() {
      Reusable_Actions_PageObject.mouseHover(driver, MensTab, logger, "Mens Tab Hover");
   }//end of hover

   //create a method for clicking On Mens Shirts
   public void clickOnMensShirts() {
      Reusable_Actions_PageObject.clickOnElement(driver, MenShirts, logger, "Click on Mens Shirts");
   }//end of clicking on mens shirts

}//end of class
