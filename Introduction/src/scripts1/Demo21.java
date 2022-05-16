package scripts1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo21 {
	public static void main(String[] args) throws InterruptedException {
		int j = 0;
		String[] vegies = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot" };

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> str = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < str.size(); i++) {
			String[] names = str.get(i).getText().split("-");

			String rv = names[0].trim();

			// System.out.println(names);

			List<String> lisofvegies = Arrays.asList(vegies);

			if (lisofvegies.contains(rv)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

				Thread.sleep(2000);
			}

			if (j == vegies.length) {
				break;
			}

		}

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("shubham");

		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		WebElement rv = driver.findElement(By.xpath("//select[@style='width: 200px;']"));

		Select s = new Select(rv);

		s.selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();

		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

		driver.close();

	}
}
