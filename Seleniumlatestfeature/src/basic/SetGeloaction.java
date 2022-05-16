package basic;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v97.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetGeloaction {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		DevTools dev = driver.getDevTools();

		dev.createSession();

		Map<String, Object> h1 = new HashMap<>();
		h1.put("latitude", 40);
		h1.put("longitude", 3);
		h1.put("accuracy", 1);

		driver.executeCdpCommand("Emulation.setGeolocationOverride", h1);

		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Netflix", Keys.ENTER);

		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();

		System.out.println(driver.findElement(By.cssSelector(".our-story-card-title")).getText());

		driver.close();
	}
}
