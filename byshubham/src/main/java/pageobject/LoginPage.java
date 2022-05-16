package pageobject;

import org.apache.logging.log4j.*;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;



public class LoginPage 
{
	private static Logger log  = LogManager.getLogger(LoginPage.class.getName());
   @FindBy(xpath = "//input[@id='email']")
   private WebElement email;
   
   @FindBy(xpath = "//input[@id='password']")
   private WebElement password;
   
   @FindBy(xpath = "//input[@name='commit']")
   private WebElement loginbutton;
   
   @FindBy(xpath = "//span[@class='navbar-current-user']")
   private WebElement title;
   
   public LoginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void enteremail(String str)
   {
	   email.sendKeys(str);
   }
   
   
   public void enterpass(String str1)
   {
	   password.sendKeys(str1);
   }
   
   public void clickonloginbutton()
   {
	   loginbutton.click();
   }
   
   public void fetchtitle()
   {
	  System.out.println(title.getText()); 
   }
   
   public void asser()
   {
	   String expected_title ="Shubham Sambhaji Khaladkar";
	   Assert.assertEquals(title.getText(), expected_title);
   }
   
  
  
   
   
   
}
