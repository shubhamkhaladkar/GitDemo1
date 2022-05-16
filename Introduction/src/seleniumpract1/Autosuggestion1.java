package seleniumpract1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion1 
{
  public static void main(String[] args) {
	
	  System.out.println("Main method is running...");
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  	  
	 driver.get("https://www.google.com/");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("live");
	 
	  List<WebElement> rv = driver.findElements(By.xpath("//span[contains(text(),'live')]"));
	  
	  for (int i = 0; i <rv.size(); i++) 
	  {
		System.out.println(rv.get(i).getText());
	}
	
	  System.out.println("The count of auto suggestions are:"+rv.size());
	  
	  rv.get(4).click();
	
	  System.out.println(driver.getTitle());
	  
	  driver.close();
	
	
}
}
