package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.YatraAcccreation;

public class TestYatraaccCreation {
	@Test
	public void samp1() throws IOException {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.yatra.com/");

		YatraAcccreation yca = new YatraAcccreation(driver);

		yca.movetomyaccountbutton();

		yca.clickonsignupbutton();

		yca.entermobilenumber();

		yca.clickoncontinuebutton();

		yca.errormessagedisplaying();

		TakesScreenshot s = (TakesScreenshot) driver;

		File file = s.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("Yatra1.png"));

		// driver.close();

	}
}
