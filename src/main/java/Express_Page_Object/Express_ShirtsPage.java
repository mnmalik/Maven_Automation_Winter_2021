package Express_Page_Object;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_ShirtsPage extends Abstract_Class {

   //declare a local logger so you can use it in your page class
   ExtentTest logger;
   public Express_ShirtsPage(WebDriver driver){
      PageFactory.initElements(driver,this);
      this.logger = Abstract_Class.logger;
   }//end of constructor class

   //define all the WebElement you need using @FindBy concept
   @FindBy(xpath = "//a[@class = '_1-wQg']")
   WebElement clickFirstShirt;

   //create a method for clicking on the first shirt
   public void clickOnFirstShirt(){
      Reusable_Actions_PageObject.clickOnElement(driver, clickFirstShirt,logger, "Click on the first shirt");
   }//end of first shirt method

}//end of class
