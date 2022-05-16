package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script55 
{
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriverManager.firefoxdriver().setup();
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("file:///C:/jar%20files%20and%20exe%20files/Psse17/Html/Enabled.html");
	 
	  WebElement rv = driver.findElement(By.xpath("//input[@id='user']"));
	  
	  System.out.println(rv.getText());
	  
	  JavascriptExecutor js =(JavascriptExecutor) driver;
	  
	  Thread.sleep(2000);
	  
	  js.executeScript("arguments[0].value=' '",rv);
}
}
