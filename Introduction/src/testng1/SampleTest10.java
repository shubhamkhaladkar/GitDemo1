package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest10 
{
 @Test
 public void test1()
 {
	 String str ="Shubham";
	 
	Assert.assertNull(str);
 }
 
 @Test
 public void test2()
 {
	 String str1="" ;
	 
	 Assert.assertNotNull(str1);
 }
}
