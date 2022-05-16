package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script45 {
	@Test
	public void executing() {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		Script44 s = new Script44(driver);

		s.enter_username();

		s.enter_password();

		s.clickonloginbutton();

		String str = "The password that you've entered is incorrect. Forgotten password?";

		String rv = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();

		if (str.equals(rv)) {
			System.out.println("Vaidation message is displayed");
		} else {

		}

	}
}
