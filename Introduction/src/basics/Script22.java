package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script22 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[@id='Accepted Elements']")).click();
		
		WebElement rv = driver.findElement(By.id("draggable"));
		
		WebElement ref = driver.findElement(By.id("droppable"));
		
		Actions a  = new Actions(driver);
		
		//a.dragAndDrop(rv, ref).perform();
		
		a.moveToElement(rv).clickAndHold().perform();
		
		a.moveToElement(ref).release().perform();
		
		
		
	
	}
}
