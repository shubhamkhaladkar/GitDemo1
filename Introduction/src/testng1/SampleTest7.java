package testng1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class SampleTest7  
{
	@Parameters({"username" ,"password"})
	@Test
 public void login(String username, String password)
 {
	 System.out.println(username);
	 System.out.println(password);
 }
}
