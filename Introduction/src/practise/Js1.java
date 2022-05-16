package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js1
{
@Test
public void test()
{
WebDriverManager.firefoxdriver().setup();
WebDriver driver  = new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://www.facebook.com/");

JavascriptExecutor js  =(JavascriptExecutor) driver;

js.executeScript("document.getElementById('email')".valueOf("as@gmail.com"));

js.executeScript("document.getElementById('passContainer')".valueOf("shubha"));

WebElement rv = driver.findElement(By.xpath("//button[@name='login']"));

js.executeScript("arguments[0].click()", rv);




}
}
