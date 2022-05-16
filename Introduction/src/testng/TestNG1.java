package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	
	@AfterSuite
	public String afsuite() {
		String str = "Afsuite method is running..";

		return str;
	}

	@BeforeSuite
	public void bfsuite() {
		System.out.println("Bfsuite method is running..");
	}

	@Test
	public void samp1() {
		System.out.println("Samp1 method is running..");
	}

	@Test
	public void samp2() {
		System.out.println("Samp2 method is running..");
	}

	@BeforeTest
	public void samp3() {
		System.out.println("Before test method is running...");

	}

	@AfterTest

	public void samp4() {
		System.out.println("After test method is running..");
	}
}
