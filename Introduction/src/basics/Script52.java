package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script52 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().window().setSize(new Dimension(10, 23));

		Thread.sleep(3000);

		driver.manage().window().setPosition(new Point(6, 8));

		Thread.sleep(3000);

		driver.close();

		WebElement rv = driver.findElement(By.xpath("//a"));

		rv.sendKeys(Keys.CONTROL + "a");

	}
}
