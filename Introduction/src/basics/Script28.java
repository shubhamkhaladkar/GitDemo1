package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script28 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		Alert a1 = driver.switchTo().alert();

		System.out.println(a1.getText());

		Thread.sleep(3000);

		a1.accept();

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		Alert a2 = driver.switchTo().alert();

		System.out.println(a2.getText());

		Thread.sleep(3000);

		a2.dismiss();

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		Alert a3 = driver.switchTo().alert();

		a3.sendKeys("Shubham is here");

		Thread.sleep(3000);

		System.out.println(a3.getText());

		a3.accept();
		
		driver.close();

	}
}
