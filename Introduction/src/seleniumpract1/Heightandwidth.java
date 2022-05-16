package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Heightandwidth {
	public static void main(String[] args) {

		System.out.println("Main method ended..");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		WebElement rv = driver.findElement(By.xpath("//input[@name='pass']"));

		System.out.println("Element Height:" + rv.getSize().getHeight());

		System.out.println("Element width:" + rv.getSize().getWidth());
		
		System.out.println("Element x position:"+rv.getRect().getX());
		
		System.out.println("Element y postion:"+rv.getRect().getY());
		
		driver.close();
	}
}
