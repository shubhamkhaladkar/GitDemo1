package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHybrid {
	WebDriver driver;

	@Test
	public void sample() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Status Codes']")).click();

		String ref = driver.getTitle();
		
		System.out.println(ref);

		String rv = "The Internet";

		Assert.assertEquals(ref, rv);
	}

	
	
	@AfterMethod

	public void getresult(ITestResult result) {
		int status = result.getStatus();

		if (status == 1) {
			Reporter.log("Test method :- " + result.getName() + " is passed ", true);
		}

		else if (status == 0) {
			Reporter.log("Test Method :- " + result.getName() + " is failed ", true);
		}

		else {
			Reporter.log("test method:- " + result.getName() + " is skipped ", true);
		}

	}

	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}
