package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Shubham");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shubham");

		driver.findElement(By.xpath("//span[@class='checkmark']")).click();

		driver.findElement(By.xpath("//input[@id='terms']")).click();

		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

		Thread.sleep(7000);

		String str2 = driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText();

		System.out.println(str2);

		driver.close();
	}
}
