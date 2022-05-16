package qabyshubham;

import java.io.IOException;

import org.junit.Test;

public class Home1  extends Base
{
 @Test
 public void basescenario() throws IOException
 {
	 Base  b  = new Base();
	 
	b.initiatebrowser();
	
	driver.get("https://www.youtube.com/");
 }
}
