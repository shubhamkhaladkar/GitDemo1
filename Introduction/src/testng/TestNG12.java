package testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG12
{
 @DataProvider
 public Object[][] testdata()
 {
	 Object[][] rv = new Object[2][2];
	 rv[0][0] ="Admin";
	 rv[0][1] ="User";
	 rv[1][0] ="Data";
	 rv[1][1] ="Test";
	 
	 return rv;
 }
 @Test(dataProvider = "testdata")
 public void sample(String username , String password)
 {
	Reporter.log(username , true);
	Reporter.log(password, true);
 }
}
