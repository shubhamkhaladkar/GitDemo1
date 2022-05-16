package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender 
{
  public static void main(String[] args) throws InterruptedException {
	
	  WebDriverManager.firefoxdriver().setup();
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("https://www.path2usa.com/travel-companions");
	  
	  driver.findElement(By.xpath("//input[@id='travel_date']")).click();
	  
      driver.findElement(By.xpath("(//th[@class='next'])[1] ")).click();
      
      driver.findElement(By.xpath("(//th[@class='next'])[1] ")).click();
      
      driver.findElement(By.xpath("(//th[@class='next'])[1] ")).click();
      
      driver.findElement(By.xpath("(//th[@class='next'])[1] ")).click();
      
      driver.findElement(By.xpath("(//td[@class='day']) [9]")).click();
      
      Thread.sleep(3000);
      
      WebElement rv = driver.findElement(By.xpath("//input[@class='text form-control']"));
       
       System.out.println(rv.getText());
       
       driver.close();
       
       /*String str ="06-09-2022";
       
       Assert.assertEquals(rv, str);*/
	  
}
}
