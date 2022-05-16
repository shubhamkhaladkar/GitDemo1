package basic;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v97.network.Network;

import com.google.common.collect.ImmutableList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlockNetWorkRequest {
	public static void main(String[] args) {

		//blocking all images which are present in webpages
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		DevTools devtools = driver.getDevTools();

		devtools.createSession();

		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		devtools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg", "*.css")));
		
		long startime = System.currentTimeMillis();

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");

		driver.findElement(By.xpath("//a[@role='button']")).click();

		driver.findElement(By.xpath("//a[text()='Selenium']")).click();

		driver.findElement(By.cssSelector(".add-to-cart")).click();

		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		
		 long endtime = System.currentTimeMillis();
		 
		 System.out.println(endtime -  startime);
		 
		//457 , 469
	}
}
