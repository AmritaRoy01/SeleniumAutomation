package NewTours;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class RegistrationTest {
	
	 private static final Logger logger = LogManager.getLogger(App.class);

	@Test
	public void verifyRegistration() throws InterruptedException, IOException
	{
		
		FileInputStream fis = new FileInputStream("info.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String username = prop.getProperty("name");
		String password = prop.getProperty("password");
		String path = prop.getProperty("path");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(path);
		
		 System.out.println( "Hello, user!" );
	        logger.trace("We've just greeted the user!");
	        logger.debug("We've just greeted the user!");
	        logger.info("We've just greeted the user!");
	        logger.warn("We've just greeted the user!");
	        logger.error("We've just greeted the user!");
	        logger.fatal("We've just greeted the user!");
		
	        
	        //"C:\\Users\\amree\\eclipse-workspace\\NewTours\\src\\test\\resources\\
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //RegistrationPage RGPage = new RegistrationPage(driver);
        RegistrationPage RGPage = new RegistrationPage(driver);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");

        Thread.sleep(5000);
        logger.fatal("website logged in successfully!");
        
        RGPage.clickRegLnk();
        RGPage.setFirstName("Amrita");
        RGPage.setLastName("Testing");
        RGPage.setPhone("987765443");
        RGPage.setEmail("Test@test.com");
        RGPage.setAdd1("Testing");
        RGPage.setCity("Testing");
        //RGPage.setState("Testiing");
        RGPage.setPostalCode("987");
        RGPage.setUserName("UN1");
        RGPage.setPassword("123");
        RGPage.setConfirmPassword("123");
        RGPage.clickRegBtn();
        
        Thread.sleep(5000);
        driver.close();
        
        
        
        Thread.sleep(5000);
	}
}
