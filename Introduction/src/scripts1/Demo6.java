package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Shubham");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shubham");
		
		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
		
		Thread.sleep(7000);
	
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		
		driver.findElement(By.xpath("signInBtn")).click();
		
		String str = driver.findElement(By.xpath("//div[@class='fsl fwb fcb']")).getText();

		System.out.println(str);
		
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		
		driver.findElement(By.xpath("signInBtn")).click();
		
		driver.close();
		
		
		
		

		
		

	}
}
