package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alertpopup 
{
 @FindBy(xpath = "//a[text()='JavaScript Alerts']")
 private WebElement javascriptalert;
 
 @FindBy(xpath = "//button[text()='Click for JS Alert']")
 private WebElement alt1;
 
 @FindBy(xpath = "//button[text()='Click for JS Confirm']")
 private WebElement alt2;
 
 @FindBy(xpath = "//button[text()='Click for JS Prompt']")
 private WebElement alt3;
 
 
 WebDriver driver;
 Alert alert;
 public Alertpopup(WebDriver driver)
 {
	this.driver=driver;
	PageFactory.initElements(driver, this);
 }
 
 public void clickonjavaalert()
 {
	 javascriptalert.click();
 }
 
 public void clickonalt1()
 {
	 alt1.click();
	Alert a1 = driver.switchTo().alert();
	System.out.println(a1.getText());
	a1.accept();
 }
 
 public void clickonalt2()
 {
	 alt2.click();
	 Alert a2 = driver.switchTo().alert();
	 System.out.println(a2.getText());
	 a2.dismiss();
 }
 
 public void clickonalt3() throws InterruptedException
 {
	 alt3.click();
	 Alert a3 = driver.switchTo().alert();
	 a3.sendKeys("shubham");
	 System.out.println(a3.getText());
	 Thread.sleep(3000);
	 a3.accept();
 }
}
