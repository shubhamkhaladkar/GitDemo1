package practise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildbroswerPopup1 {
	public static void main(String[] args) {

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

		String Parent_ID = itr.next();

		String child_ID = itr.next();

		driver.switchTo().window(child_ID);

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		System.out.println("Total windows are displayed:" + str.size());

	}
}
