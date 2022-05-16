package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script 
{
  public static void main(String[] args) {
	
	  WebDriverManager.firefoxdriver().setup();
	  
	  WebDriver driver  = new FirefoxDriver();
	  
	  driver.get("https://jqueryui.com/");
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  System.out.println(driver.getTitle());
	  
	  WebDriverManager.firefoxdriver().setup();
	  
	  WebDriver  driver1  = new FirefoxDriver();
	  driver1.get("https://www.youtube.com/");

	  System.out.println(driver1.getCurrentUrl());
	  
	  System.out.println(driver1.getTitle());
	  
	  driver1.close();
	  driver.close();
}
}
