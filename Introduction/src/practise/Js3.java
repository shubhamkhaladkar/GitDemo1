package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js3 {
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.myntra.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i <= 10; i++) {
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(1000);
		}

		for (int i = 0; i <= 10; i++) {
			js.executeScript("window.scrollBy(0,-200)");
			Thread.sleep(1000);
		}

		js.executeScript(("window.scrollBy(0,document.body.scrollHeight)"));
	//	js.executeScript(("window.scrollBy(0,document.body.scrollTop"));
	//	js.executeScript(("window.scrollBy(0,document.body.scrollWidth"));
	//	js.executeScript(("window.scrollBy(0,document.body.scrollLeft"));
		
		driver.close();

	}
}
