package seleniumpract1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification1
{
  public static void main(String[] args) {
	
	  System.out.println("Main method started..");
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions opt  = new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	  opt.addArguments("--incognito");
	  opt.addArguments("--start-maximized");
	  opt.addArguments("headless");
	  WebDriver driver  = new ChromeDriver(opt);
	  
	  driver.get("https://www.yatra.com/");
}
}
