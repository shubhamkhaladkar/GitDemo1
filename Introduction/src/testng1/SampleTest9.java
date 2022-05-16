package testng1;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest9 
{
 @Test
 public void True()
 {
	 String str1= "Shubham";
	 
	 String str2 ="Shubham";
	 
	   boolean value = str2.equals(str1);
	   
	   Assert.assertTrue(value);
	  
 }
 
 @Test
 public void False()
 {
	 String str1= "Shubham";
	 
	 String str2="shubham";
	 
	 boolean ref = str2.equals(str1);
	 
	 Assert.assertFalse(ref);

 }
}
