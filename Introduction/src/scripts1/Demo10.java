package scripts1;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo10 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		for (int i = 1; i < 3; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			Thread.sleep(2000);
		}

		for (int i = 0; i < 2; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
			Thread.sleep(2000);
		}

		for (int i = 0; i < 2; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
			Thread.sleep(2000);
		}

		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

		driver.close();

	}
}
