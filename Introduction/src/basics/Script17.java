package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script17 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement rv = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		rv.click();

		Select s = new Select(rv);

		s.selectByIndex(2);

		System.out.println(s.getFirstSelectedOption().getText());

		s.selectByVisibleText("Option3");

		System.out.println(s.getFirstSelectedOption().getText());

		s.selectByValue("option1");

		System.out.println(s.getFirstSelectedOption().getText());

		driver.close();

	}
}
