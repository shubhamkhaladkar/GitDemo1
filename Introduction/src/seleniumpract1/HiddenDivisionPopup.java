package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopup {
	public static void main(String[] args) {

		System.out.println("Main method started..");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.abhibus.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[@id='AccLogin']")).click();

		driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("9960216387");

		WebElement rv = driver.findElement(By.xpath("//input[@id='chk_refer_code']"));

		rv.click();

		if (rv.isSelected()) {
			System.out.println("Check box is selected..");
		} else {
			System.out.println("Check box is not selected");
		}
	}
}
