package scripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo19 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String str1 = "Shubham";

		String str2 = "Shubham khaladkar";

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(str1);

		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(str2);

		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();
		
		driver.close();

	}
}
