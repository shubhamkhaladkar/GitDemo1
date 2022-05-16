package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG8 
{
 @Test(priority=0)
 public void createaccount()
 {
	 Reporter.log("create account method is running..");
 }
 @Test(priority = 1)
 public void login()
 {
	 Reporter.log("login method is running..");
 }
 
 @Test(priority = 2)
 public void changepassword()
 {
	 Reporter.log("change password method is running..");
 }
 
 @Test(priority = 3)
 public void logout()
 {
	 Reporter.log("logount method is running..");
 }
 @Test(priority = -1)
 public void sendingrequest()
 {
	 Reporter.log("sending request method is running..");
 }
 @Test
 public void commentingonpost()
 {
	Reporter.log("commenting on post method is running.."); 
 }
}
