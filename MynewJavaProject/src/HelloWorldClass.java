import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

		WebDriver browser = new ChromeDriver();
		
		//browser.get("https://www.google.com");
		//String google = "https://www.google.com/";
		/*
		 * String yahoo = "https://www.yahoo.com/?p=us"; String bing =
		 * "https://www.bing.com/";
		 * 
		 * String CurrentUrl= browser.getCurrentUrl(); System.out.println(google);
		 * String FullSourceCode = browser.getPageSource();
		 * System.out.println("printFullsource code "); driver
		 */
		//String PracticeSite="https://the-internet.herokuapp.com/login";
		//driver.get(PracticeSite);
		//driver.findElement(By.id("username")
	}

}
