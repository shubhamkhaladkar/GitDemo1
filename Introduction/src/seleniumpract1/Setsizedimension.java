package seleniumpract1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setsizedimension 
{
public static void main(String[] args) {
	
	System.out.println("Main method started..");
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.manage().window().setSize(new Dimension(455, 358));
	driver.manage().window().setPosition(new Point(100, 200));
	driver.close();
	System.out.println("Main method ended..");
	
}
}
