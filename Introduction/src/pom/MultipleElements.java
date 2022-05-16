package pom;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class MultipleElements 
{
 @FindBy(xpath = "//a")
 private List<WebElement> elements;
 
 WebDriver driver;
 public MultipleElements (WebDriver driver)
 {
	PageFactory.initElements(driver, this);
	this.driver=driver;
 }
 
 public void getsizeofelemnts()
 {
	System.out.println("Size of links are:"+elements.size());
 }
 
 @AfterMethod
 public void closebrowser()
 {
	 driver.close();
 }
}
