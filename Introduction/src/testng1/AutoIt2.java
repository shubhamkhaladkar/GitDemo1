package testng1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIt2 
{
 @Test
 public void fielupload() throws IOException
 {
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions opt  = new ChromeOptions();
	
	opt.addArguments("--incognito");
	
	opt.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver(opt);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://smallpdf.com/jpg-to-pdf");
	
	driver.manage().deleteAllCookies();
	

	
	driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
	
	Runtime.getRuntime().exec("C:\\Users\\khala\\OneDrive\\Documents\\Fileupload4.exe");
	
	
 }
}
