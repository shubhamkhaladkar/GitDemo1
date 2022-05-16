package seleniumpract1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_1 {
	public static void main(String[] args) {

		System.out.println("Main method started..");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.naukri.com");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> rv = driver.getWindowHandles();
		
		System.out.println("Size of windows are:"+rv.size());
		
		System.out.println("ref ID of window:"+rv);
		
		
	}
}
