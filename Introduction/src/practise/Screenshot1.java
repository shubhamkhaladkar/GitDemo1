package practise;

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

public class Screenshot1 
{
 @Test
 public void test1()
 {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver  = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://jqueryui.com/droppable/");
	
	TakesScreenshot s  =(TakesScreenshot)driver;
	
	File file = s.getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(file, new File("jquery.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
