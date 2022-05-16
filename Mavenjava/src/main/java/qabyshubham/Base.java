package qabyshubham;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;

	public void initiatebrowser() throws IOException {
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\khala\\OneDrive\\Desktop\\Automation\\Mavenjava\\src\\main\\java\\qabyshubham\\data1.properties");
		prop.load(fis);
		String name = prop.getProperty("browser");

		if (name == "Firefox") 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (name == "Chrome")
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else 
		{
			System.out.println("select the broswer");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	}
}
