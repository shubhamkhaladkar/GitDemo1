package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script8 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		WebElement rv = driver.findElement(By.xpath("//input[@id='email']"));

		rv.sendKeys("Shubham");

		Thread.sleep(2000);

		rv.sendKeys(Keys.CONTROL + "a");

		Thread.sleep(2000);

		rv.sendKeys(Keys.CONTROL + "c");

		Thread.sleep(2000);

		WebElement rv1 = driver.findElement(By.xpath("//input[@id='pass']"));

		rv1.sendKeys(Keys.CONTROL + "v");

		Thread.sleep(2000);

		WebElement rv2 = driver.findElement(By.xpath("//button[@name='login']"));

		rv2.sendKeys(Keys.ENTER);
		
         Thread.sleep(2000);

		driver.close();

	}
}
