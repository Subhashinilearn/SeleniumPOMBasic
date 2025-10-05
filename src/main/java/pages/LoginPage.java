package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver browser1;
	private By emailTextBox = By.id("Email");
	private By passwordTextBox =By.id("Password");
	private By loginButton = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	
	public LoginPage(WebDriver browser1) {
	 this.browser1 = browser1;
	}
    
	public void enteremailid(String emailid) {
		browser1.findElement(emailTextBox).clear();
		browser1.findElement(emailTextBox).sendKeys(emailid);
	}
	public void enterpassword(String password) {
		browser1.findElement(passwordTextBox).clear();
		browser1.findElement(passwordTextBox).sendKeys(password);
		
	}
	public void login_click() {
		browser1.findElement(loginButton).click();
	}


}


