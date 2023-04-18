package FAC.FACWORK;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class keytrak extends Base {
	
	
	  //System.setProperty("webdriver.chrome.driver", ("C:\\Users\\HP\\eclipse-workspace\\Google\\Drivers\\chromedriver.exe");
	  //driver = new ChromeDriver();  // Opening chrome browser
	  	 
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\FACWORK\\Drivers\\geckodriver.exe");
	  //driver= new FirefoxDriver();  // Opening firefox browser
	  
	//System.setProperty("webdriver.edge.driver", "C:\Users\HP\eclipse-workspace\FACWORK\Drivers\msedgedriver.exe");
	//driver= new EdgeDriver();  // Opening Edge browser

		    
 @Test
public void f1() throws InterruptedException, IOException {
	   
	  System.out.println("This is test1");
	  Thread.sleep(5000);
	  
	  Home ob = new Home(driver);
	  ob.email_field_function("abc@yahoo.com");
	  Thread.sleep(5000);
	  ob.pass_field_function("aaaaqqqwwweee");
	  Thread.sleep(5000);
	  shots();
	  }
  
  
}
