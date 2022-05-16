package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown4 {
	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Static.html");
		Thread.sleep(3000);
		WebElement draggable = driver.findElement(By.xpath("//img[@id='angular']"));

		WebElement droppable = driver.findElement(By.xpath("//div[@id='droparea']"));

		Actions a = new Actions(driver);

		// a.dragAndDrop(draggable, droppable).perform();

		a.moveToElement(draggable).perform();
		Thread.sleep(3000);
		a.clickAndHold().perform();
		Thread.sleep(3000);
		a.moveToElement(droppable).perform();
		Thread.sleep(3000);
		a.release().perform();

	}
}
