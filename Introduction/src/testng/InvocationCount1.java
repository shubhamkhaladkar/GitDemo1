package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount1 
{
 @Test(invocationCount = 12)
 public void Test1()
 {
	 Reporter.log("Method is 12 time running..",true);
 }
}
