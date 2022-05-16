package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js1 
{
 public static void main(String[] args) throws InterruptedException {
	
	 System.out.println("Main method started..");
	 
	 WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//Email
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='admin@gmail.com'");
		Thread.sleep(5000);
		//Password
		js.executeScript("document.getElementById('pass').value='admin123'");
		Thread.sleep(5000);
		//Login button
		js.executeScript("document.getElementById('u_0_b').click()");
		
		
	 
	 driver.close();
}
}
