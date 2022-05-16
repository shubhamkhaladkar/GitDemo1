package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CrateFBAccount 
{
 @FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
 private WebElement createbutton;
 
 @FindBy(xpath = "//input[@name='firstname']")
 private WebElement firstname;
 
 @FindBy(xpath = "//input[@name='lastname']")
 private WebElement lastname;
 
 @FindBy(xpath = "//input[@name='reg_email__']")
 private WebElement mobilenumer;
 
 @FindBy(xpath = "//input[@id='password_step_input']")
 private WebElement password;
 
 @FindBy(xpath = "//select[@id='day']")
 private WebElement date;
 
 @FindBy(xpath = "//select[@id='month']")
 private WebElement month;
 
 @FindBy(xpath = "//select[@id='year']")
 private WebElement  year;
 
 
 @FindBy(xpath = "//label[text()='Male']")
 private WebElement genderradiobutton;
 
 @FindBy(xpath = "//button[@name='websubmit']")
 private WebElement signupbutton;
 

 public CrateFBAccount(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
	
 }
 
 public void clickoncreatebutton()
 {
	 createbutton.click();
 }
 
 public void entervaluefirstname(String user)
 {
	 firstname.sendKeys(user);
 }
 
 public void entervaluelastname(String pass)
 {
	 lastname.sendKeys(pass);
 }
 
 public void entervaluemobilenumber(String mob)
 {
	 mobilenumer.sendKeys(mob);
 }
 
 public void entervaluepasswor(String hardcoded)
 {
	 password.sendKeys(hardcoded);
 }
 
 public void selectdate()
 {
	 Select s  = new Select(date);
	 s.selectByIndex(8);
 }
 
 public void selectmonth()
 {
	 Select s1  = new Select(month);
	 s1.selectByIndex(5);
 }
 
 public void selectyear()
 {
	 Select s2 = new Select(year);
	 
	 s2.selectByValue("1998");
	
 }
 
 public void clickongender()
 {
	 genderradiobutton.click();
 }
 
 public void clickonsignup()
 {
	 signupbutton.click();
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
