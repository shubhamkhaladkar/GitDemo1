package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	@Test
	public void test() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/checkboxes");

		WebElement rv = driver.findElement(By.xpath("(//input[@type='checkbox']) [1]"));

		WebElement ref = driver.findElement(By.xpath("(//input[@type='checkbox']) [2]"));

		ref.click();

		rv.click();

		Assert.assertNotNull(rv);
		
		Assert.assertNotNull(ref);
	}
}
