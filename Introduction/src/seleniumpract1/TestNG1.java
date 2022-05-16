package seleniumpract1;

import org.apache.logging.log4j.core.net.Priority;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG1 {
	@Test(priority = 2)
	public void test1() {
		Reporter.log("Test1 method is running", true);
	}

	@Test (priority = 1)
	public void Test2() {
		Reporter.log("Test2 Method is running", true);
	}

	@Test
	public void Abc() {
		Reporter.log("ABC method is running..", true);
	}
}
