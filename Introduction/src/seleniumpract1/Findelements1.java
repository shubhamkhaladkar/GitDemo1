package seleniumpract1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelements1 {
	public static void main(String[] args) {

		System.out.println("Main method started..");

		int visible_links = 0;

		int invisible_links = 0;

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> rv = driver.findElements(By.xpath("//a"));

		for (int i = 0; i < rv.size(); i++) {
			System.out.println(rv.get(i).getText());

			WebElement ref = rv.get(i);

			if (ref.isDisplayed()) {
				visible_links++;
			} else {
				invisible_links++;
			}
		}

		System.out.println("the count of links is:" + rv.size());

		System.out.println("the count of visible links:" + visible_links);

		System.out.println("the count of invisible links:" + invisible_links);

	}
}
