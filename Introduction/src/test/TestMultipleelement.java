package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.MultipleElements;
import practise.MutliBrowser;

public class TestMultipleelement  
{
 @Test
 public void test()
 {
	 WebDriverManager.firefoxdriver().setup();
	 
	 WebDriver driver  = new FirefoxDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("https://www.google.com/");
	 
	 MultipleElements mp  = new MultipleElements(driver);
	 
	 mp.getsizeofelemnts();
	 
	 mp.closebrowser();
 }
 

}
