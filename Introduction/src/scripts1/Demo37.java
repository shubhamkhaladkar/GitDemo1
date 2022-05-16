package scripts1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo37 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		
		Thread.sleep(2000);

		Set<String> str = driver.getWindowHandles();

		Iterator<String> it = str.iterator();

		String Parentid = it.next();
		
		String childId =  it.next();

		driver.switchTo().window(childId);
		/*System.out.println(driver.getTitle());*/
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> rv = driver.findElements(By.xpath("//tr/td[1]"));
		
		/*for (int i = 0; i <rv.size(); i++) 
		{
			System.out.println(rv.get(i).getText());
		}

		driver.quit();*/
		//collect all values from the webtable
		List<String> dem = rv.stream().map(s-> s.getText()).collect(Collectors.toList());
		System.out.println(dem);
		//sorted collected all value from the vaule
		List<String> test = dem.stream().sorted().collect(Collectors.toList());	
		System.out.println(test);
		//compared both collected and sorted values
		
		Assert.assertTrue(dem.equals(test));
		
		
		//scan the name column with gettext -> Beans -> print the price of the Beans
		
		
		
		driver.quit();
		
		
		

	}
}
