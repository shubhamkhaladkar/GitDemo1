package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Toprintimage 
{
public static void main(String[] args) {
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver  = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in/");
	
	 List<WebElement> rv = driver.findElements(By.tagName("img"));
	 
	 System.out.println("Totla number of images present"+rv.size());
	 
	 for (int i = 0; i <rv.size(); i++)
	 {
		System.out.println(rv.get(i).getAttribute("src"));
	}
}
}
