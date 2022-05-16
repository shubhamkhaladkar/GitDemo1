package scripts1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo20 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.cleartrip.com/");

		driver.findElement(By.xpath("//button[@style='min-width: 185px;']")).click();

		driver.findElement(By.xpath("//div[text()='3']")).click();

		System.out.println(driver.findElement(By.xpath("//button[@style='min-width: 185px;']")).getText());

		WebElement rv = driver
				.findElement(By.xpath("//div[@class='mb-4'] //select[@class='bc-neutral-100 bg-transparent']"));

		Select s = new Select(rv);

		s.selectByIndex(4);

		System.out.println(s.getFirstSelectedOption().getText());

		driver.findElement(By.xpath("//strong[@class='pr-1']")).click();

		driver.close();
	}

}
