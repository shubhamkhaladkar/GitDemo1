package testng1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest11 
{
 @Test
 public void failmethod()
 {
	 Reporter.log("Fail method is running", true);
	 Assert.fail();
 }
}
