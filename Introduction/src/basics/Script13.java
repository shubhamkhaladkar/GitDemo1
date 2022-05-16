package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script13 {
	public static void main(String[] args) {

		int visible_link = 0;

		int invisible_link = 0;

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		List<WebElement> ref = driver.findElements(By.xpath("//a"));

		List<WebElement> test = driver.findElements(By.tagName("img"));

		for (int i = 0; i < ref.size(); i++) {

			WebElement rv = ref.get(i);

			if (rv.isDisplayed()) {
				visible_link++;
			} else {
				invisible_link++;
			}

		}

		System.out.println(ref.size());

		System.out.println("the count of invisible link is:" + invisible_link);

		System.out.println("the count of visible link is:" + visible_link);

		System.out.println("the count is images present in a page:" + test.size());

	}
}
