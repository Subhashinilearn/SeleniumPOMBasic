package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basicscript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String URL ="https://admin-demo.nopcommerce.com/login";
		WebDriver browser1 = new FirefoxDriver();
		browser1.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		browser1.get(URL);
		String titlename = browser1.getTitle();
		System.out.println("Title name:"+titlename);
		//browser1.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		//or
		WebElement emailid = browser1.findElement(By.id("Email"));
	    emailid.clear();
		emailid.sendKeys("admin@yourstore.com");
		
		WebElement passid = browser1.findElement(By.id("Password"));
		passid.clear();
		passid.sendKeys("admin");
		
		WebElement login1=browser1.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	    System.out.println("Login Element text :"+login1.getText());
	    login1.click();
	    
	  		browser1.quit();
		
	}

}
