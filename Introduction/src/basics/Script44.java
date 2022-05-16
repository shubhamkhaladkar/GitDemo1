package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Script44 {
	private WebElement username;

	private WebElement password;

	private WebElement loginbutton;

	public void xpath(WebDriver driver) {
		username = driver.findElement(By.xpath("//input[@id='email']"));

		password = driver.findElement(By.xpath("//input[@id='pass']"));

		loginbutton = driver.findElement(By.xpath("//button[@name='login']"));

	}
	
	public Script44(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);	
	}

	public void enter_username() {
	username.sendKeys("shubham");
	}

	public void enter_password() {
		password.sendKeys("shubham");
	}

	public void clickonloginbutton() {
		loginbutton.click();
	}

}
