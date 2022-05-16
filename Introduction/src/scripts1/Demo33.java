package scripts1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo33 {
	public static void main(String[] args) throws InterruptedException {
int sum =0;

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		
		//scrolling of webtable
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=100"); 
		
		List<WebElement> str = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
		
		for (int i = 0; i <str.size(); i++) 
		{
		        sum = sum + Integer.parseInt(str.get(i).getText());	
		        
		        
		}
		System.out.println(sum);
		
		
	  int rv = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
	   
	  Assert.assertEquals(sum, rv);
	  
	  driver.close();
	  
	 
	   
	   
		
	}
}
