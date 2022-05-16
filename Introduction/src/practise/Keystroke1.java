package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keystroke1 {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		WebElement rv = driver.findElement(By.xpath("//input[@name='email']"));

		rv.sendKeys("Shhubham");

		rv.sendKeys(Keys.CONTROL + "a");

		rv.sendKeys(Keys.CONTROL + "c");

		WebElement ref = driver.findElement(By.xpath("//input[@name='pass']"));

		ref.sendKeys(Keys.CONTROL + "v");

		driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.close();
	}
}
