package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.DragandDropInFrame;

public class TestDragdropinframe {
	@Test
	public void samp() {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/");

		DragandDropInFrame sr = new DragandDropInFrame(driver);

		sr.clickondragbutton();

		sr.navigatetoframe();

		sr.draganddropmethod();

		//driver.close();
	}
}
