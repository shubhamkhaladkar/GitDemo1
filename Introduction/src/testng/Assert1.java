package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1
{
 @Test
 
 public void verify()
 {
	 String str ="Shubham";
	 
	 String str1 = "shubham";
	 
	 Assert.assertEquals(str, str1); //fail 
	 
	 Assert.assertNotEquals(str, str1);  //pass
 }
}
