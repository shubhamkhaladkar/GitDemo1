package testng1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest17 {
	@Test
	public void Test1() {
		Reporter.log("Test1 Method is running", true);
	}

	@Test
	public void Test2() {
		Reporter.log("Test2 Method is running", true);
	}

	@AfterMethod
	public void Aftermethod() {
		Reporter.log("After Method is running", true);
	}

	@AfterClass
	public void Afterclass() {
		Reporter.log("After class method is running", true);
	}

	@BeforeMethod
	public void beforemethod() {
		Reporter.log("BeforeMethod is ruuning", true);
	}

	@BeforeClass
	public void Beforeclass() {
		Reporter.log("Beforeclass Method is running", true);
	}
}
