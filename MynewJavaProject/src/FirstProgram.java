	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		String SaleforceSite="https://login.salesforce.com/";
		
	browser.get(SaleforceSite);
	browser.findElement(By.id("username")).sendKeys("username");
	browser.findElement(By.id("password")).sendKeys("password");
	browser.findElement(By.name("Login")).click();
		
		
	}
	

}
