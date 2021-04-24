package Day10;

import Day9_.ReusableMethod;
import jdk.management.jfr.RecordingInfo;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;


import java.io.File;
import java.io.IOException;

public class ActionItem5 {

   public static void main(String[] args) throws IOException, InterruptedException, BiffException, WriteException {

      //set the driver using reusable method
      WebDriver driver = ReusableMethod.defineTheDriver();


//Step1: locate the path for readable file that we created in excel
      Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/expressWebsite.xls"));

//Step 2: create a writable workbook that will mimic the data from readable
      WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/expressWebsite_Result.xls"), readableBook);

//Ste3 : read everything from writable sheet
      WritableSheet writableSheet = writableWorkbook.getSheet(0);

//Step 4: get the row count
      int rowCount = writableSheet.getRows();

//this is where the for loop will start to iterate through your excel data
      for (int i = 1; i < rowCount; i++) {

         //columns are hard coded and row is dynamic(i)
         String size = writableSheet.getCell(0, i).getContents();
         String quantity = writableSheet.getCell(1, i).getContents();
         String firstName = writableSheet.getCell(2, i).getContents();
         String lastName = writableSheet.getCell(3, i).getContents();
         String email = writableSheet.getCell(4, i).getContents();
         String phone = writableSheet.getCell(5, i).getContents();
         String streetAdress = writableSheet.getCell(6, i).getContents();
         String zipCode = writableSheet.getCell(7, i).getContents();
         String city = writableSheet.getCell(8, i).getContents();
         String state = writableSheet.getCell(9, i).getContents();
         String ccNumber = writableSheet.getCell(10, i).getContents();
         String expMonth = writableSheet.getCell( 11, i).getContents();
         String expYear = writableSheet.getCell(12, i).getContents();
         String ccvCode = writableSheet.getCell(13, i).getContents();
         String errorMessage = writableSheet.getCell(14, i).getContents();

         //delete cookies
         driver.manage().deleteAllCookies();

         //navigate to mlcalc
         JavascriptExecutor js = (JavascriptExecutor) driver;

         driver.navigate().to("https://www.express.com/");
         Thread.sleep(1000);

         //close pop up
         ReusableMethod.clickOnElement(driver,"//button[@aria-label='Focus Close Modal']", "Close Button");

         //hover over to mens tab
         ReusableMethod.mouseHover(driver,"//a[@href='/mens-clothing']", "Mens");

         //click on the subsection in mens for shirts
         ReusableMethod.clickOnElement(driver,"//a[@href='/mens-clothing/shirts/cat410008']", "Shirts");

         ReusableMethod.clickOnElement(driver,"//a[@class = '_1-wQg']","first shirt");

         //click on the size
         ReusableMethod.clickOnElement(driver,"//*[text() ='" + size + "']"," size");

         //scroll down to add to bag
         js.executeScript("window.scrollBy(0,250)", "");

         //select add to cart
         ReusableMethod.clickOnElement(driver,"//*[text() ='Add to Bag']"," Add to Bag");

         //scroll up to bag
         js.executeScript("window.scrollBy(0,-250)");

         Thread.sleep(1000);

         //select cart
         ReusableMethod.clickOnElement(driver,"//*[text()='View Bag']"," View Bag");

         //change the quantity
         Thread.sleep(1000);
         ReusableMethod.clickOnElement(driver,"//*[@value ='" + quantity + "']" , "quantity");

         //click on checkout
         Thread.sleep(1000);
         ReusableMethod.clickOnElement(driver,"//*[@id='continue-to-checkout']","Check Out Button");

         //click on checkout as guest
         Thread.sleep(1000);
         ReusableMethod.clickOnElement(driver,"//*[text()='Checkout as Guest']","Guest Checkout");

         //input first name
         Thread.sleep(1000);
         ReusableMethod.sendKeysMethod(driver,"//*[@name ='firstname']",firstName, "First Name");

         //input last name
         Thread.sleep(1000);
         ReusableMethod.sendKeysMethod(driver,"//*[@name ='lastname']",lastName, "Last Name");

         //input email
         Thread.sleep(1000);
         ReusableMethod.sendKeysMethod(driver,"//*[@name ='email']",email, "Email Address");

         //confirm email
         Thread.sleep(1000);
         ReusableMethod.sendKeysMethod(driver,"//*[@name ='confirmEmail']",email, "Email Address Confirmation");

         //input phone - number
         Thread.sleep(1000);
         ReusableMethod.sendKeysMethod(driver,"//*[@name ='phone']",phone, "Phone Number");

         //click continue
         Thread.sleep(1000);
         ReusableMethod.clickOnElement(driver,"//*[@class='btn _9yfmt _194FD _2tFXQ _2SogC']","Shipping Continue");

         //input addy
         Thread.sleep(1000);
         ReusableMethod.sendKeysMethod(driver,"//*[@name ='shipping.line1']",streetAdress, "Shipping Street Address");

         //input zipcode
         Thread.sleep(1000);
         ReusableMethod.sendKeysMethod(driver,"//*[@name ='shipping.postalCode']",zipCode, "Shipping Zip Code");

         //input city
         Thread.sleep(1000);
         ReusableMethod.sendKeysMethod(driver,"//*[@name ='shipping.city']",city, "Shipping City");

         //change the state
         Thread.sleep(1000);
         ReusableMethod.clickOnElement(driver,"//*[@value ='" + state + "']" , "Shipping State");

         //click continue
         Thread.sleep(1000);
         ReusableMethod.clickOnElement(driver,"//*[@class='btn _9yfmt _194FD _2tFXQ _2SogC']","Shipping Continue 2");

         //click continue for delivery options
         Thread.sleep(3000);
         ReusableMethod.clickOnElement(driver,"//*[@class='btn _9yfmt _194FD _2tFXQ _2SogC']","Shipping Continue Delivery Options");

         //input CC number
         Thread.sleep(1000);
         ReusableMethod.sendKeysMethod(driver,"//*[@name ='creditCardNumber']",ccNumber, "Credit Card Number");

         //change cc Month
         Thread.sleep(1000);
         ReusableMethod.clickOnElement(driver,"//*[@value ='" + expMonth + "']" , "CC Month Exp");

         //change cc Year
         Thread.sleep(1000);
         ReusableMethod.clickOnElement(driver,"//*[@value ='" + expYear + "']" , "CC Year Exp");

         //input CVV
         Thread.sleep(1000);
         ReusableMethod.sendKeysMethod(driver,"//*[@name ='cvv']",ccvCode, "CCV Code");

         //click place order
         Thread.sleep(3000);
         ReusableMethod.clickOnElement(driver,"//*[text()='Place Order']","Shipping Continue 2");

         //capture text
         Thread.sleep(1000);
         errorMessage = ReusableMethod.captureText(driver,"//*[@id='rvn-note-NaN']",0,"capture text");

         //create a label so you can add it to a cell
         Label label = new Label(14,i,errorMessage);
         //add the label back to the sheet
         writableSheet.addCell(label);

      }

      //outside of the cell write back to writable workbook
      writableWorkbook.write();
      //close it
      writableWorkbook.close();

   }
}
