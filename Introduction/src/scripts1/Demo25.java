package scripts1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class Demo25 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();

		Set<String> str = driver.getWindowHandles();

		Iterator<String> it = str.iterator();

		String parentid = it.next();

		String childid = it.next();

		driver.switchTo().window(childid);
		
		String rv = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(rv);
		
		Thread.sleep(6000);
		
		driver.switchTo().window(parentid);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rv);
		
		
		
	

	}
}
