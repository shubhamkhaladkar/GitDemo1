package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert2 
{
 @Test
 public void data()
 {
	 String str="Shubham";
	 
	 Assert.assertNull(str);  //fail
	 
	 Assert.assertNotNull(str);  //pass
 }
}
