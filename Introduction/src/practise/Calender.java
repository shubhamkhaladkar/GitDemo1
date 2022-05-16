package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://phptravels.net/");

		WebElement search = driver.findElement(By.xpath("(//span[contains(@class,'select2')])[1]"));
		search.click();
		Thread.sleep(2000);
		search.sendKeys("Pun");
		driver.findElement(By.xpath("(//li[contains(@class,'select2')])[2]")).click();

		WebElement ref = driver.findElement(By.xpath("(//input[@type='text']) [1]"));
		WebElement rv = driver.findElement(By.xpath("//input[@id='checkin']"));
		rv.click();
		driver.findElement(By.xpath("(//td[@class='day  active']) [1]")).click();
		// System.out.println("Today's date is:" + ref.getText());

		// driver.findElement(By.xpath("//input[@id='checkout']")).click();

		WebElement next = driver.findElement(By.xpath("(//th[@class='next'])[4]"));

		next.click();
		Thread.sleep(2000);
		next.click();
		Thread.sleep(2000);
		next.click();
		Thread.sleep(2000);

		/*
		 * for (int i =1; i<=3; i++) { next.get(i).click(); Thread.sleep(2000); }
		 */
		driver.findElement(By.xpath("(//td[text()='9']) [3]")).click();

		driver.findElement(By.xpath("(//a[contains(@class,'dropdown')]) [25]")).click();

		driver.findElement(By.xpath("(//i[@class='la la-plus'])[1]")).click();
		
		driver.findElement(By.xpath("(//i[@class='la la-plus'])[4]")).click();
		
		WebElement child = driver.findElement(By.xpath("//select[@id='ages1']"));
		
		child.click();
		
		Select s = new Select(child);
		
		s.selectByIndex(6);
		
		driver.findElement(By.xpath("(//a[contains(@class,'dropdown')]) [25]")).click();
		
		driver.findElement(By.xpath("(//button[@id='submit'])[1]")).click();
		
		

	}
}
