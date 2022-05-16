package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe2 {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main method started");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i <= 6; i++) {
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(1000);
		}

		WebElement ref = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));

		driver.switchTo().frame(ref);

		// driver.findElement(By.xpath("//a[text()='Mentorship']")).click();

		WebElement rv = driver.findElement(By.xpath("//a[text()='More ']"));

		Actions a = new Actions(driver);

		a.moveToElement(rv).perform();

		driver.switchTo().defaultContent();
		
		for (int i = 0; i <= 6; i++) {
			js.executeScript("window.scrollBy(0,-200)");
			Thread.sleep(1000);
		}
		

		driver.findElement(By.xpath("//select[contains(@id,'dropdown')]")).click();

	}
}
