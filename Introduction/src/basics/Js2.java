package basics;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js2 {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/jsref/prop_pushbutton_disabled.asp");

		driver.findElement(By.xpath("//a[contains(@class,'margin-bottom')]")).click();

		Set<String> str = driver.getWindowHandles();

		Iterator<String> itr = str.iterator();

		String parent_window = itr.next();
		String child_window = itr.next();

		driver.switchTo().window(child_window);

		driver.switchTo().frame("iframeResult");

		// driver.findElement(By.xpath("//button[text()='Try it']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement rv = driver.findElement(By.xpath("//button[text()='My Button']"));

		js.executeScript("arguments[0].value='shubham'", rv);

		Thread.sleep(5000);

		System.out.println(driver.getCurrentUrl());
		
		TakesScreenshot s  =(TakesScreenshot)driver;
		 File src = s.getScreenshotAs(OutputType.FILE);
		 
		 FileUtils.copyFile(src, new File("childwindow.png"));

		driver.quit();
	}
}
