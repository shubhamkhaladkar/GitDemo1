package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender1 {

	public static void main(String[] args) {

		System.out.println("Main method ended..");

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.yatra.com/");
		
		driver.manage().deleteAllCookies();

		driver.findElement(By.xpath("//div[@class='custom-date-container']")).click();

		WebElement rv = driver.findElement(By.xpath("//td[@data-date='30/04/2022']"));

		rv.click();

		System.out.println(rv.getText());

		WebElement ref = driver.findElement(By.xpath("(//label[contains(@class,'calendar-label')]) [2]"));

		ref.click();

		System.out.println(ref.getText());

		driver.close();

	}

}
