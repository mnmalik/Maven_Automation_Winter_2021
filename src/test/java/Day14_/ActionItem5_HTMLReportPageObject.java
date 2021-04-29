package Day14_;

import Express_Page_Object.Express_Base_Class;
import Reusable_Library.Abstract_Class;
import org.testng.annotations.Test;


public class ActionItem5_HTMLReportPageObject extends Abstract_Class{

   @Test
   public void ExpressCheckout() throws InterruptedException {
         //delete cookies and navigate to express
         driver.manage().deleteAllCookies();
         driver.navigate().to("https://www.express.com/");
         Thread.sleep(1000);

         //Home Page
         Express_Base_Class.expressHomePage().ExitPopUpButton();
         Express_Base_Class.expressHomePage().hoverToMensTab();
         Express_Base_Class.expressHomePage().clickOnMensShirts();
         Thread.sleep(2000);

         //Shirts Page
         Express_Base_Class.expressShirtsPage().clickOnFirstShirt();
         Thread.sleep(1000);

         //First Shirt Page
         Express_Base_Class.expressFirstShirtPage().changeSize();
         Express_Base_Class.expressFirstShirtPage().clickOnAddToBag();
         Express_Base_Class.expressFirstShirtPage().clickOnViewBag();
         Thread.sleep(1000);

         //Shopping Bag Page
         Express_Base_Class.expressShoppingBagPage().changeQuantity("2");
         Express_Base_Class.expressShoppingBagPage().clickOnCheckout();
         Express_Base_Class.expressShoppingBagPage().clickOnCheckoutAsGuest();
         Thread.sleep(1000);

         //CheckOut Page
         Express_Base_Class.expressCheckOutPage().inputLastName("Kyrie");
         Express_Base_Class.expressCheckOutPage().inputFirstName("Irving");
         Express_Base_Class.expressCheckOutPage().inputEmail("kyrie.irving@gmail.com");
         Express_Base_Class.expressCheckOutPage().inputConfirmEmail("kyrie.irving@gmail.com");
         Express_Base_Class.expressCheckOutPage().inputPhoneNumber("6311111124");
         Express_Base_Class.expressCheckOutPage().clickOnContinue();
         Thread.sleep(1000);
         Express_Base_Class.expressCheckOutPage().inputAddress("123 Barclays Center");
         Express_Base_Class.expressCheckOutPage().inputZipCode("10049");
         Express_Base_Class.expressCheckOutPage().inputCity("New York");
         Express_Base_Class.expressCheckOutPage().inputState("NY");
         Thread.sleep(1000);
         Express_Base_Class.expressCheckOutPage().clickOnContinue2();
         Thread.sleep(3000);
         Express_Base_Class.expressCheckOutPage().clickOnContinueDelivery();
         Thread.sleep(1000);
         Express_Base_Class.expressCheckOutPage().inputCCNumber("5122371506584991");
         Express_Base_Class.expressCheckOutPage().inputCCMonth("11");
         Express_Base_Class.expressCheckOutPage().inputCCYear("24");
         Express_Base_Class.expressCheckOutPage().inputCCV("232");
         Express_Base_Class.expressCheckOutPage().clickOnPlaceOrder();
         Express_Base_Class.expressCheckOutPage().captureErrorMessage();

   }//end of Express Checkout Test

}// end of main class
