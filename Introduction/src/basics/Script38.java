package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script38 { // take screenshot using selenium

	public static void main(String[] args) throws IOException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

		TakesScreenshot s = (TakesScreenshot) driver;

		File file = s.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("google1.png"));

		WebElement rv = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

		System.out.println(rv.getRect().getDimension().getHeight());

		System.out.println(rv.getRect().getWidth());
		
		driver.close();

	}
}
