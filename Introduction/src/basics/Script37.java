package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script37 
{
 public static void main(String[] args) {
	
	 WebDriverManager.firefoxdriver().setup();
	 
	 WebDriver driver = new FirefoxDriver();
	 
	// driver.get("https://admin:admin123@www.facebook.com/");
	 
	 driver.get("https://admin:admin234@the-internet.herokuapp.com/digest_auth");
	 
	 
}
}
