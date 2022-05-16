package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authenication1 
{
 public static void main(String[] args) {
	
	 System.out.println("Main method started..");
	 
	 WebDriverManager.chromedriver().setup();
	
	 WebDriver driver  = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://admin:admin@the-internet.herokuapp.com/");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
	 
	 System.out.println(driver.getTitle());
	 
	 System.out.println(driver.getCurrentUrl());
	 
}
}
