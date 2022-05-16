package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Remove {
	public static void main(String[] args) {

		System.out.println("Main method started..");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		WebElement rv = driver.findElement(By.xpath("//input[@name='email']"));

		rv.sendKeys("shubham");

		rv.clear();

		rv.sendKeys("9960216387");

		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("shubham");

		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//driver.close();
		
		System.out.println("Main method ended..");

	}
}
