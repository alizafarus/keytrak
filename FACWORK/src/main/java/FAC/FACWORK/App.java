package FAC.FACWORK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	public static WebDriver driver;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Google\\Drivers\\chromedriver.exe");
    	driver= new ChromeDriver();  // Opening chrome browser
    	driver.get("https://www.amazon.com");
    }
}
