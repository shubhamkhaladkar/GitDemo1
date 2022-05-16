package testng;

import org.testng.annotations.Test;

public class TestNG2 
{
@Test(enabled = false)
public void samp()
{
 System.out.println("TestNG2 is running....");
 
}
@Test(priority = 1)
public void samp2()
{
System.out.println("mani method is running");

}
@Test
public void samp3()
{
	System.out.println("Shubham is here..");
}
}
