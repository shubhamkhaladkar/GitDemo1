package testng1;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

public class SampleTest3 
{
 @Test
 public void Demo1()
 {
	 Reporter.log("Demo1 method is running",true);
 }
 
 @Test
 public void Demo2()
 {
	 Reporter.log("Demo2 Method is running", true);
 }
 
 @BeforeTest
 public void demo3()
 {
	 Reporter.log("Demo3 method is running..", true);
 }
 
 @AfterTest
 public void demo4()
 {
	 Reporter.log("Demo4 method is running", true);
 }
}
