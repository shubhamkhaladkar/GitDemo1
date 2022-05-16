package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fontsize {
	public static void main(String[] args) {

		System.out.println("Main method started..");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement rv = driver.findElement(By.xpath("//label[@for='radio1']"));

		System.out.println(rv.getCssValue("font-size"));

		System.out.println(rv.getCssValue("background-color"));

		String ref = rv.getCssValue("background-color");

		String rv1 = Color.fromString(ref).asHex();
		System.out.println(rv1);

		String rv2 = Color.fromString(ref).asRgb();

		System.out.println(rv2);

	}
}
