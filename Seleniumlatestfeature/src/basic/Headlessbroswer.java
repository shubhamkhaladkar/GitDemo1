package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headlessbroswer 
{
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--headless");
		ChromeDriver driver  = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.xpath("(//a[contains(@href,'angular')]) [4]")).click();
		
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'cart')]")).click();
		
		WebElement box = driver.findElement(By.xpath("//input[contains(@id,'example')]"));
		
		box.clear();
		
		box.sendKeys("2");
		
		 LogEntries entry = driver.manage().logs().get(LogType.BROWSER);  //get log entry object
		 
		 List<LogEntry> logs = entry.getAll();  //logentryobject -getall method return all logs in list 
		 
		 for (int i = 0; i < logs.size(); i++) //iterating and printing each
		 {
		  System.out.println(logs.get(i).getMessage());	
		}
		
		 System.out.println("Mainmethoended");
		
	}
}
