package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG14 {

	@Test
	public void sample2()
	{
		String rv1 ="shubham";
		
		Assert.assertNotNull(rv1);
		
		Assert.assertNull(rv1);
		
		
		
	}
}
