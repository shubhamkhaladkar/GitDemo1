package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG17 {

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class method is running..");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after class method is running..");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("before test method is running..");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("after test method is running..");
	}

	@Test
	public void sample1() {
		System.out.println("sample1 method is running..");
	}

	@Test
	public void sample2() {
		System.out.println("Sample2 method is running..");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method is running..");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After method is running..");
	}
	
	@Test
	public void sample3()
	{
		System.out.println("Sample3 method is running..");
	}
}
