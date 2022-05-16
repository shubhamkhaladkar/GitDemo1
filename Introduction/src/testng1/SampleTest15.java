package testng1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

public class SampleTest15 {
	@AfterMethod
	public void test1() {
		Reporter.log("After method is running..", true);
	}

	@BeforeMethod
	public void test2() {
		Reporter.log("Before Method is running..", true);
	}

	@Test
	public void sample() {
		Reporter.log("Sample method is running..", true);
	}

	@Test
	public void sample2() {
		Reporter.log("Sample2 method is running", true);
	}
}
