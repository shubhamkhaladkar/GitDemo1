package basics;

import org.apache.poi.ss.usermodel.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script53 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		WebElement rv = driver.findElement(By.xpath("//input[@name='email']"));

		System.out.println(rv.getSize());

		System.out.println(rv.getSize().getHeight());

		System.out.println(rv.getSize().getWidth());

		System.out.println(rv.getCssValue("font-size"));

		System.out.println(rv.getRect().getX());

		System.out.println(rv.getRect().getY());

		driver.findElement(By.xpath("//button[@name='login']")).click();

		WebElement ref = driver.findElement(By.xpath("//div[contains(text(),'email address')]"));

		System.out.println(ref.getCssValue("background-color"));

		driver.navigate().back();

		System.out.println(driver.getCurrentUrl());

		driver.close();
	}
}
