package testng;

import org.testng.annotations.Test;

public class TestNG4 {
	@Test
	public void sam1() {
		System.out.println("Sam1 method is running...");
	}

	@Test

	public void sam2() {
		System.out.println("Sam2 method is running..");
	}

	@Test(dependsOnMethods = {"sam1"})
	public void sam3() {
		System.out.println("Sam3 method is running..");
	}
}
