package basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script48 {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://document.online-convert.com/convert/txt-to-pdf");

		driver.findElement(By.xpath(
				"//button[@class='btn btn-white font-size-125 font-weight-bold text-nowrap vue-uploadbox-file-button']"))
				.click();

		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\khala\\OneDrive\\Documents\\fileupload1.exe");

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@title='Info (6).txt']")));
		driver.findElement(By.xpath("//strong[text()='Start']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-large btn-download']")));

		driver.findElement(By.xpath("//a[@class='btn btn-large btn-download']")).click();
		
		
	}
}
