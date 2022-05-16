package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_Division_Popup {
	@Test
	public void test() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//span[@id='AccLogin']")).click();

		driver.findElement(By.xpath("//input[@id='mobileNo']")).click();

		String rv = driver.findElement(By.xpath("(//div[@class='errortxt']) [1]")).getText();

		System.out.println(rv);

		driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("9960216387");

		driver.findElement(By.xpath("(//input[@type='checkbox']) [1]")).click();

		driver.findElement(By.xpath("//input[@id='getotp']")).click();

		String rv1 = driver.findElement(By.xpath("(//div[@class='errortxt']) [1]")).getText();

		String str1 = "Please enter referral code.";

		if (rv1.equals(str1)) {
			System.out.println("Error message1 is matched");
		} else {
			System.out.println("Error message1 is not matched");
		}

		String str = "Please enter your mobile number.";

		if (rv.equals(str)) {
			Reporter.log("error message matched..", true);
		} else {
			Reporter.log("error message is not matched..", true);
		}
		driver.close();
	}
}
