package scripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo23 
{
 public static void main(String[] args) {
	
	 WebDriverManager.firefoxdriver().setup();
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
	 
	 WebDriverWait wait = new WebDriverWait(driver, 5);
	 
	 driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
	 
	 
	 //driver.findElement(By.xpath("//div[@id='results']"));
	 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
	 
	 driver.close();
	 
	 
}
}
