package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest5 {
	@Test(enabled = true)
	public void test1() {
		Reporter.log("Test1 method is running", true);
	}

	@Test(enabled = false)
	public void test2() {
		Reporter.log("Test2 method is running", true);
	}

	@Test()
	public void test3() {
		Reporter.log("Test3 method is running", true);
	}
}
