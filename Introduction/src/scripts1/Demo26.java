package scripts1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo26 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Set<String> str = driver.getWindowHandles();

		Iterator<String> it = str.iterator();

		String parentid = it.next();

		String childID = it.next();

		driver.switchTo().window(childID);

		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());

		driver.switchTo().window(parentid);

		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		
		driver.close();

	}
}
