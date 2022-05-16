package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions1 
{
  public static void main(String[] args) {
	
	  System.out.println("Main method started..");
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver  = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.myntra.com/");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  WebElement ref = driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
	  
	  Actions a = new Actions(driver);
	  
	  a.moveToElement(ref).perform();
	  driver.findElement(By.xpath("(//a[text()='T-Shirts']) [1]")).click();
}
}
