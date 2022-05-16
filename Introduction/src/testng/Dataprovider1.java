package testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 
{
   @DataProvider
   
   public Object[][] test()
   {
	   Object[][] rv = new Object[3][1];
	   rv[0][0]="Shubham";
	   rv[1][0]="Nikhil";
	   rv[2][0]="Sham";
	   return rv;
	      
   }
   
   @Test(dataProvider = "test")
   public void data(String dam)
   {
	  Reporter.log(dam,true);
   }
}
