package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate 
{
 public static void main(String[] args) {
	
	 System.out.println("Main method started..");
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver  = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.youtube.com/");
	 driver.get("https://www.facebook.com/");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 System.out.println(driver.getTitle());
	 driver.close();
	 System.out.println("Main method ended..");
}
}
