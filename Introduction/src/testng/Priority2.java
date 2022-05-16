package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority2 
{
  @Test(priority = 1)
  public void klm()
  {
	  Reporter.log("klms method is running..",true);
  }
  
  @Test(priority = 1)
  public void abc()
  {
	Reporter.log("mnp method is running..", true); 
  }
  
  @Test
  public void klma()
  {
	  Reporter.log("klma method is running..", true);
  }
}
