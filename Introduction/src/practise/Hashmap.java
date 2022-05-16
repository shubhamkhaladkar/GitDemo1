package practise;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hashmap 
{
  public static HashMap<String, String> setcredentials()
  {
	  HashMap<String, String> h1  = new HashMap<>();
	  
	  h1.put("Admin", "Shubham:shubham123");
	  h1.put("user", "shubham:shubham1323");
	  return h1;
  }
  
  public static void main(String[] args) {
	
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver  = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com/");
	  
	   HashMap<String, String> rv = Hashmap.setcredentials();
	 String str1 = rv.get("user");
	 
	 String[] ref = str1.split(":");
	 
	String username = ref[0];
	String password = ref[1];
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
	
	
	
	   
}
}
