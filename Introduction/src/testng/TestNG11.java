package testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG11 {

	@DataProvider
	public Object[][] testdata()
	{
		Object[][] rv = new Object[3][1];
		rv[0][0]="admin";
		rv[1][0]="shubham";
		rv[2][0]="damba";
		return rv;
	}
	
	@Test(dataProvider = "testdata")
	public void sample1(String name)
	{
	Reporter.log(name);
	}
	
}
