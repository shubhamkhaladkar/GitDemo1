package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe1 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
		
		 WebElement rv = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		 
		 driver.switchTo().frame(rv);
		 
		 driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
		 
		 driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Shubham");
		 
		 System.out.println(driver.findElement(By.xpath("//body[@id='tinymce']")).getText());
		 
		 driver.close();
		 
	}
}
