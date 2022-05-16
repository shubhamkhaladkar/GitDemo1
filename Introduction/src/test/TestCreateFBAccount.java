package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.CrateFBAccount;

public class TestCreateFBAccount 
{
	public static void main(String[] args) throws IOException 
	{
	  WebDriverManager.firefoxdriver().setup();
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("https://www.facebook.com/");
	  
	  CrateFBAccount cf = new CrateFBAccount(driver);
	  
	  
	  cf.clickoncreatebutton();
	  cf.entervaluefirstname("Shubham");
	  cf.entervaluelastname("khaladkar");
	  cf.entervaluemobilenumber("1234567890");
	  cf.entervaluepasswor("shubha@1234");
	  cf.selectdate();
	  cf.selectmonth();
	  cf.selectyear();
	  cf.clickongender();
	  cf.clickonsignup();
	  
	  TakesScreenshot s = (TakesScreenshot)driver;
    File file = s.getScreenshotAs(OutputType.FILE);
    
    FileUtils.copyFile(file,new File("facebook.png"));
	  
	  driver.close();
	 
	}

	
  
}
