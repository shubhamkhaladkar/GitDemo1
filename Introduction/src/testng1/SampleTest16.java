package testng1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest16 {
	@Test
	public void test1() {
		Reporter.log("Test1 Method is running", true);
	}

	@AfterClass
	public void afterclass() {
		Reporter.log("AfterClass method is running", true);
	}

	@BeforeClass
	public void beforeclass() {
		Reporter.log("Before class method is running", true);
	}
}
