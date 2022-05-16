package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keystroke1 {

	public static void main(String[] args) {

		System.out.println("Main method started..");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement rv = driver.findElement(By.xpath("//input[@name='email']"));

		rv.sendKeys("Shubham");

		rv.sendKeys(Keys.CONTROL + "a");
		rv.sendKeys(Keys.CONTROL + "c");

		WebElement ref = driver.findElement(By.xpath("//input[@name='pass']"));

		ref.sendKeys(Keys.CONTROL + "v");
		
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		
		button.sendKeys(Keys.ENTER);
		
		System.out.println("Main method ended..");
		
	}
}
