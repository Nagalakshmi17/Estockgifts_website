/*package Smoke_Test;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.EstockGifts.base.Estockgifts_Base;
import com.Excel.utilitys.Xls_Reader;

public class Estockgifts_OrderGift extends Estockgifts_Base {

	public static void main(String[] args) throws Exception {

		// creating object for excellReader
		Xls_Reader reader=new Xls_Reader("E:\\Selenium_Practice\\Java_Practice\\EstockGifts\\src\\com\\TestData\\Test_DataBook1.xlsx");
           
		 String URL=reader.getCellData("Buyyer Information", "BaseUrl", 2);
		
		 Estockgifts_OrderGift.launchBrowser(URL);
        // Single Card Selection 
		Estockgifts_OrderGift.click("//label[@for='single']");
      // Bulk Gift Card Selection
       Estockgifts_OrderGift.click("//span[contains(text(),'Bulk Gift Card')]");
       // Certificate Selection
      Estockgifts_OrderGift.click("//label[@for='crypto-certificate']");
       
         // Passing data From Excel SHeet
         //Event Name 
      String Event=reader.getCellData("Buyyer Information", "Event", 2);
        Estockgifts_OrderGift.Data("eventName", Event);
         // Passing Sender  Data
       String SenderFirstname= reader.getCellData("Buyyer Information", "Sender First Name", 2);
       Estockgifts_OrderGift.Data("sendFirstName", SenderFirstname);
       
        String  SenderLastname=reader.getCellData("Buyyer Information", "Sender Last Name", 2);
        Estockgifts_OrderGift.Data("sendLastName", SenderLastname);
       String  Senderemail=	reader.getCellData("Buyyer Information", "SenderEmail", 2);	
       Estockgifts_OrderGift.Data("sendEmail", Senderemail);
      String  Senderphone=	reader.getCellData("Buyyer Information", "SenderPhoneNo",2);
      Estockgifts_OrderGift.Data("sendPhone", Senderphone);

     
     // Passing Recipient Data
     
     String RecFname=reader.getCellData("Buyyer Information", "ReceFirstName", 2);
      Estockgifts_OrderGift.Data("reciFirstName", RecFname);
      String RecLname=reader.getCellData("Buyyer Information", "ReceLastName", 2);
      Estockgifts_OrderGift.Data("reciLastName", RecLname);
      String RecEmail=reader.getCellData("Buyyer Information", "ReceEmail", 2);
      Estockgifts_OrderGift.Data("reciEmail", RecEmail);
      String RecPhno=reader.getCellData("Buyyer Information", "RecePhoneNo", 2);
      Estockgifts_OrderGift.Data("reciPhone", RecPhno);
    
      // Uploading Front Image
    Thread.sleep(100);
        
      Estockgifts_OrderGift.Upload("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[7]/div[1]/label","E:\\Selenium_Practice\\Java_Practice\\EstockGifts\\src\\com\\TestData\\Front Image.jpg");
  driver.findElement(By.xpath("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[4]/div[3]/button")).click();
   


      // Uploading Back Image
    
      Estockgifts_OrderGift.Upload("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[8]/div[1]/label", "E:\\Selenium_Practice\\Java_Practice\\EstockGifts\\src\\com\\TestData\\Back Image.jpg");
    driver.findElement(By.xpath("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[6]/div[3]/button")).click();
 
    // Uploading redeem Image
    Estockgifts_OrderGift.Upload("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[1]/form[2]/div[9]/div[1]/label", "E:\\Selenium_Practice\\Java_Practice\\EstockGifts\\src\\com\\TestData\\Redem.png");
    
    driver.findElement(By.xpath("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[7]/div[3]/button")).click();
	
    // Passing Message 
   
    String message=reader.getCellData("Buyyer Information", "Message", 2);
    Estockgifts_OrderGift.Message( message);
    Thread.sleep(100);
    // Selecting Gift Value
    String Value=reader.getCellData("Buyyer Information", "Value", 2);
	 
    Estockgifts_OrderGift.CardValue(Value);
  //Select Validity Of card
	 
	 String Exp=reader.getCellData("Buyyer Information", "Validity", 2);
	 Estockgifts_OrderGift.SelectDropDown("expiry",Exp);
    
	 // Want to ship the card or not
	 Estockgifts_OrderGift.click("//LABEL[@for='shipping'][text()='Do you want to ship the cards?']");
		// Selecting shipping adress
		   //Estockgifts_OrderGift.click("//LABEL[@for='sender']");
		
		Estockgifts_OrderGift.click("//LABEL[@for='recipient']");
		
		//Providing Address
		
		String Address=reader.getCellData("Buyyer Information", "Address", 2);
		Estockgifts_OrderGift.Data("address", Address);
		String City=reader.getCellData("Buyyer Information", "City", 2);
		Estockgifts_OrderGift.Data("city", City);
     String State=reader.getCellData("Buyyer Information", "State", 2);
     Estockgifts_OrderGift.SelectDropDown("state", State);
		String ZIP=reader.getCellData("Buyyer Information", "Zip", 2);
		Estockgifts_OrderGift.Data("zip", ZIP);
		
		// Card Details 
		
		String NameonCard=reader.getCellData("Credit Card & Debit", "Name On Card", 2);
		Estockgifts_OrderGift.Data("CardName", NameonCard);
		String NumberonCard=reader.getCellData("Credit Card & Debit", "Card No", 2);
		Estockgifts_OrderGift.Data("CardNumber", NumberonCard);
		String EXPDate=reader.getCellData("Credit Card & Debit", "Exp Date/Mon", 2);
		Estockgifts_OrderGift.Data("CardExpiry", EXPDate);
		String CvvOnCard=reader.getCellData("Credit Card & Debit", "CVV", 2);
		Estockgifts_OrderGift.Data("CardCVVNumber", CvvOnCard);
		
		// Accepting Terms And Conditions
		
		click("//LABEL[@for='agreeTerms'][text()='I agree to the terms and conditions / Privacy policy.']");
		
		// Clicking On Purchase Button
		click("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[19]/button");	 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
    
	}
	
}*/