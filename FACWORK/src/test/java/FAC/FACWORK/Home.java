package FAC.FACWORK;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	public static WebDriver driver;

	@FindBy(xpath="//*[@id='email']") WebElement email_filed;
	@FindBy(xpath="//*[@id='pass']") WebElement pass_filed;
	@FindBy(xpath="//*[@name='login']") WebElement login_button;
	@FindBy(xpath="//*[contains(text(),'Connect with')]") WebElement fb_text;
	
	public Home(WebDriver driver) {
	Home.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
		public void email_field_function(String email) {
		email_filed.sendKeys(email);
	}
	
	public void pass_field_function(String pass) {
		pass_filed.sendKeys(pass);
	}
	
	public void login_button_function() {
		login_button.click();
	}
	
	public void text_extract_function() throws InterruptedException {
		String actual_text=	fb_text.getText();
		 Thread.sleep(5000);
		 AssertJUnit.assertEquals(actual_text, "Connect with friends 9999and the world around you on Facebook.");
		 Thread.sleep(5000);

		}

		
	}



