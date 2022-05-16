package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo28
{
 public static void main(String[] args) {
	
	 WebDriverManager.firefoxdriver().setup();
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("https://the-internet.herokuapp.com/");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
	/*WebElement str1 = driver.findElement(By.xpath("//frame[@name='frame-top']"));
	WebElement str2 = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
	System.out.println(driver.findElements(By.tagName("frame")).size());*/
	
	driver.switchTo().frame("frame-top");
	
	driver.switchTo().frame("frame-middle");
	
	
	System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
}
}
