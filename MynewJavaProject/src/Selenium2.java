import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String a = "https://the-internet.herokuapp.com/dropdown";
		driver.get(a);
		
		//driver.findElement(By.cssSelector("#username")).sendKeys("username");
		//driver.findElement(By.cssSelector("#password")).sendKeys("password");
		//driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example form:nth-child(3) button.radius:nth-child(3) > i.fa.fa-2x.fa-sign-in")).click();
	
		Select shallu = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
	 //shallu.selectByValue("Option 1");
	//shallu.selectByIndex(1);
	 shallu.selectByVisibleText("1");
	 
		
	}

}
