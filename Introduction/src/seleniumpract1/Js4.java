package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js4 
{
 public static void main(String[] args) {
	
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver  = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("file:///C:/jar%20files%20and%20exe%20files/Psse17/Html/Enable.html");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	  WebElement rv = driver.findElement(By.id("user"));
	  
	  JavascriptExecutor  js  = (JavascriptExecutor) driver;
	  
	  js.executeScript("arguments[0].value=' '", rv);
}
}
