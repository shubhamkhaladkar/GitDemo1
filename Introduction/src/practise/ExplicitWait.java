package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait
{
  public static void main(String[] args) {
	
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver  = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://the-internet.herokuapp.com/iframe");
	  
	  WebDriverWait wait  = new WebDriverWait(driver, 5);
	  
	  wait.until(ExpectedConditions.alertIsPresent());
	  
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("mce_0_ifr")));
	  
}
}
