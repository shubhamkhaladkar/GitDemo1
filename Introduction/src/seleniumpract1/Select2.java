package seleniumpract1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select2 {
	public static void main(String[] args) {

		System.out.println("main method started...");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[@role='button']) [2]")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shubham");

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");

		driver.findElement(By.xpath("(//input[contains(@name,'reg_email')]) [1]")).sendKeys("abc@gmail.com");

		WebElement rv = driver.findElement(By.xpath("//select[@name='birthday_day']"));

		Select s = new Select(rv);

		s.selectByIndex(8);

		WebElement rv1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));

		Select s1 = new Select(rv1);

		s1.selectByValue("6");

		WebElement rv2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));

		Select s2 = new Select(rv2);

		s2.selectByVisibleText("1998");

		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
	//driver.close();
	


	}
}
