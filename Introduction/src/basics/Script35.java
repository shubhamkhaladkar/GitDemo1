package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script35 
{
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.naukri.com/");
	
	Thread.sleep(6000);
	
	String parent_refid = driver.getWindowHandle();
	
	Set<String> child_refid = driver.getWindowHandles();
	
	Iterator<String> rv = child_refid.iterator();
	
    while(rv.hasNext())
    {
    	String ref = rv.next();
    	
    	if (!child_refid.equals(parent_refid)) 
    	{
			driver.switchTo().window(ref);
			driver.close();
		}
    	
    	else 
    	{
System.out.println("not executed..");
		}
    }
	
	
}
}
