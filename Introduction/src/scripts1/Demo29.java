package scripts1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo29 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		List<WebElement> rv = driver.findElements(By.tagName("a"));
		System.out.println(rv.size());
		for (int i = 0; i < rv.size(); i++) {
			System.out.println(rv.get(i).getText());
		}

		WebElement str = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(str.findElements(By.tagName("a")).size());

		WebElement test = str.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		System.out.println(test.findElements(By.tagName("a")).size());

		for (int i = 1; i < test.findElements(By.tagName("a")).size(); i++) {
			String dem = Keys.chord(Keys.CONTROL, Keys.ENTER);
			test.findElements(By.tagName("a")).get(i).sendKeys(dem);

			Thread.sleep(4000);

		}

		Set<String> str1 = driver.getWindowHandles();

		Iterator<String> it = str1.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());

			System.out.println(driver.getTitle());

		}

	}
}
