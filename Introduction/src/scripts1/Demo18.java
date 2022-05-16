package scripts1;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo18 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).isSelected();

		/*
		 * driver.findElement(By.xpath(
		 * "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.
		 * xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value= 'PNQ']"
		 * )) .click();
		 * 
		 * driver.findElement(By.
		 * xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']"
		 * )) .click();
		 * 
		 * // driver.findElement(By.xpath("//a[@class='ui-state-default
		 * ui-state-highlight // ui-state-active']")).click();
		 * 
		 * if
		 * (driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).
		 * getAttribute("style") .contains("0.5")) { System.out.println("is enabled"); }
		 * else
		 * 
		 * { System.out.println("is disbaled"); }
		 */

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		Thread.sleep(2000);

		for (int i = 1; i < 2; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			i++;
		}

		for (int i = 1; i < 2; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
			i++;
		}

		for (int i = 1; i < 3; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
			i++;
		}

		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

		WebElement rv = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));

		Select s = new Select(rv);

		s.selectByIndex(2);

		Thread.sleep(2000);

		String str = s.getFirstSelectedOption().getText();

		System.out.println(str);

		WebElement rv1 = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));

		rv1.click();

		if (rv1.isSelected()) {
			System.out.println("checked");
		}

		else {
			System.out.println("uncheked");
		}
 
		Thread.sleep(2000);

		rv1.click();

		if (rv1.isSelected()) {
			System.out.println("checked");
		}

		else {
			System.out.println("uncheked");
		}
		driver.close();
	}
}
