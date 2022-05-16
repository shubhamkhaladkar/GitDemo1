package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo27 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement str = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(str);

		WebElement rv1 = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement rv2 = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions a = new Actions(driver);

		a.dragAndDrop(rv1, rv2).perform();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	}
}
