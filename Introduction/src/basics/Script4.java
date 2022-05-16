package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script4 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.youtube.com/");

		Thread.sleep(2000);

		driver.manage().window().setSize(new Dimension(100, 200));

		Thread.sleep(2000);

		driver.manage().window().setPosition(new Point(100, 50));

		Thread.sleep(2000);

		driver.close();

	}
}
