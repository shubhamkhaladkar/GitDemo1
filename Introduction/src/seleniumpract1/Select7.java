package seleniumpract1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select7 
{
 public static void main(String[] args) throws InterruptedException {
	
	 System.out.println("Main method started..");
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver  = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("file:///C:/jar%20files%20and%20exe%20files/Psse17/Html/List1.html");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	  WebElement rv = driver.findElement(By.xpath("//select[@id='subjects']"));
	  
	  Select  s  = new Select(rv);
	  
	  
	  List<WebElement> ref = s.getOptions();
	  
	  for (int i = 0; i <ref.size(); i++) 
	  {
		 ref.get(i).click();
		 Thread.sleep(1000);
	}
	  
	  s.deselectAll();
	  
	  Thread.sleep(1000);
	  
	  driver.close();
	  
	  
	  
}
}
