package testng1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT1 {
	@Test
	public void fileupload1() throws IOException, InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///C:/jar%20files%20and%20exe%20files/Psse17/Html/FileUpload.html");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='element']")).click();
		Thread.sleep(3000);

		Runtime.getRuntime().exec("C:\\Users\\khala\\OneDrive\\Documents");
	}

	@AfterMethod
	public void getresult(ITestResult result) {
		int status = result.getStatus();

		String name = result.getName();

		if (status == 1) {
			Reporter.log(name + " Method is passed", true);
		} else if (status == 0) {
			Reporter.log(name + " method is failed", true);
		}

		else {
			Reporter.log(" Method is skipped");
		}
	}
}
