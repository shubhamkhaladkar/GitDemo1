package scripts1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo32 {
	
	//failed
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		
		while (!driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //div[@class='ui-datepicker-title']")).getText()
				.contains("April"));
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}

		List<WebElement> str = driver.findElements(By.xpath("//a[@class='ui-state-default']"));

		for (int i = 0; i < str.size(); i++) {
			String rv = str.get(i).getText();

			if (rv.equalsIgnoreCase("10")) {
				str.get(i).click();
				break;
			} else {

			}
			
			
		}
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		
		while (!driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //div[@class='ui-datepicker-title']")).getText()
				.contains("June"));
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		
		List<WebElement> str1 = driver.findElements(By.xpath("//a[@class='ui-state-default']"));

		for (int i = 0; i < str.size(); i++) {
			String rv2 = str1.get(i).getText();

			if (rv2.equalsIgnoreCase("23")) {
				str1.get(i).click();
				break;
			} else {

			}
			
			
		}
		

	}
}
