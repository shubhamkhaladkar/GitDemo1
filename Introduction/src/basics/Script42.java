package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script42 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();

		driver.findElement(By.xpath("//div[@id='hc']")).click();

		WebElement srt = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));

		driver.switchTo().frame(srt);

		String str = "9960216387";

		driver.findElement(By.xpath("//input[@class='IP']")).sendKeys(str);

		Thread.sleep(3000);

		driver.quit();
	}
}
