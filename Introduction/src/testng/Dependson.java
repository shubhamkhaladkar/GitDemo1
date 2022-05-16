package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependson 
{
 @Test
 
 public void test1()
 {
	 Reporter.log("Test1 method is running..",true);
 }
 @Test
 public void test2()
 {
	 Reporter.log("Test2 method is running..", true);
 }
 
 @Test(dependsOnMethods = {"test1", "test2"})
 public void Test3()
 {
	 Reporter.log("Test3 Method is running..",true);
 }
}
