package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Toidentifyalllinks
{
  public static void main(String[] args) {
	
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver  = new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("https://www.google.com/");
	  
	  List<WebElement> rv = driver.findElements(By.tagName("a"));
	  
	  System.out.println("Total number links are present in chrome:"+rv.size());
	  
	  int visible_links = 0;
	  int invisible_links= 0;;
	  for (int i = 0; i <rv.size(); i++)
	  {
		WebElement ref = rv.get(i);
		
		if (ref.isDisplayed()) 
		{
			visible_links++;
		} else 
		{
      invisible_links++;
	}
		
		 
	}
	  
	  System.out.println("total number of visible links:"+visible_links);
	  System.out.println("total number of invisible links:"+invisible_links);	 
	}
}
