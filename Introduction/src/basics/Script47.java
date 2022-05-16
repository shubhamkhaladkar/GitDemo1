package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script47 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("http://admin:admin@the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();

		System.out.println(driver.getCurrentUrl());

		driver.close();
	}
}
