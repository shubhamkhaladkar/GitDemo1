package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisplayAndEnable {
	public static void main(String[] args) {

		System.out.println("Main method started..");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement rv = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));

		if (rv.isEnabled()) {
			System.out.println("check box is enabled");
		} else {
			System.out.println("check box is not enabled..");
		}

		if (rv.isDisplayed()) {
			System.out.println("Chekbox is displayed");
		} else {
          System.out.println("checkbox is not displayed");
		}
		
		driver.close();
	}
}
