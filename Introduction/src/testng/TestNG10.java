package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG10 
{
@Test
public void sample1()
{
Reporter.log("sample1 method is running..");	
}
@Test
public void sample2()
{
Reporter.log("Sample2 method is running..");	
}
@Test(enabled = false)
public void sample3()
{
Reporter.log("Sample3 method is running..");	
}
@Test
public void sample4()
{
Reporter.log("Sample4 method is running..");	
}
}
