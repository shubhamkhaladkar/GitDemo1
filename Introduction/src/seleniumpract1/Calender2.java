package seleniumpract1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement rv = driver.findElement(By.xpath("//input[@id='src']"));

		rv.sendKeys("Pune");

		rv.sendKeys(Keys.ENTER);

		WebElement ref = driver.findElement(By.xpath("//input[@id='dest']"));

		ref.sendKeys("Osmanabad");
		
		ref.sendKeys(Keys.ENTER);

		WebElement date = driver.findElement(By.xpath("(//input[@class='db'])[3]"));

		date.click();
		
		Thread.sleep(3000);

  WebElement next = driver.findElement(By.xpath("//td[@class='next']"));

	  next.click();

		driver.findElement(By.xpath("(//td[@class='wd day'])[7]")).click();
		
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();

	}
}
