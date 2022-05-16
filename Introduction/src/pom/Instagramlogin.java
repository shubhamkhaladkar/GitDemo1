package pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Instagramlogin {
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//*[contains(@class,'L3NKy   ')]")
	private WebElement loginbutton;

	@FindBy(xpath = "//*[contains(text(),'again')]")
	private WebElement errormessage;
	
	String str="The username you entered doesn't belong to an account. Please check your username and try again.";

	WebDriver driver;

	public Instagramlogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterusername(String mobilenumber) {
		username.sendKeys(mobilenumber);
	}

	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickonloginbuttonn() {
		loginbutton.click();
	}

	@Test
	public void errormessagemethod() {
    String rv = errormessage.getText();
  Assert.assertEquals(rv, str);
  
	}

	@AfterClass
	public void closbrowser() {
		driver.close();
	}

}
