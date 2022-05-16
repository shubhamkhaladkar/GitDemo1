package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js2 
{
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver  = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.myntra.com/");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	JavascriptExecutor  js  = (JavascriptExecutor) driver;
	
	for (int i = 0; i <=10; i++) 
	{
	  js.executeScript("window.scrollBy(0,200)");
	  Thread.sleep(1000);
	}
	
	for (int i = 0; i <=10; i++) 
	{
	  js.executeScript("window.scrollBy(0,-200)");
	  Thread.sleep(1000);
	}
}
}
