package basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script23
{
 public static void main(String[] args) throws IOException {
	
	 WebDriverManager.firefoxdriver().setup();
	 
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("https://www.flipkart.com/");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	TakesScreenshot s =  (TakesScreenshot) driver;
	
	File src = s.getScreenshotAs(OutputType.FILE);
	
	String img_loc ="..C:\\Users\\khala\\OneDrive\\Desktop\\seleniumscreenshot";
	
	File dest = new File(img_loc+"img.png");
	
	FileUtils.copyDirectory(src, dest);
}
}
