package qabyshubham;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	ExtentReports repo;
	
	@BeforeTest
	public void report()
	{
		String str = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter  reoprter  = new ExtentSparkReporter(str);
		
		reoprter.config().setReportName("QAByShubham");
		reoprter.config().setDocumentTitle("Test result");
		
		
		 repo = new ExtentReports();
		repo.attachReporter(reoprter);
		repo.setSystemInfo("Tester", "Shubham Khaladkar");
	}
	
	
@Test
	public void launchingbrowser() {
		ExtentTest test = repo.createTest("Initial Demo");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://github.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("Test casesis failed");
		repo.flush();
	}
}
