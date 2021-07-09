package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveCases {
	@Test
	public void positive() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\driver\\updateddriver\\chromedriver.exe");
		
		WebDriver browser= new ChromeDriver();
		
	    String URL = "https://the-internet.herokuapp.com/login";
		browser.get(URL);
		
	
	
}
}