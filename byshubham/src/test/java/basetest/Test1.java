package basetest;

import org.testng.annotations.Test;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basescript.Script1;
import pageobject.HomePage;
import pageobject.LoginPage;

public class Test1 extends Script1

{

	@Test()

	public void basescript() throws IOException {
		driver = initiatebrowser();
		driver.get(prop.getProperty("url"));
		// to access the method there are 2 ways
		// a) inheritance b) creating object of the class
		HomePage h1 = new HomePage(driver);
		h1.clickonloginbutton();
		LoginPage l1 = new LoginPage(driver);
		l1.enteremail("khaladkar6@gmail.com");
		l1.enterpass("Shubh@0906");
		l1.clickonloginbutton();
		l1.fetchtitle();
		l1.asser();
		
		
	
	}

	

	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	/*
	 * @DataProvider public Object[][] getdata() { //row stands for how many
	 * different data types test should run //column stands for how many value for
	 * each test //0th row Object [] [] data = new Object [1] [2];
	 * data[0][0]="khaladkar61@gmail.com"; data[0][1]="Shubh@0906"; return data; }
	 */
}
