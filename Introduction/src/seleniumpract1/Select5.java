package seleniumpract1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select5 {
	public static void main(String[] args) {

		System.out.println("Main  method started..");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/jar%20files%20and%20exe%20files/Psse17/Html/List1.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement rv = driver.findElement(By.xpath("//select[@id='subjects']"));

		Select s = new Select(rv);

		List<WebElement> opt = s.getOptions();

		String str = "Testing";

		int count = 0;

		for (int i = 0; i < opt.size(); i++) {
			String ref = opt.get(i).getText();

			if (ref.contains(str)) {
                System.out.println(ref);
                count++;
			}

			else {

			}
		}
		driver.close();
	}
}
