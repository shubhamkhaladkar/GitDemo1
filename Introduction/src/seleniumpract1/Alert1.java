package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1
{
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		Alert a1 = driver.switchTo().alert();

		System.out.println(a1.getText());

		a1.accept();

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		Alert a2 = driver.switchTo().alert();

		System.out.println(a2.getText());

		a2.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert a3 = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		a3.sendKeys("Shubham");
		
		System.out.println(a3.getText());
		
		a3.dismiss();
		
		Thread.sleep(3000);

		driver.close();
		
		
	}
}
