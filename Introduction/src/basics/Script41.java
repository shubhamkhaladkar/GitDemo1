package basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script41 {
	public static void main(String[] args) throws IOException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		WebElement str = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(str);

		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions a = new Actions(driver);

		a.dragAndDrop(draggable, droppable).perform();

		TakesScreenshot s = (TakesScreenshot) driver;

		File file = s.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("Draggable.png"));

		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//a[text()='Demos']")).click();

		System.out.println(driver.getTitle());

	}
}
