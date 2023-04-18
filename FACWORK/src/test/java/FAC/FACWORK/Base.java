package FAC.FACWORK;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod1() { 
		  System.out.println("This is before method");	
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\FACWORK\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();  // Opening chrome browser
			driver.get("https://www.facebook.com");
			 driver.manage().window().maximize();
	  }
	  
	  
	  @AfterMethod
	  public void afterMethod() { 
	  	System.out.println("This is after method"); 
	  	driver.close();   
	  	}


	  public void shots () throws IOException
	  {
	  		File cap=  ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
	  		FileHandler.copy (cap, new File("C:\\Users\\HP\\eclipse-workspace\\FACWORK\\ScreenShot\\1.png"));
	  			}


}
