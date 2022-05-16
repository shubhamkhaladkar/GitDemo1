package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script5 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement rv = driver.findElement(By.xpath("//input[@id='email']"));

		rv.sendKeys("khaladkar6@gmail.com");

		Thread.sleep(2000);

		rv.clear();

		Thread.sleep(2000);

		rv.sendKeys("9960216387");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("shubham");

		driver.close();

	}
}
