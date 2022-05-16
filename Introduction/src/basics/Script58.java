package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script58
{
 public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--incognito");
	opt.addArguments("--start-maximized");
	opt.addArguments("--disable-notification");
	//opt.addArguments("--headless");
	WebDriver driver = new ChromeDriver(opt);
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("https://www.yatra.com/");
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 driver.close();
	 
}
}
