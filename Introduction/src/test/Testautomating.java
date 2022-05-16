package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Automatingpage;

public class Testautomating {
	@Test
	public void automationpage() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		Automatingpage as = new Automatingpage(driver);

		as.clickonradiobutton();
		as.autosuggestion();
		as.staticdropdown();
		as.selectcheckbox();
		as.clickonwindowbutton();
		as.clickontab();
		as.entername();
		as.scrolldown();
		as.textofcoursename();
		as.scrolldown1();
		as.getsecondwebtable();
		as.scrolldown();
		as.dynamicdropdown();
		as.scrolldown();
		as.elementinframe();
		//as.thereloadedpage();
		as.closebrowser();

	}

	@AfterMethod
	public void testresult(ITestResult result) {
		if (result.getStatus() == 1) {
			Reporter.log(result.getName() + " Method is passed", true);
		} else if (result.getStatus() == 2) {
			Reporter.log(result.getName() + "Method is failed", true);
		} else {
			Reporter.log("Method is skipped", true);
		}
	}

}
