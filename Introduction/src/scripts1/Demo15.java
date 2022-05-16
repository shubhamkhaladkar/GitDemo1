package scripts1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo15 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		List<WebElement> ref = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < ref.size(); i++) {
			String rv = ref.get(i).getText();

		}

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();

		WebElement rv = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));

		if (rv.isSelected()) {
			System.out.println("selected");
		} else {
			System.out.println("Not selected");
		}

	}
}
