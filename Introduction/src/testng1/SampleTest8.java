package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest8 {
	@Test
	public void equals() {
		String str1 = "Shubham";

		String str2 = "shubham";

		//Assert.assertEquals(str1, str2);

		Assert.assertNotEquals(str1, str2);
	}
}
