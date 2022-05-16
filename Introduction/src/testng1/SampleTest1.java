package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest1
{
 @Test
 public void test1()
 {
	 Reporter.log("Test1 method is running", true);
 }
 
 @Test
 public void test2()
 {
	 Reporter.log("Test2 method is running",true);
 }
 
 
}
