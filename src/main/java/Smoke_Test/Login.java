package Smoke_Test;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Basetest;
import Base.all_xpaths;

public class Login extends Basetest implements all_xpaths {
	private static final Logger logger = LogManager.getLogger(Login.class);
	static WebDriver driver;

	@Test
	public static void Login_Process() throws Exception {

		// To read The Property File
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/resources/data.properties");
		prop.load(ip);

		try {
			// Launching Browser
			launchBrowser(prop.getProperty("Browser"));
			Thread.sleep(5000);

			// passing the URL
			// sendURL(prop.getProperty("DevUrl"));
			logger.info("Estockgifts Open Successfully");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			//driver.findElement(By.xpath("/html/body/div[1]/app-root/div[1]/app-header/nav/div/div[2]/ul/li[7]/a")).getText();
			//driver.get("https://devbarfa.estockgifts.com/fe/home");
		    driver.findElement(By.linkText("Log In")).click();
		    driver.findElement(By.linkText("Login As Member")).click();
		  
			//click(LoginButton);
			logger.info("Login page open Successfully");
			click(Login_As_Member);
			
			sendValue(Email_Address, prop.getProperty("Email"));
			logger.info("Entered Email ID Successfully");
			
			click(Get_OTP);
			logger.info("OTP Send Successfully");
			
			

			
			} catch (Exception e) {
			/* logger.error("Test Fail", e); */
			onTestFailure();
			// quitBrowser();
			Assert.fail("");

		}

	}

}
