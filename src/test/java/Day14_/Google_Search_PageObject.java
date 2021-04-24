package Day14_;

import Google_Page_Object.Base_Class;
import Reusable_Library.Abstract_Class;
import org.jsoup.Connection;
import org.testng.annotations.Test;

public class Google_Search_PageObject extends Abstract_Class {


    @Test
    public void googleSearch(){
       driver.navigate().to("https://www.google.com");

        Base_Class.googleHomePage().EnterKeywordOnGoogleSearch("cars");
        Base_Class.googleHomePage().SubmitOnGoogleSearchButton();


    }

}
