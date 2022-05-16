package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script25 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		//scrolldown
		
		for (int i = 0; i <= 5; i++) {

			js.executeScript("window.scrollBy(0,200)");

			Thread.sleep(2000);
		}
      
		//scrollup
		for (int i = 0; i <= 5; i++) {

			js.executeScript("window.scrollBy(0,-200)");

			Thread.sleep(2000);
		}

	}
}
