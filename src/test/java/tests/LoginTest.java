package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void login_valid() {
	LoginPage testloginpage = new LoginPage(browser1);
	testloginpage.enteremailid("admin@yourstore.com");
	testloginpage.enterpassword("admin");
	testloginpage.login_click();
	String title = browser1.getTitle();
	System.out.println("Title is :"+title);
	Assert.assertEquals(title,"Dashboard / nopCommerce administration");
	}

}
