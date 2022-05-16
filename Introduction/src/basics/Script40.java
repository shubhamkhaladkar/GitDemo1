package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script40
{
 public static void main(String[] args) {
	
	 WebDriverManager.firefoxdriver().setup();
	 WebDriver driver = new FirefoxDriver();
	 FirefoxOptions opt = new FirefoxOptions();
	 
	 opt.addPreference("dom.webnotification.enabled", false);
	// System.setProperty("www.chrome.driver", "");
}
}
