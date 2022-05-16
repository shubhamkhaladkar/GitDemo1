package seleniumpract1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartImages 
{
  public static void main(String[] args) 
  {
	 int visible =0;
	 
	 int invisible =0;
	 
	  System.out.println("Main method started..");
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver  = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  List<WebElement> rv = driver.findElements(By.tagName("img"));
	  
	  System.out.println("the count of the images are:"+rv.size());
	  
	  for (int i = 0; i <rv.size(); i++)
	  {
		System.out.println(rv.get(i).getAttribute("src"));
		
		WebElement ref = rv.get(i);
		
		if (ref.isDisplayed()) 
		{
			visible++;
		} else {
 invisible++;
		}
		
		System.out.println(" the count of visible images:"+visible);
		System.out.println("the count of invisible images:"+invisible);
	}
	  
	  driver.close();
}
}
