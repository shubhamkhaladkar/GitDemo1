package scripts1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://istqb.patshala.com/");

		Thread.sleep(4000);

		driver.navigate().forward();

		Thread.sleep(4000);

		driver.navigate().back();

		Thread.sleep(4000);

		driver.navigate().refresh();

		Thread.sleep(4000);

		driver.close();
	}
}
