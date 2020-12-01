/*package com.EstockGifts.base;


import java.awt.Robot;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import com.EstockGifts.scripts.Estockgifts_OrderGift;


public class Estockgifts_Base {

	public static WebDriver driver;
	
	

	// Method for Launching Browser
	
	public static void launchBrowser(String Url) {
		try {
			// Setting the webdriver.chrome.driver property to its executable's
			// location
			
	System.setProperty("webdriver.chrome.driver",
					"E:\\Selenium_Practice\\Java_Practice\\Egift\\drivers\\chromedriver.exe");

			// Instantiating driver object
			driver = new ChromeDriver();

			// Using get() method to open a webpage
			driver.get(Url);
			// Making Browser To wait for some time
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("Failed to launch Browser.");

		}

	}

	// Method to close the browser
	public static void quitBrowser() {
		try {
			driver.close();
			// driver.quit();
			System.out.println("Driver Quit Done");

		} catch (Exception e) {
			System.out.println("Browser Quit Faild");
		}

	}

	// Method to perform click operation
	public static void click(String Locator) {
		try {
			driver.findElement(By.xpath(Locator)).click();

		} catch (Exception e) {
			System.out.println("Click Operation Failed");
		}
	}
	
	      //Method to Provide Inputs

	   public static void Data(String Locator, String Text) {

		try {
			driver.findElement(By.name(Locator)).sendKeys(Text);

		} catch (Exception e) {
			System.out.println("Unable to pass the values");
		}

	}
	   // method to send data to MessageBox
	   public static void Message(String Text) {

			try {
				driver.switchTo().frame(0);
				WebElement el  =  driver.switchTo().activeElement();
				new Actions(driver).moveToElement(el).perform();
				driver.findElement(By.xpath("/html/body")).sendKeys(Text);
				driver.switchTo().defaultContent();

			} catch (Exception e) {
				System.out.println("Unable to pass the values");
			}

		}
			   

	// Method to Upload Files
	public static void Upload(String Locator, String File) throws Exception {

		try {
//			driver.findElement(By.name(Locator));
			driver.findElement(By.xpath(Locator)).click();
			Thread.sleep(10000);
			StringSelection IMGsrc = new StringSelection(File);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(IMGsrc, null);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);			
			
		} catch (Exception e) {
			System.out.println("Unable to Upload File ");
		}

	}
	public static void CardValue(String Value){
		try{	
			if (Value.equalsIgnoreCase("5")) {
				click("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[1]/div/div[1]/ul/li[1]");
				
				
			} else if (Value.equalsIgnoreCase("10")) {
				click("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[1]/div/div[1]/ul/li[2]");
					
	  }else if(Value.equalsIgnoreCase("15")){
		click("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[1]/div/div[1]/ul/li[3]");
	   }else if(Value.equalsIgnoreCase("20")){
		click("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[1]/div/div[1]/ul/li[4]");
	   }else if(Value.equalsIgnoreCase("40")){
		click("/html/body/div[1]/app-root/div[1]/div/app-gift-card-editor/app-create-cards/div/div[1]/div/div/div/div[2]/div/div[1]/div/div[1]/ul/li[5]");
	   }else if(Value != null)		{
		   Data("giftAmount", Value);
	   }
			
	  }catch(Exception e){
		  System.out.println("Unable Select CardValue ");
	    
	  }
	}
	public static void SelectDropDown(String name ,String Value){
	 	  
   	 try {
   		WebElement WE=driver.findElement(By.name(name));
   		Select CardExpiry=new Select(WE);
   		CardExpiry.selectByVisibleText(Value);
           
   	 }catch(Exception e){
   		System.out.println("Unable to Select Validity "); 
   	 
   	 }
    

    }
	
}*/