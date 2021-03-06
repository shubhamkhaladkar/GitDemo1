package testng1;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SampleTest18 {
	@Test
	public void test1() {
		Reporter.log("Test1 Method is running", true);
		Assert.fail();
	}

	@AfterMethod
	public void getresult(ITestResult result) {
		int status = result.getStatus();

		String name = result.getName();

		if (status == 1) {
			Reporter.log(name + "Test method is executed successfully", true);
		} else if (status == 0) {
			Reporter.log(name + "Test method is not executed successfully", true);
		} else {
			Reporter.log("Test Method execution is skipped", true);
		}
	}

}
