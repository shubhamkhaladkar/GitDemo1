package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script19 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		WebElement str = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select  s = new Select(str);
		
		List<WebElement> rv = s.getOptions();
		
		System.out.println(rv.size());	
		
		for (int i = 0; i <rv.size(); i++)
		{
			System.out.println(rv.get(i).getText());
			
		}
		
		driver.close();
		

	}
}
