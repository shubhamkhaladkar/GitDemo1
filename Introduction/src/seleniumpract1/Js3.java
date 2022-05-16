package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js3 
{
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver  = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.myntra.com/");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		JavascriptExecutor  js  = (JavascriptExecutor) driver;
	
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //bottom of the page

		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollTop)"); //top of the page
		
	}
}
