package testng1;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest14 {

	@BeforeTest
	public void beforetest() {
		Reporter.log("BeforeTest method is running", true);
	}

	@AfterTest
	public void aftertest() {
		Reporter.log("AfterTest method is running", true);
	}

	@Test
	public void test1() {
		Reporter.log("Test1 method is running", true);
	}
}
