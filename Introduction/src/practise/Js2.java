package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js2
{
@Test
public void test()
{
WebDriverManager.firefoxdriver().setup();
WebDriver driver  = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("file:///C:/jar%20files%20and%20exe%20files/Psse17/Html/Enabled.html");

 WebElement rv = driver.findElement(By.xpath("//input[@id='user']"));
 
 
JavascriptExecutor js  =(JavascriptExecutor) driver;

js.executeScript("arguments[0].value=' '", rv);
 
}
}
