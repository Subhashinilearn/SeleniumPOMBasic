package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//@Run All
public class Firstscript2 {

	@Test
	//Run | Debug
	public void test1()
	{		
		WebDriver cd = new ChromeDriver();
		cd.get("https://www.irctc.co.in/nget/train-search");
		String name = cd.getTitle();
		System.out.println("The Page title is :"+ name);
		cd.quit();
	}	
}
