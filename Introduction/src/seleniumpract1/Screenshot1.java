package seleniumpract1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 
{
 public static void main(String[] args) throws IOException {
	
	 System.out.println("Main method started..");
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver  = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	 
	 TakesScreenshot s  = (TakesScreenshot) driver;
	 
	 File file = s.getScreenshotAs(OutputType.FILE);
	 
	 FileUtils.copyFile(file, new File("double.png"));
}
}
