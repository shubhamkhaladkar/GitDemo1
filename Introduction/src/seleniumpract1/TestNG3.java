package seleniumpract1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG3 {
	// dependsonmethod

	@Test
	public void method1() {
		Reporter.log("Method1 is running..", true);
	}

	@Test(dependsOnMethods = { "method1", "method3" })
	public void method2() {
		Reporter.log("Method2 is running..", true);
	}

	@Test
	public void method3() {
		Reporter.log("Method3 is running..", true);
	}
	
	@Test (enabled = true)
	public void method4()
	{
		Reporter.log("Method4 is running..", true);
	}
}
