package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v97.log.Log;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Consolelogscapture {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

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
		
		
		
		
		
		

	}
}
