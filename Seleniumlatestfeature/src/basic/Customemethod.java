package basic;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Customemethod {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		DevTools devtools = driver.getDevTools();

		devtools.createSession();

		HashMap hs = new HashMap<>();
		hs.put("width", 600);
		hs.put("height", 1000);
		hs.put("deviceScalerFactor", 50);
		hs.put("mobile", true);

		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", hs);

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Library']")).click();

	}
}
