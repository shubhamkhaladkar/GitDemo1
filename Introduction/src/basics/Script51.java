package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script51 
{
 public static void main(String[] args) {
	
	 WebDriverManager.firefoxdriver().setup();
	 
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("");
	 
	 driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a"));
	 
	
 	
	 
	 
	 
}
}
