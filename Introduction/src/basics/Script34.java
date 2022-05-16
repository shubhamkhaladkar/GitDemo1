package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script34
{
  public static void main(String[] args) {
	
	  WebDriverManager.firefoxdriver().setup();
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://www.naukri.com/");
	  
	  driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	  
	Set<String> rv = driver.getWindowHandles();
	
	System.out.println(rv.size());
	
	Iterator<String> itr = rv.iterator();
	
	while (itr.hasNext()) {
		String str =  itr.next();
		
		driver.switchTo().window(str);
		
		driver.close();
		
	}
}
}
