package basic;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v97.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileEmulatorTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();

		DevTools dev = chrome.getDevTools();

		dev.createSession();

		// Send coomands to CDP methods - and methods will invoke and get access to
		// chrome dev tools

		dev.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(),
				Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
				Optional.empty(), Optional.empty()));
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.get("https://rahulshettyacademy.com/angularAppdemo/");
		chrome.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		chrome.findElement(By.xpath("//a[text()='Library']")).click();
	}

}
