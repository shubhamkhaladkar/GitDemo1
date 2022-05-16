package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Alertpopup;

public class Testalertpopup {
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/");
		
		Alertpopup ap = new Alertpopup(driver);
		
		ap.clickonjavaalert();
		ap.clickonalt1();
		ap.clickonalt2();
		ap.clickonalt3();
		
		driver.close();
	}
}
