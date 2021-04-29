package FedEx_Page_Object;

import Reusable_Library.Abstract_Class;

public class FedEx_Base_Class extends Abstract_Class {


    //this page class is a static reference for the page object classes
    //so I can use it on my test class

   public static FedEx_Home fedExHomePage(){
      FedEx_Home fedExHomePage = new FedEx_Home(driver);
      return fedExHomePage;
   }

   public static FedEx_UploadPage fedExUploadPage(){
      FedEx_UploadPage fedExUploadPage = new FedEx_UploadPage(driver);
      return fedExUploadPage;
   }//end of fedExUploadPage method

   public static FedEx_CartPage fedExCartPage(){
      FedEx_CartPage fedExCartPage = new FedEx_CartPage(driver);
      return fedExCartPage;
   }//end of expressFirstShirtPage method

   public static FedEx_CheckOutPage fedExCheckOutPage(){
      FedEx_CheckOutPage fedExCheckOutPage = new FedEx_CheckOutPage(driver);
      return fedExCheckOutPage;
   }//end of expressShoppingBagPage method

   public static FedEx_DocPrintPage fedExDocPrintPage(){
      FedEx_DocPrintPage fedExDocPrintPage = new FedEx_DocPrintPage(driver);
      return fedExDocPrintPage;
   }//end of fedExDocPrintPage method

   public static FedEx_ProductsPage fedExProductsPage(){
      FedEx_ProductsPage fedExProductsPage = new FedEx_ProductsPage(driver);
      return fedExProductsPage;
   }//end of fedExProductsPage method



}
