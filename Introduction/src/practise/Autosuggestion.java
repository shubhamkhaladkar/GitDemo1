package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		WebElement ref = driver.findElement(By.xpath("//input[contains(@class,'gsfi')]"));

		ref.sendKeys("selenium");

		List<WebElement> rv = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));

		System.out.println("total number of auto suggestions:" + rv.size());

		for (int i = 0; i < rv.size(); i++) // approach1
		{
			System.out.println(rv.get(i).getText());
		}
		Thread.sleep(3000);

		rv.get(4).click();

		System.out.println(driver.getTitle());

		/*
		 * ref.sendKeys(Keys.ARROW_DOWN); Thread.sleep(3000);
		 * ref.sendKeys(Keys.ARROW_DOWN); Thread.sleep(3000);
		 * ref.sendKeys(Keys.ARROW_DOWN); Thread.sleep(3000);
		 * ref.sendKeys(Keys.ARROW_DOWN); Thread.sleep(3000); ref.click();
		 */
		System.out.println(driver.getTitle());
		driver.close();

	}
}
