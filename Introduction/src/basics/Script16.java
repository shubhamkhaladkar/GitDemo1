package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script16 
{
  public static void main(String[] args) {
	
	  WebDriverManager.firefoxdriver().setup();
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("sams");
		
		List<WebElement> ref = driver.findElements(By.xpath("//span[contains(text(), 'sams')]"));
		
		System.out.println("count of  auto suggestions:"+ref.size());
		
		for (int i = 0; i <ref.size(); i++)
		{
			ref.get(3).click();
			
		}
		
		
		}
}

