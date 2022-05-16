package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script7 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shubham");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("shubham");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
	}
}
