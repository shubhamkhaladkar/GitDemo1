package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo34
{
 public static void main(String[] args) {
	
	 WebDriverManager.firefoxdriver().setup();
	 
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 System.out.println(driver.findElements(By.xpath("//table[@id='product'] //td[1]")).size());
	 
	 driver.close();
}
}
