package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxselected {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*driver.get("https://rahulshettyacademy.com/#/index");

		driver.findElement(By.xpath("(//a[text()='Practice']) [1]")).click();

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Shubham Khaladkar");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("khaladkar6@gmail.com");

		WebElement rv = driver.findElement(By.xpath("//input[@id='agreeTerms']"));

		rv.click();
		

		if (rv.isSelected()) {
			System.out.println("check box is selected..");
		} else {
			System.out.println("Check box is not selected..");
		}

		driver.findElement(By.xpath("(//button[contains(@class,'theme')]) [1]")).click();

		driver.findElement(By.xpath("(//a[contains(text(),'Automation')]) [2]")).click();*/
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		
		
		WebElement ref = driver.findElement(By.xpath("(//input[@type='checkbox']) [1]"));

		if (ref.isEnabled()) {
			System.out.println("Check box is enable");
		} else {
			System.out.println("check box is not enable");
		}

		WebElement dev = driver.findElement(By.xpath("//label[@for='radio1']"));

		if (dev.isDisplayed()) {

			System.out.println("name is displayed");
		}

		else {
			System.out.println("name is not displayed");
		}

	}
}
