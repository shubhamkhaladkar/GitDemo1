package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imgattribute {

	@Test
	public void img() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.myntra.com/");

		List<WebElement> rv = driver.findElements(By.tagName("img"));

		System.out.println("Total images are present in webpage:" + rv.size());

		for (int i = 0; i <rv.size(); i++) {
			System.out.println(rv.get(i).getAttribute("src"));
		}
		
		driver.close();
		
	}
}
