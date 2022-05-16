package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox3 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/jar%20files%20and%20exe%20files/Psse17/Html/List1.html");

		WebElement rv = driver.findElement(By.xpath("//select[@id='subjects']"));

		Select s = new Select(rv);

		List<WebElement> ref = s.getOptions();

		System.out.println(ref.size());
		for (int i = 0; i < ref.size(); i++) {
			ref.get(i).click();
			Thread.sleep(1000);
		}

		System.out.println("---------------------");
		List<WebElement> sel = s.getAllSelectedOptions();
		for (int i = 0; i < sel.size(); i++) {
			String str1 = sel.get(i).getText();
			System.out.println(str1);
		}

		System.out.println(s.getFirstSelectedOption());

		Thread.sleep(1000);

		s.deselectAll();

		Thread.sleep(1000);

		driver.close();
	}
}
