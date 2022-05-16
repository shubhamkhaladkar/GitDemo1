package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert2 
{
  @Test
  
  public void test()
  
  {
	  
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("https://the-internet.herokuapp.com/");
	  
	  driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	   Alert a = driver.switchTo().alert();
	   
	   System.out.println(a.getText());
	   
	   a.accept();
  }
}
