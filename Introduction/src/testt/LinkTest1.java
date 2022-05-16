package testt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomt.Link1;

public class LinkTest1 {
	
	@Test
	public void linktest()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt  = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		WebDriver driver  = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		Link1 l1  = new Link1(driver);
		
		l1.sizeofthelinks();
		
		l1.getetxt_1();
		
		driver.close();
		
		
	}

}
