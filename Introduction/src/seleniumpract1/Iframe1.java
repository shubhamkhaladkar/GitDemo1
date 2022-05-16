package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe1 {
	public static void main(String[] args) {

		System.out.println("Main method started...");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Frames']")).click();

		driver.findElement(By.xpath("//a[text()='iFrame']")).click();

		WebElement rv = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));

		driver.switchTo().frame(rv);

		WebElement ref = driver.findElement(By.xpath("//body[@id='tinymce']"));

		ref.clear();

		ref.sendKeys("Shubham");
		
		System.out.println(ref.getText());
	}
}
