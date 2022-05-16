package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script12 
{
  public static void main(String[] args) {
	
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver  =  new FirefoxDriver();
	  
	  driver.get("https://www.facebook.com/");
	  
	  WebElement rv = driver.findElement(By.xpath("//input[@id='email']"));
	  
	  rv.sendKeys("shubham");
	  
	boolean test = rv.isDisplayed();
	
	if (test) 
	{
		System.out.println("Text is displayed..");
	}
	else 
	{

	}
}
}
