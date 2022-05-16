package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script11 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement rv = driver.findElement(By.xpath("//input[@name='checkBoxOption1']"));

		boolean ref = rv.isEnabled();

		if (ref) {
			System.out.println("Button is enable...");
		}

		else {
			System.out.println("Button is disabled..");
		}
	}
}
