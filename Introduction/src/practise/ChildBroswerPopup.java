package practise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBroswerPopup {

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://nxtgenaiacademy.com/multiplewindows/");

		Thread.sleep(7000);

		Set<String> str = driver.getWindowHandles();
		System.out.println("total number of window presents are:" + str.size());
		System.out.println(str);

		driver.quit();
	}
}
