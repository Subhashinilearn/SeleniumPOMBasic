package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		
		
		WebDriver cd = new ChromeDriver();
		cd.get("https://www.irctc.co.in/nget/train-search");
		String name = cd.getTitle();
		System.out.println("The Page title is :"+ name);
		cd.quit();
		
	}
	
	
}
