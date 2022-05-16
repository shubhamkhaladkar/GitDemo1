package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG7
{
 @Test(invocationCount = 9)
 public void sample()
 {
	Reporter.log("Sample method is running..");
 }
}
