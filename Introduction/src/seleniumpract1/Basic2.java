package seleniumpract1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic2 
{
 public static void main(String[] args) {
	
	 System.out.println("Main method started..");
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.youtube.com/");
	 
	 driver.get("https://www.facebook.com/");
	 
	 driver.close();
	 
	 
}
}
