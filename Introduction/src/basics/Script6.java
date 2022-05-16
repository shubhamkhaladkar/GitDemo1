package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script6
{
  public static void main(String[] args) {
	
	  WebDriverManager.firefoxdriver().setup();
	  
	  WebDriver driver  =  new FirefoxDriver();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  
	  driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung");
	  
	  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  
}
}
