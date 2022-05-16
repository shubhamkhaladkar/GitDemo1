package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo24 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement rv = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));

		Actions a = new Actions(driver);

		a.moveToElement(rv).perform();

		/*a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("shubham").doubleClick().perform();*/
		
		WebElement str = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//str.click();
		
		a.moveToElement(str).click().keyDown(Keys.SHIFT).sendKeys("shubham").perform();
		

		a.moveToElement(rv).contextClick().perform();
		
		

	}
}
