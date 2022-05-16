package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait1 {
	public static void main(String[] args) {

		System.out.println("Main method started..");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		 wait.until(ExpectedConditions.alertIsPresent());
		 
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		 
		 driver.close();
		

	}
}
