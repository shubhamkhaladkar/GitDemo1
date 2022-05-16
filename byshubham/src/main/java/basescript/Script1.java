package basescript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script1 {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initiatebrowser() throws IOException {
		 prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\khala\\OneDrive\\Desktop\\Automation\\byshubham\\src\\main\\java\\basescript\\brow.properties");
		prop.load(fis);
		
		String name = prop.getProperty("browser");
		String link = prop.getProperty("url");
		System.out.println(name);
		System.out.println(link);

		if (name.equals("Firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (name.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else 
		{
			System.out.println("select the broswer");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}
