package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG16 
{
 @Test
 public void test()
 {
	 String str= "shubham";
	 
	 String str1 ="Shubham";
	 
	SoftAssert s = new SoftAssert();
	
	Assert.assertEquals(str, str1);
	
	Assert.assertNotEquals(str, str1);
	
	Assert.assertNull(str);
	Assert.assertNotNull(str1);
	s.assertAll();
 }
 @Test
 public void sample2()
 {
	 Reporter.log("sample2 method is running" , true);
 }
}
