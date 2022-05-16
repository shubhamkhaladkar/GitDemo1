package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyStorke2
{
 public static void main(String[] args) throws InterruptedException {
	
	 System.out.println("Main method Started..");
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver  = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("https://www.facebook.com/");
	 
	 WebElement rv = driver.findElement(By.xpath("//input[@name='email']"));
	 
	 rv.sendKeys("Shubham");
	 
	 rv.sendKeys(Keys.CONTROL+"a");
	 
	 rv.sendKeys(Keys.BACK_SPACE);
	 
	 WebElement ref = driver.findElement(By.xpath("//input[@name='pass']"));
	 
	 String str = "Shubham";
	 
	 ref.sendKeys(str);
	 
	
	 
	 for (int i = 0; i < str.length(); i++) 
	 {
	     ref.sendKeys(Keys.BACK_SPACE);
	     Thread.sleep(2000);
	 }
	 
	 
	 ref.sendKeys(Keys.CONTROL+"a");
	 
	 //ref.sendKeys(Keys.BACK_SPACE);
	 
	 System.out.println("Main method ended..");
}
}
