package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver fd = new FirefoxDriver();
	
    fd.get("https://www.selenium.dev/");
     
    String name1= fd.getTitle();
    System.out.println("Firefox Page title is :"+ name1);
   
    fd.close();

	}

}
