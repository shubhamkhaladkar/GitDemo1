package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Isdisplayed 
{
 public static void main(String[] args) {
	
	 System.out.println("main method is started..");
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver  = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("https://www.facebook.com/");
	 
	 String str = driver.getTitle();
	 
	 String str1 ="Facebook – log in or sign up";
	 
	 System.out.println(str);
	 
	 if(str.equals(str1))
	 {
		 System.out.println("Webpage is displayed");
	 }
	 
	 driver.close();
	 
}
}
