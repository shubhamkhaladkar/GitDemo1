package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable1 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> getrow = driver.findElements(By.xpath("(//table[@name='courses'])//th"));

		System.out.println("Number of rows in Webtable:" + getrow.size());
		
		System.out.println("------------------");

		List<WebElement> getcolumn = driver.findElements(By.xpath("(//table[@name='courses'])//td"));

		System.out.println("Number of columns present in webtable:" + getcolumn.size());
		
		System.out.println("------------------");

		String getsecondrowtext = driver.findElement(By.xpath("(//table[@name='courses'])//tr[3]")).getText();

		System.out.println("Second row text:" + getsecondrowtext);
		
		System.out.println("------------------");
		
		List<WebElement> column = driver.findElements(By.xpath("(//div[@class='tableFixHead']) //tr"));
		
		System.out.println("Column Size of second webtable:"+column.size());
		
		System.out.println("------------------");
		
		List<WebElement> row = driver.findElements(By.xpath("(//div[@class='tableFixHead']) //th"));
		System.out.println("Row Size of second webtable:"+row.size());
		
		System.out.println("------------------");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,700)");
		
		js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,200)");
		
		 WebElement ninethrow = driver.findElement(By.xpath("(//div[@class='tableFixHead']) //tr[9]"));
		 System.out.println("9th row text:"+ninethrow.getText());
		
		driver.close();
	}
}
