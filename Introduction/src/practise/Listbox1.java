package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement ref = driver.findElement(By.xpath("//select[contains(@id,'dropdown')]"));
		
		ref.click();
		
		Select s  = new Select(ref);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		//System.out.println(driver.findElement(By.xpath("//select[contains(@id,'dropdown')]")).getText());
		
		System.out.println(s.isMultiple());
		
		//s.deselectByIndex(2);
		
		System.out.println("Totla values present in select class:"+ s.getOptions().size());
		
		System.out.println(s.getOptions().get(0).getText());
		Thread.sleep(2000);
		
		driver.close();
	}
}
