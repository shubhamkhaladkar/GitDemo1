package practise;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Iresult {
	@Test

	public void Sample1() {
		Reporter.log("Sample1 method is running", true);
	}

	@Test(priority = 1)
	public void Sample2() {
		Reporter.log("Sample2 method is running", true);
	}

	@AfterMethod
	public void getresult(ITestResult result) {
		int status = result.getStatus();

		if (status == 1) {
			Reporter.log("Test method :- " + result.getName() + " is passed", true);
		} else if (status == 0) {
			Reporter.log("Test method :- " + result.getName() + " is failed", true);
		} else {
			Reporter.log("Method is skipped", true);
		}
	}
}
