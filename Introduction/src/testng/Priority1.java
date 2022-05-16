package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority = 1)
	public void Test1() {
		Reporter.log("Test1 method is running..", true);
	}

	@Test(priority = -1)
	public void Test2() {
		Reporter.log("Test2 negative priority method is running", true);
	}
	
	@Test(priority = -2)
	public void Test4()
	{
		Reporter.log("Test3-priority2 method is running..",true);
	}
	
}
