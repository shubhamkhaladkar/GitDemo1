package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selected 
{
public static void main(String[] args) {
	
	System.out.println("Main method started..");
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver  = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	WebElement rv = driver.findElement(By.xpath("//input[@value='radio1']"));
	
	rv.click();
	
	if (rv.isSelected()) 
	{
	 System.out.println("radio button is selected..");	
	} else {
    System.out.println("radio button is not selected..");
	}
	
	 WebElement ref = driver.findElement(By.xpath("//input[@value='radio2']"));
	 
	 if (ref.isSelected()) 
	 {
		 System.out.println("radio button is selected..");	
	} else {
		 System.out.println("radio button is not selected..");
	}
	 
	 driver.close();
}
}
