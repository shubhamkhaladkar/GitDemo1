package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Selectingcoursefromrahulshetty;

public class Testselecting {
	@Test
	public void login() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://courses.rahulshettyacademy.com/");

		Selectingcoursefromrahulshetty sr = new Selectingcoursefromrahulshetty(driver);

		sr.clickonloginbutton();
		sr.enteremail("khaladkar6@gmail.com");
		sr.enterpass("Shubh@0906");
		sr.clickoncheckbox();
		Thread.sleep(2000);
		sr.reclickoncheckbox();
		sr.verifycheckboxistrue();
		sr.clickonlogin();
		sr.clickonallcourse();
		sr.getspecifictext();
		sr.closbrowser();

	}

	@AfterMethod
	public void itestmethod(ITestResult result) {
		if (result.getStatus() == 1) {
			Reporter.log(result.getName() + " Method is passed", true);
		} else if (result.getStatus() == 2) {
			Reporter.log(result.getName() + " Method is failed", true);
		} else {
			Reporter.log("Method is failed", true);
		}
	}

}
