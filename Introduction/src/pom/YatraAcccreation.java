package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YatraAcccreation {
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myacc;

	@FindBy(xpath = "//a[@id='SignUpBtn']")
	private WebElement signupbutton;

	@FindBy(xpath = "//input[@id='login-input']")
	private WebElement mobilenumber;

	@FindBy(xpath = "//button[@id='login-continue-btn']")
	private WebElement continuebutton;
	
	@FindBy(xpath = "//p[@id='login-error']")
	private WebElement errormessage;

	WebDriver driver;

	public YatraAcccreation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void movetomyaccountbutton() {
		Actions a = new Actions(driver);
		a.moveToElement(myacc).perform();
	}

	public void clickonsignupbutton() {
		signupbutton.click();
	}

	public void entermobilenumber() {
		mobilenumber.sendKeys("99602163");
	}

	public void clickoncontinuebutton() {
		continuebutton.click();
	}
	
	public boolean errormessagedisplaying()
	{
		boolean rv = errormessage.isDisplayed();
		return rv;
	}
	
	

}
