package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script24 
{
  public static void main(String[] args) {
	
	  WebDriverManager.firefoxdriver().setup();
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://www.amazon.in");
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  JavascriptExecutor js =(JavascriptExecutor) driver;
	  
	 js.executeScript("document.getElementById('twotabsearchtextbox')".valueOf("admin"));
	  
	  
	  
	  
	  
}
}
