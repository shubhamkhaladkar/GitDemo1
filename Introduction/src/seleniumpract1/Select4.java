package seleniumpract1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select4 {
	public static void main(String[] args) {

		System.out.println("Main method started..");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		WebElement rv = driver.findElement(By.xpath("//select[@id='month']"));

		Select s = new Select(rv);

		List<WebElement> ref = s.getOptions();
		System.out.println("Before sorting..");
		for (int i = 0; i < ref.size(); i++) {
			System.out.println(ref.get(i).getText());
		}

		ArrayList a1 = new ArrayList<>();

		for (int i = 0; i < ref.size(); i++) {
			String dv = ref.get(i).getText();

			a1.add(dv);
		}

		Collections.sort(a1);
		System.out.println("After sorting...");
		System.out.println(a1);
		driver.close();

		System.out.println("Main method ended..");
	}
}
