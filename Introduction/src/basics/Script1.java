package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script1 {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		String rv = driver.getTitle();
		
		String str = "XPath & cssSelector Practice Page with all scenarios – SelectorsHub";
		
		if (str.equals(rv))
		{
		  System.out.println("page is displayed");	
		} 
		else
		{
    System.out.println("Page is not displayed");
		}

	}
}
