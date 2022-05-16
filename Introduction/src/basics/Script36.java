package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script36 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.yatra.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement rv = driver.findElement(By.xpath("//a[text()='My Account']"));

		Actions a = new Actions(driver);

		a.moveToElement(rv).perform();

		driver.findElement(By.xpath("//a[@id='SignUpBtn']")).click();

		driver.findElement(By.xpath("//i[@class='fa fa-facebook-square']")).click();

		Set<String> ref = driver.getWindowHandles();

		Iterator<String> itr = ref.iterator();

		/*
		 * while (itr.hasNext()) { String str1 = itr.next();
		 * 
		 * String str2 = itr.next();
		 * 
		 * driver.switchTo().window(str2); }
		 */

		String parent_ref = itr.next();

		String child_ref = itr.next();

		driver.switchTo().window(child_ref);
		
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shubham");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");

		driver.quit();
	}
}
