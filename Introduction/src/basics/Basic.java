package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic
{
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.youtube.com/");
}
}
