package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
 
	protected WebDriver browser1;
	
	@BeforeMethod
	public void setup()
	{
		
	  browser1=new ChromeDriver();	
	  browser1.manage().window().maximize();
	  browser1.get("https://admin-demo.nopcommerce.com/login");
	}
	
	@AfterMethod
	public void cleanup()
	{
		if(browser1 != null) {
			browser1.quit();
		}
			
	}

}
