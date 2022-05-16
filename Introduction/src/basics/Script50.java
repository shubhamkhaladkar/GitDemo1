package basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script50 {
	public static void main(String[] args) throws IOException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.transfernow.net/en");

		driver.findElement(By.xpath("//span[@class='custo__line1 uploader_line__3jaUg uploader_line1__2oP4D']"))
				.click();

		Runtime.getRuntime().exec("C:\\Users\\khala\\OneDrive\\Documents\\fileupload2.exe");
	}
}
