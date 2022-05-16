package basic;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v97.network.Network;
import org.openqa.selenium.devtools.v97.network.model.ConnectionType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetWorkSpeed {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		DevTools devtools = driver.getDevTools();

		devtools.createSession();

		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		devtools.send(
		Network.emulateNetworkConditions(false, 3000, 20000, 10000, Optional.of(ConnectionType.ETHERNET)));

		devtools.addListener(Network.loadingFailed(), loadingFailed -> {
			System.out.println(loadingFailed.getErrorText());
			System.out.println(loadingFailed.getTimestamp());
		});
		long starttime = System.currentTimeMillis();

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");

		driver.findElement(By.xpath("//a[@role='button']")).click();

		driver.findElement(By.xpath("//a[text()='Selenium']")).click();

		driver.findElement(By.cssSelector(".add-to-cart")).click();

		System.out.println(driver.findElement(By.cssSelector("p")).getText());

		long endtime = System.currentTimeMillis();

		System.out.println(endtime - starttime);

	}
}
