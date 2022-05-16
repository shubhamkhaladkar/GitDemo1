package testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 
{
    @DataProvider
    public Object[][] data()
    {
    	Object[][] ref = new Object[4][2];
    	ref[0][0]="Admin1";
    	ref[0][1]="Password1";
    	ref[1][0]="Admin2";
    	ref[1][1]="Password2";
    	ref[2][0]="Admin3";
    	ref[2][1]="Password3";
    	ref[3][0]="Admin4";
    	ref[3][1]="Password4";
    	
    	return ref;
    }
    
    @Test(dataProvider = "data")
    public void test(String Username, String password)
    {
    Reporter.log("Username is:"+Username,true);
    Reporter.log("Password is:"+password,true);
    Reporter.log("-----------------------------",true);
    }
}
