import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shallu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String PracticeSite = "https://the-internet.herokuapp.com/input";
	driver.get(PracticeSite);
	
	
	Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
	dropdown.selectByValue("Option 1");
	
	dropdown.selectByIndex(1);
	dropdown.selectByVisibleText("1");
	
	
	
	}

}
				