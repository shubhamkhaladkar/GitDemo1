package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.reporters.jq.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutliBrowser
{
	public static WebDriver driver;
 public static void selectbrowser(String browsername)
 {
	 if (browsername.equals("Firefox")) 
	 {
	WebDriverManager.firefoxdriver().setup();
	 driver = new FirefoxDriver();
	 
	} 
	 else if(browsername.equals("Chrome"))
	{
	 WebDriverManager.chromedriver().setup();
	 driver  = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	}
	 else 
	 {
		WebDriverManager.edgedriver().setup();
	 driver = new EdgeDriver();
	
	 }
	 

 }
  public static void main (String [] args)
  {
	  MutliBrowser.selectbrowser("Chrome");
	  driver.get("https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html");
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.close();
  }
 
 
 
 
 
}
