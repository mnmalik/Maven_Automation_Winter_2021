package Express_Page_Object;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_FirstShirt extends Abstract_Class {

   //declare a local logger so you can use it in your page class
   ExtentTest logger;
   public Express_FirstShirt(WebDriver driver){
      PageFactory.initElements(driver,this);
      this.logger = Abstract_Class.logger;
   }//end of constructor class

   //define all the WebElement you need using @FindBy concept
   @FindBy(xpath = "//*[text() ='M']")
   WebElement Size;

   @FindBy(xpath = "//*[text() ='Add to Bag']")
   WebElement AddToBag;

   @FindBy(xpath = "//*[text()='View Bag']")
   WebElement ViewBag;


   //create a method to change the size
   public void changeSize (){
      Reusable_Actions_PageObject.clickOnElement(driver,Size,logger, "Change the Size");
   }

   //create a method to add shirt to bag
   public void clickOnAddToBag (){
      Reusable_Actions_PageObject.clickOnElement(driver,AddToBag,logger,"Add to Bag");
   }

   //create a method to view the shopping bag
   public void clickOnViewBag(){
      Reusable_Actions_PageObject.clickOnElement(driver,ViewBag,logger, "View the Bag");
   }
}//end of class
