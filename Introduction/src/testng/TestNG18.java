package testng;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG18 {
	@Test
	public void method1() {
		Reporter.log("Method1 is running..", true);
	}

	@Test
	public void method2() {
		String str = "shubh";

		String str1 = "Shubh";

		Assert.assertEquals(str, str1);

	}

	@AfterMethod
	public void gettestreuslt(ITestResult result) {

		if (result.getStatus() == 1) {
			Reporter.log(result.getName() + "-Method is passed", true);
		} else if (result.getStatus() == 2) {
			Reporter.log(result.getName() + "-Method is failed", true);
		} else {
			Reporter.log(result.getName() + "-Method is skipped", true);
		}
	}
}
