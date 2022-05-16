package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo31 
{
 public static void main(String[] args) {
	
	 WebDriverManager.firefoxdriver().setup();
	 
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	 
	 WebElement rv = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	 
	System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).getText());
}
}
