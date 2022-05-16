package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert3 {
	@Test
	public void data() {
SoftAssert s  = new SoftAssert();
		String str = "Shubham";

		String str1 = "shubham";

		boolean ref = str1.equals(str);

		Reporter.log("Verification1 is started..", true);

		Assert.assertTrue(ref); // fail

		Reporter.log("Verification2 is started..", true);

		Assert.assertFalse(ref); // pass

		s.assertAll();
	}

	@Test
	public void test() {
		Reporter.log("An Introvert", true);
	}
}
