package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script32 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.naukri.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Set<String> ref = driver.getWindowHandles();

		Thread.sleep(5000);

		System.out.println("count of windows:" + ref.size());

		Thread.sleep(5000);

		Iterator<String> itr = ref.iterator();

		while (itr.hasNext()) {
			String ref1 = itr.next();

			System.out.println(ref1);

		}

		driver.quit();
	}
}
