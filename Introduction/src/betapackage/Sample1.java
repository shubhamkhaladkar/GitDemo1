package betapackage;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import alphapackage.Demo1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 
{
	 private static Logger log  = LogManager.getLogger(Demo1.class.getName());
  public static void main(String[] args) {
	
	  System.out.println("Main method is started..");
	 
	  
	  log.debug("I am debugging");
	   if(5>4)
    {
 	  log.debug(" condition is true"); 
 	  log.error("Error message");
    }
	   else 
	   {
		   log.fatal("this is fatal");
	   }
	   
	WebDriverManager.firefoxdriver().setup();
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}
