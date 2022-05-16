package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keystroke2 
{
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver  = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("https://www.facebook.com/");
	 
    WebElement rv = driver.findElement(By.xpath("//input[@name='email']"));
    String str ="9960216387";
    rv.sendKeys(str);
    for (int i = 0; i < str.length(); i++) 
    {
		rv.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
	}
   
    rv.sendKeys("khaladkar@gmail.com");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Shubham");
    
    driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
    
    driver.close();
}
}
