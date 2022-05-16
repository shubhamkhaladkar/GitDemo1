package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autos1 {
	@Test
	public void selectautos() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement rv = driver.findElement(By.xpath("//input[@id='autocomplete']"));

		rv.sendKeys("ind");

		rv.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(3000);

		rv.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(3000);

		rv.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(3000);

		rv.sendKeys(Keys.ENTER);

	}

	@AfterMethod
	public void methodresult(ITestResult result) {
		if (result.getStatus() == 1) {
			System.out.println(result.getName() + "method is passed");
		} else if (result.getStatus() == 2) {
			System.out.println(result.getName() + "Method is failed");
		} else {
			System.out.println("method is not executed");
		}
	}
}
