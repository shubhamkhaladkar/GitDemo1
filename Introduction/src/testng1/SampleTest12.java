package testng1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest12 
{
 @Test
 public void testmethod1()
 {
	 String str1 ="Shubham";
	 
	 String str2 ="Shubham";
	 
	 Assert.assertEquals(str1, str2);
 }
 
 @Test (dependsOnMethods = "testmethod1")
 public void testmethod2()
 {
	 String str1  ="Shubham";
	 
	 String str2="shubham";
	 
	 Assert.assertNotEquals(str1, str2);
 }
 
 @Test
 public void sample1()
 {
	 Reporter.log("Sample method is running",true);
 }
}
