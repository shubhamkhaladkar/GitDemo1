package seleniumpract1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_2 {
	public static void main(String[] args) {

		System.out.println("Main method started..");

		WebDriverManager.chromedriver().setup();

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable-notification");

		WebDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();

		driver.get("https://www.yatra.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement rv = driver.findElement(By.xpath("//a[text()='My Account']"));

		Actions a = new Actions(driver);

		a.moveToElement(rv).perform();

		driver.findElement(By.xpath("//a[@id='signInBtn']")).click();

		driver.findElement(By.xpath("//button[contains(@id,'fb')]")).click();

		Set<String> ref = driver.getWindowHandles();

		String parent = driver.getWindowHandle();

		Iterator<String> itr = ref.iterator();

		String parent_refID = itr.next();

		String child_refID = itr.next();
		
		//String sub_child_refID = itr.next();
		
		driver.switchTo().window(child_refID);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(@class,'_42ft')]")).click();

		System.out.println("Window Size are:" + ref.size());

		System.out.println("Ref. IDs:" + ref);

		System.out.println(driver.getTitle());

		//System.out.println("Parent ref-ID:" + parent);
		
		//driver.switchTo().window(sub_child_refID);

		driver.findElement(By.id("email")).sendKeys("Shubham");

		driver.quit();
		
		
	}
}
