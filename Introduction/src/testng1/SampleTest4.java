package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest4 
{
 @Test
 public void ref1()
 {
	 Reporter.log("Ref1 method is running", true);
 }
 @Test
 public void ref2()
 {
	 Reporter.log("Ref2 method is running", true);
 }
 
}
