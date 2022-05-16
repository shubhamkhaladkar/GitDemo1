package scripts1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo16 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

		List<WebElement> str = driver.findElements(By.xpath("//input[@type='checkbox']"));

		System.out.println(str.size());
	}
}
