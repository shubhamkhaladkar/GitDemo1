package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountOfLink 
{
  @FindBy(xpath = "//a")
  private List<WebElement> links;
  
 public CountOfLink(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public int getthecount()
 {
	 return links.size();
 }
  
}
