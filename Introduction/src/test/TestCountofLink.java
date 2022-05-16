package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.CountOfLink;

public class TestCountofLink {
	@Test
	public void sample_testcountoflink() {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		
		CountOfLink c = new CountOfLink(driver);
		
		int rv = c.getthecount();
		
		driver.close();

	}
}
