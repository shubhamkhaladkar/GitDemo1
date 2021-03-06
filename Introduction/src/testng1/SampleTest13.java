package testng1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTest13 
{
 @Test
 public void Test1()
 {
	 SoftAssert s  = new SoftAssert();
	 
	 Reporter.log("Test1 Method is started", true);
	 
	 String str1="Shubham";
	 
	 String str2 ="shubham";
	 
	 Reporter.log("Verification1 started",true);
	 
	 Assert.assertEquals(str1, str2);
	 
	 Reporter.log("Verification2 started",true);
	 
	 String rv ="Shubham";
	 
	 Assert.assertNull(rv);
	 
	 Reporter.log("Verification3 started",true);
	 
	 
	 Reporter.log("Verification is completed",true);
	 
	 s.assertAll();
 }
 
 @Test
 public void test2()
 {
	 Reporter.log("Test2 method is running", true);
 }
}
