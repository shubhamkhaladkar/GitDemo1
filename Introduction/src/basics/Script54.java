package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script54 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mousetester.com/");

		WebElement rv = driver.findElement(By.xpath("//div[@id='clickMe']"));

		Actions a = new Actions(driver);
		
		Thread.sleep(2000);

		a.moveToElement(rv).doubleClick().perform();

		a.moveToElement(rv).contextClick().perform();
	}
}
