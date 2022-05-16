package basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script18 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shubham");

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("khaladkar");

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123455678");

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Shubham");

		WebElement rv = driver.findElement(By.xpath("//select[@id='day']"));

		rv.click();

		Select s = new Select(rv);

		s.selectByIndex(8);

		WebElement rv1 = driver.findElement(By.xpath("//select[@id='month']"));

		rv1.click();

		Select s1 = new Select(rv1);
		s1.selectByValue("6");

		WebElement rv2 = driver.findElement(By.xpath("//select[@id='year']"));

		rv2.click();

		Select s2 = new Select(rv2);

		s2.selectByVisibleText("1998");

		System.out.println(s.getFirstSelectedOption().getText());

		System.out.println(s1.getFirstSelectedOption().getText());

		System.out.println(s2.getFirstSelectedOption().getText());

		driver.close();

	}
}
