package basics;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i <= 4; i++) {
			js.executeScript("window.scrollBy(0,100)"); //scroll down to web page
			Thread.sleep(1000);
		}

		for (int i = 0; i <=2; i++) {
			js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,100)"); //scroll down web table
			Thread.sleep(1000);
		}

		
	List<WebElement> rv = driver.findElements(By.xpath("(//div[@class='tableFixHead']) //td[4]"));
	int sum=0;
	for (int i = 0; i <rv.size(); i++)
	{
	  sum=  sum + Integer.parseInt(rv.get(i).getText());
	}
	System.out.println("Total Amount Collected:"+sum);
		
		/*for (int i = 0; i <= 4; i++) {
			js.executeScript("window.scrollBy(0,-100)"); //scroll up web table 
			Thread.sleep(1000);
		}*/
	
	
	String currnetvalue = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
	
 int num = Integer.parseInt(currnetvalue);
 
 System.out.println(num);
 
 Assert.assertEquals(sum, num);
	
		driver.close();
	}
}
