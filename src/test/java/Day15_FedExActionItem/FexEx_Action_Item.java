package Day15_FedExActionItem;

import FedEx_Page_Object.FedEx_Base_Class;
import Reusable_Library.Abstract_Class;
import org.testng.annotations.Test;


public class FexEx_Action_Item extends Abstract_Class {

   @Test
   public void FedExCheckout() throws InterruptedException{
      //delete cookies and navigate to FedEx
      driver.manage().deleteAllCookies();
      driver.navigate().to("https://www.fedex.com/en-us/home.html");
      Thread.sleep(1000);

      //Home Page
      Thread.sleep(1000);
      FedEx_Base_Class.fedExHomePage().clickDesignAndPrint();
      Thread.sleep(1000);
      FedEx_Base_Class.fedExHomePage().clickUploadPrintFile();

      //Products Page
      FedEx_Base_Class.fedExProductsPage().verifyTheTitle("Fedex Office Print");
      FedEx_Base_Class.fedExProductsPage().clickOnDocPrinting();

      //Doc Print Page
      FedEx_Base_Class.fedExDocPrintPage().clickGetStarted();

      //Upload your print ready file page
      Thread.sleep(1000);
      FedEx_Base_Class.fedExUploadPage().clickUseFile();
      Thread.sleep(3000);
      FedEx_Base_Class.fedExUploadPage().uploadFile("/Users/mnmalikk/Desktop/Slayer.jpg");
      Thread.sleep(3000);
      Thread.sleep(1000);
      FedEx_Base_Class.fedExUploadPage().continueLowResolution();
      Thread.sleep(1000);
      FedEx_Base_Class.fedExUploadPage().changeQuantity("5");
      Thread.sleep(2000);
      FedEx_Base_Class.fedExUploadPage().AddToCart();

      //cart page
      Thread.sleep(3000);
      FedEx_Base_Class.fedExCartPage().ClickCheckOut();
      FedEx_Base_Class.fedExCartPage().ClickGuestCheckOut();

      //CheckoutPage
      Thread.sleep(3000);
      FedEx_Base_Class.fedExCheckOutPage().updateRadius("5 Miles");
      Thread.sleep(1000);
      FedEx_Base_Class.fedExCheckOutPage().inputZipCode("10005");
      Thread.sleep(1000);
      FedEx_Base_Class.fedExCheckOutPage().clickContinue();
      Thread.sleep(3000);
      FedEx_Base_Class.fedExCheckOutPage().captureDetails();
   }
}
