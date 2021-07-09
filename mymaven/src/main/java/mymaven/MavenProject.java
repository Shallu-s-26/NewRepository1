package mymaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenProject {

	public void startup() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
		String URL = "https://the-internet.herokuapp.com/login";
		chrome.get(URL);
	
	chrome.findElement(By.xpath("//input[@id='username']")).sendKeys("wrongusername");
	chrome.findElement(By.xpath("//input[@id='password']")).sendKeys("wrongpassword");
	chrome.findElement(By.xpath("//button[@class=\"radius\"]")).click();



}
}
