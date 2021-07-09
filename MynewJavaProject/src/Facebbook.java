import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		String FacebookSite="https://login.facebook.com/";
		
	browser.get(FacebookSite);
	browser.findElement(By.id("email")).sendKeys("royal_email");
	
	browser.findElement(By.name("pass")).sendKeys("password");
	browser.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
	String errormessage= browser.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).getText();
	System.out.println(errormessage);
	
	
	}
}
	
