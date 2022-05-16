package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script46 {
	@Test
	public void test_script46() {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in/");

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());
	}
}
