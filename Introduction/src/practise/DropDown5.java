package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.functions.Action;

public class DropDown5 {
	@Test
	public void test1() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(2);
		 WebElement dragable = driver.findElement(By.xpath("//div[@id='draggable']"));
		 
		 WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		 
		 Actions  a  = new Actions(driver);
		 
		 a.dragAndDrop(dragable, droppable).perform();
		 
		 

	}
}
