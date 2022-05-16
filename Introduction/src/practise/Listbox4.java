package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox4 {
	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///C:/jar%20files%20and%20exe%20files/Psse17/Html/List1.html");

		WebElement rv = driver.findElement(By.xpath("//select[@id='subjects']"));

		String str1 = "Testing";
		Select s = new Select(rv);

		List<WebElement> ref = s.getOptions();

		for (int i = 0; i < ref.size(); i++) {
			String str2 = ref.get(i).getText();
			if (str2.contains(str1)) {
				ref.get(i).click();
				Thread.sleep(1000);

			}
		}

		List<WebElement> str = s.getAllSelectedOptions();

		for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i).getText());
		}

		driver.close();

	}
}
