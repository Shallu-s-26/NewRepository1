package mymaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTesting {
@Test
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver chrome = new ChromeDriver();

		String URL = "https://the-internet.herokuapp.com/login";
		chrome.get(URL);

		chrome.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		chrome.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		chrome.findElement(By.xpath("//button[@class=\"radius\"]")).click();
		
		// Check to ensure the user has logged in successfully
		String ExpectedtURL = "https://the-internet.herokuapp.com/secure";
		String CurrentURL = chrome.getCurrentUrl();""
		System.out.print(CurrentURL);
		Assert.assertEquals(ExpectedtURL, CurrentURL, "The URL does not match");
		//if (CurrentURL==ExpectedtURL) {
			//System.out.println("URL does match");
		//	}
		//else {
		//	System.out.println("URL does not match");
		//}
		// Check to ensure the user has logout button is displayed correctly
		//WebElement logoutbutton = chrome.findElement(By.xpath(""));
		//Assert.assertTrue(logoutbutton.isDisplayed(), "Button is");
	}

}
