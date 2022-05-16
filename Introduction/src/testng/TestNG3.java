package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG3 {
	@AfterSuite
	public void samp8() {
		System.out.println("after suite method is running..");
	}

	@Test
	public void samp() {
		System.out.println("testng is running..");
	}

	@BeforeClass

	public void samp1() {
		System.out.println("before classs method is running...");
	}

	@AfterTest

	public void samp2() {
		System.out.println("After test method is running");
	}

	@BeforeMethod

	public void samp3() {
		System.out.println("before method is running..");
	}

	@AfterMethod

	public void samp4() {
		System.out.println("after method is runninng..");
	}

	@AfterClass

	public void samp5() {
		System.out.println("after class method is running..");
	}

	@BeforeTest
	public void samp6() {
		System.out.println("Before test method is running..");
	}

	@BeforeSuite

	public void samp7() {
		System.out.println("Before suite method is running..");
	}

}
