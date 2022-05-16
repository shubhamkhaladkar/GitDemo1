package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(5000);

		js.executeScript("document.getElementsByName('login').value='shubham'");

		Thread.sleep(5000);

		js.executeScript("document.getElementById('pass').value='shubh'");

		Thread.sleep(5000);

		js.executeScript("document.getElementsByName('login').click()");

		Thread.sleep(5000);

		driver.close();

	}

}
