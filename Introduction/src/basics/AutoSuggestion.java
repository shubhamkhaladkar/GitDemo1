package basics;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {
	@Test

	public void auto() {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");

		List<WebElement> rv = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));

		System.out.println("Total auto suggestions are present:" + rv.size());

		for (int i = 0; i < rv.size(); i++) {
			System.out.println(rv.get(i).getText());
			
		}
		
		rv.get(4).click();

	}

	@AfterMethod
	public void testmethod(ITestResult result) {
		if (result.getStatus() == 1) {
			System.out.println(result.getName() + "Method is passed");
		} else if (result.getStatus() == 2) {
			System.out.println(result.getName() + "Method is failed");
		} else {
			System.out.println("Method is not executed");
		}

	}

}
