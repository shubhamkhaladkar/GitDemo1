package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG15 {
	@Test
	public void sample3()
	{
	String ref1 ="Samba";
	String ref2 ="Dinga";
	boolean dev = ref1.contains(ref2);
	Assert.assertFalse(dev, "True");
	
	}

}
