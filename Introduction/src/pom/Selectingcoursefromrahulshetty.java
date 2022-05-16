package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Selectingcoursefromrahulshetty {
	@FindBy(xpath = "(//a[contains(@class,'theme')]) [2]")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@id='remember_me']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[contains(@class,'btn-primary')]")
	private WebElement login;
	
	@FindBy(xpath = "(//a[@class='fedora-navbar-link navbar-link']) [2]")
	private WebElement Allcoursesbutton;

	@FindBy(xpath = "(//div[@class='course-listing-title']) [6]")
	private WebElement specificcourse;
	
	WebDriver driver;
	public Selectingcoursefromrahulshetty(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickonloginbutton()
	{
		loginbutton.click();
	}
	
	public void enteremail(String mail)
	{
		email.sendKeys(mail);
	}
	 
	public void enterpass(String word)
	{
		pass.sendKeys(word);
	}
	
	public void clickoncheckbox()
	{
		checkbox.click();
		
	}
	
	public void reclickoncheckbox()
	{
		checkbox.click();
	}
	
	public void verifycheckboxistrue()
	{
		boolean rv = checkbox.isSelected();
		System.out.println(rv);
	}
	
	public void clickonlogin()
	{
		login.click();
	}
	
	public void clickonallcourse()
	{
		Allcoursesbutton.click();
	}
	
	public void getspecifictext()
	{
		Reporter.log(specificcourse.getText(), true);
	}
	
	@AfterClass
	public void closbrowser()
	{
		driver.close();
		
	}

}
