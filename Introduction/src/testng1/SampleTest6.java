package testng1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest6 
{
 @DataProvider
 public Object testdata()
 {
	 Object[] [] rv = new Object[3][2];
	 rv[0][0]="shubham";
	 rv[0][1]="SHUBHAM";
	 rv[1][0]="Nikhil";
	 rv[1][1]="NIKHIL";
	 rv[2][0]="Ayush";
	 rv[2][1]="AYUSH";
	 return rv;
 }
 
 @Test(dataProvider = "testdata")
 public void method1(String username, String password)
 {
	 System.out.println(username);
	 
	 System.out.println(password);
 }
 
 


 
}
