package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select1 
{
  public static void main(String[] args) {
	
	  System.out.println("Main method started..");
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver  = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  WebElement rv = driver.findElement(By.xpath("//select[contains(@id,'dropdown')]"));
	 
	  Select s  = new Select(rv);
	  
	  //s.selectByIndex(2);
	  
	  //s.selectByVisibleText("Option2");
	  
	  s.selectByValue("option1");
	  
	  System.out.println(s.getOptions().get(2).getText());
	  
	  System.out.println(s.getFirstSelectedOption());
	  
	  driver.close();
	  
	  
}
}
