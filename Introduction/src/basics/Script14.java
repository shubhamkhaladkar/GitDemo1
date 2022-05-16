package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script14 
{
  public static void main(String[] args) {
	
	  WebDriverManager.firefoxdriver().setup();
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  
	  List<WebElement> str = driver.findElements(By.tagName("img"));
	  
	  for (int i = 0; i <str.size(); i++) 
	  {
		 System.out.println(str.get(i).getAttribute("src"));
		
	}
	  
	  System.out.println("img count in a page:"+str.size());
}
}
