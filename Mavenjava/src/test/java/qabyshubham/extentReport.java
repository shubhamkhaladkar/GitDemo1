package qabyshubham;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extentReport
{
ExtentReports repo;
	
	@BeforeTest
	public void report()
	{
		String str = System.getProperty("user.dir")+"\\reports\\index1.html";
		
		ExtentSparkReporter  reoprter  = new ExtentSparkReporter(str);
		
		reoprter.config().setReportName("QAByShubham");
		reoprter.config().setDocumentTitle("Test result");
		
		
		 repo = new ExtentReports();
		repo.attachReporter(reoprter);
		repo.setSystemInfo("Tester", "Shubham Khaladkar");
	}
	
 @Test
 public void test1()
 {
		ExtentTest test = repo.createTest("Intial Demo");
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("https://www.youtube.com/");
	 
	 System.out.println(driver.getTitle());
	 
	 System.out.println(driver.getCurrentUrl());
	 
	 driver.close();
	 
	 repo.flush();
	 
}
}
