package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shubham");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("shubham");

		driver.findElement(By.xpath("//button[@name='login']")).click();

		String str = driver.findElement(By.xpath("//div[@class='fsl fwb fcb']")).getText();

		System.out.println(str);
		
		
		

		driver.close();
	}
}
