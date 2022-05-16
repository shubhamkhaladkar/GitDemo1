package test;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Instagramlogin;

public class TestInstagramlogin {
	@Test
	public void loginpage() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/accounts/login/");

		Instagramlogin ig = new Instagramlogin(driver);

		ig.enterusername("1234567890");
		ig.enterpassword("shubham124");
		ig.clickonloginbuttonn();
		ig.errormessagemethod();
		Thread.sleep(3000);
		ig.closbrowser();

	}

	@AfterMethod
	public void getstatusofmethods(ITestResult result) {
		if (result.getStatus() == 1) {
			Reporter.log(result.getName() + "-method is passed", true);

		} else if (result.getStatus() == 2) {
			Reporter.log(result.getName() + "-method is failed", true);
		} else {
			Reporter.log(result.getName() + "-method is skipped..", true);
		}
	}

}
