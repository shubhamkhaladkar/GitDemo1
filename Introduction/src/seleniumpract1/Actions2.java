package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions2 
{
 public static void main(String[] args) {
	
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver  = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']")); 
	 
	 WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
	 
	 Actions a = new Actions(driver);
	 
	 a.moveToElement(draggable).perform();
	 a.clickAndHold().perform();
	 a.moveToElement(droppable).perform();
	 a.release();
	 
	// a.dragAndDrop(draggable, droppable).perform();
	 

	 
}
}
