package practise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopup2 {
	@Test
	public void test() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		WebElement rv = driver.findElement(By.xpath("//a[text()='My Account']"));
		Actions a = new Actions(driver);
		a.moveToElement(rv).perform();

		driver.findElement(By.xpath("//a[@id='signInBtn']")).click();

		driver.findElement(By.xpath("//button[@id='fb-login-btn']")).click();

		Set<String> str = driver.getWindowHandles();

		Iterator<String> itr = str.iterator();

		while (itr.hasNext()) {
			String rvref = itr.next();
			System.out.println(rvref);
			driver.switchTo().window(rvref);
			driver.close();
		}
	}
}
