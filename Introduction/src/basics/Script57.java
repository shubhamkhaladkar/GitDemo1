package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script57 
{
  public static void main(String[] args) throws InterruptedException {
	
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("https://www.naukri.com/");
	  
	  Thread.sleep(7000);
	  
	  Set<String> str = driver.getWindowHandles();
	  
	  System.out.println(str);
	  
	Iterator<String> itr = str.iterator();
	
	while(itr.hasNext())
	{
		String rv = itr.next();
		driver.switchTo().window(rv);
		driver.close();
	}
	  
	  
}
}
