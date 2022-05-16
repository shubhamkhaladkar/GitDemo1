package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptions1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("--incognito");
		ch.addArguments("--start-maximixed");
		ch.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();

		driver.get("https://www.yatra.com/");
		
		driver.manage().deleteAllCookies();

	}
}
