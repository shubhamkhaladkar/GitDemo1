package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG13
{
@Test
public void sample1()
{
String str ="Shubham";
String str1 ="shubham";

Assert.assertEquals(str, str1);

Assert.assertNotEquals(str, str1);
}


}
