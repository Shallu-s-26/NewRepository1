import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyNewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
    WebDriver browser =new ChromeDriver();
    //String b = "https://www.netflix.com/YourAccount";
    browser.get("https://www.netflix.com/YourAccount");
    browser.get("https://classroom.google.com");
    browser.get("https://www.youtube.com");
   
    
	
	browser.manage().window().maximize();
	 browser.navigate().back();
	 browser.navigate().back();
	 browser.quit(); 
	 	
	
	}
	
	

}
