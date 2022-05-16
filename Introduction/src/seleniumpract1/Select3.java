package seleniumpract1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select3 {
	public static void main(String[] args) {

		System.out.println("main method started...");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		WebElement rv = driver.findElement(By.xpath("//select[@id='day']"));

		Select s = new Select(rv);

		System.out.println("Total options present in list box are:" + s.getOptions().size());

		boolean str = s.isMultiple();

		if (str) {
			System.out.println("list box is multi selectable");
		} else {
			System.out.println("List box is not multi selectable");
		}
    driver.close();
	}
}
