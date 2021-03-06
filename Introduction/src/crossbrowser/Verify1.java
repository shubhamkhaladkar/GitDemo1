package crossbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify1 {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void runningmultiplebroswer(String broswername) throws InterruptedException {
		if (broswername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} else if (broswername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.manage().window().maximize();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(3000);

		WebElement Searchbox = driver.findElement(By.xpath("//input[@class='_3704LK']"));

		Searchbox.sendKeys("mamaearth");

		Thread.sleep(3000);

		Searchbox.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(3000);

		Searchbox.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(3000);

		Searchbox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		String s = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]")).getText();

		Reporter.log(s, true);

	}

	@AfterMethod
	public void getresult(ITestResult result) {
		int status = result.getStatus();

		String name = result.getName();

		if (status == 1) {
			Reporter.log(name + "Method is passed", true);
		}

		else if (status == 0) {
			Reporter.log(name + "Method is failed", true);
		} else {
			Reporter.log("Method is skipped", true);
		}

	}

	@AfterClass
	public void closebroswer() {
		driver.close();
	}
}
