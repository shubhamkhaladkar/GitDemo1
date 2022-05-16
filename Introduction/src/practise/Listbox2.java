package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox2
//sorting string in alphabetical order -important
{
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button']) [2]")).click(); // clicked on create account button

		WebElement rv = driver.findElement(By.xpath("//select[@id='month']"));
		rv.click();
		Select s = new Select(rv);

		List<WebElement> dev = s.getOptions();

		System.out.println(s.getOptions().get(1).getText());

		ArrayList a1 = new ArrayList<>();

		for (int i = 0; i < dev.size(); i++) {
			String str = dev.get(i).getText();

			a1.add(str);
		}
		Collections.sort(a1);

		System.out.println(a1);
		
		driver.close();
	}
}
