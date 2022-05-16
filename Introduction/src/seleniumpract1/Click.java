package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click 
{
 public static void main(String[] args) {
	
	 System.out.println("Main method started..");
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver  = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("https://www.facebook.com/");
	 
	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Shubham");
	 
	 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Shubham");
	 
	 driver.findElement(By.xpath("//button[@name='login']")).click();
	 
	 driver.close();
	 System.out.println("Main method is ended..");
}
}
