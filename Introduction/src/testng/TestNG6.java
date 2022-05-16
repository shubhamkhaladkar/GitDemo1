package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG6 
{
 @Test(priority = 1)
 public void method1()
 {
	 Reporter.log("Method1 is running");
 }
 
 @Test(priority = 0)
 public void method2()
 {
	 Reporter.log("method2 is running");
 }
 
 @Test(priority = 0)
 public void lmethod()
 {
	 Reporter.log("lmethod is running");
 }
 
 @Test(priority = -1)
 public void method4()
 {
	 Reporter.log("method4 is running");
 }
 
 @Test(priority = 0)
 public void method3()
 {
	 Reporter.log("method3 is running");
 }
}
