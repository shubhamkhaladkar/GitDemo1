package seleniumpract1;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

public class TestNG2 {
	@Test(invocationCount = 10)
	public void Methhod1() {
		Reporter.log("Method1 is running..", true);
	}
}
