package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo30 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//input[@id='jex']")).sendKeys("JAVA");
		
		
		
		

	}
}
