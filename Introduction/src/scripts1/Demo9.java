package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo9 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ref = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));

		Select s = new Select(ref);

		s.selectByIndex(2);

		String dv = s.getFirstSelectedOption().getText();

		System.out.println(dv);

		s.selectByVisibleText("USD");

		String test = s.getFirstSelectedOption().getText();

		System.out.println(test);

		s.selectByValue("INR");

		String str = s.getFirstSelectedOption().getText();

		System.out.println(str);

		driver.close();

	}
}
