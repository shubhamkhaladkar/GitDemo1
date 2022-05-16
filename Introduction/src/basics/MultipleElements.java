package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElements {
	@Test
	public void test() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
  int visible_links=0;
  int invisible_links=0;
  
		List<WebElement> str = driver.findElements(By.xpath("//a"));
		System.out.println("Total links are present:"+str.size());
		for (int i = 0; i < str.size(); i++) {
			WebElement rv = str.get(i);
			if (rv.isDisplayed()) 
			{
			 visible_links++;	
			} else 
			{
              invisible_links++;
			}
		}
		
		System.out.println("Count of Visible links:"+visible_links);
		System.out.println("Count of invisible links:"+invisible_links);
       driver.close();
	}
}
