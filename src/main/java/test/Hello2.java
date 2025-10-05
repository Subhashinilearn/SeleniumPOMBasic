package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver cd = new ChromeDriver();

    cd.get("https://mvnrepository.com/");
    
    String name1= cd.getTitle();
    System.out.println("Chrome Page title is :"+ name1);

    cd.close();

	}

}
