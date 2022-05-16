package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG9
{
 @Test
 public void method1()
 {
	 Reporter.log("method1 is running..");
 }
 @Test(dependsOnMethods = "method1")
 public void method2()
 {
	 Reporter.log("method2 is running..");
 }
 
 /*@Test(dependsOnMethods = {"method2", "method1"})
 public void method3()
 {
	 Reporter.log("method3 is running..");
 }*/
}
