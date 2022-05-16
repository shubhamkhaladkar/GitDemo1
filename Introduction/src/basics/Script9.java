package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);

		WebElement rv = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));

		rv.sendKeys("9960216387");

		Thread.sleep(2000);

		rv.sendKeys(Keys.CONTROL + "a");

		Thread.sleep(2000);

		rv.sendKeys(Keys.CONTROL + "c");

		Thread.sleep(2000);

		WebElement rv1 = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));

		rv1.sendKeys(Keys.CONTROL + "v");

		Thread.sleep(2000);

		rv1.sendKeys(Keys.CONTROL + "a");

		Thread.sleep(2000);

		rv1.sendKeys(Keys.BACK_SPACE);

		Thread.sleep(2000);

		driver.close();

	}
}
