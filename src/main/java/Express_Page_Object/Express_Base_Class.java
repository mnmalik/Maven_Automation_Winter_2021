package Express_Page_Object;

import Google_Page_Object.Google_Home;
import Reusable_Library.Abstract_Class;

import java.sql.Driver;

public class Express_Base_Class extends Abstract_Class {


    //this page class is a static reference for the page object classes
    //so I can use it on my test class

   public static Express_Home expressHomePage(){
      Express_Home expressHomePage = new Express_Home(driver);
      return expressHomePage;
   }

   public static Express_ShirtsPage expressShirtsPage(){
      Express_ShirtsPage expressShirtsPage = new Express_ShirtsPage(driver);
      return expressShirtsPage;
   }//end of expressShirtsPage method

   public static Express_FirstShirt expressFirstShirtPage(){
      Express_FirstShirt expressFirstShirtPage = new Express_FirstShirt(driver);
      return expressFirstShirtPage;
   }//end of expressFirstShirtPage method

   public static Express_ShoppingBag expressShoppingBagPage(){
      Express_ShoppingBag expressShoppingBagPage = new Express_ShoppingBag(driver);
      return expressShoppingBagPage;
   }//end of expressShoppingBagPage method

   public static Express_CheckOutPage expressCheckOutPage(){
      Express_CheckOutPage expressCheckOutPage = new Express_CheckOutPage(driver);
      return expressCheckOutPage;
   }//end of expressCheckOutPage method





}
