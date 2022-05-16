package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Automatingpage {
	@FindBy(xpath = "(//input[@class='radioButton'])[1]")
	private WebElement radiobutton;

	@FindBy(xpath = "//input[@id='autocomplete']")
	private WebElement suggestion;

	@FindBy(xpath = "//select[@id='dropdown-class-example']")
	private WebElement selectvalue;

	@FindBy(xpath = "//input[@id='checkBoxOption3']")
	private WebElement checkbox;

	@FindBy(xpath = "//button[@id='openwindow']")
	private WebElement window;

	@FindBy(xpath = "//a[@id='opentab']")
	private WebElement tab;

	@FindBy(xpath = "(//div[@class='upper-box'])[10]")
	private WebElement thrirdrow;

	@FindBy(xpath = "//input[@id='name']")
	private WebElement name;

	@FindBy(xpath = "//input[@id='alertbtn']")
	private WebElement alertbutton;

	@FindBy(xpath = "(//table[@id='product']) //tr[4]")
	private WebElement coursename;

	@FindBy(xpath = "(//div[@class='tableFixHead']) //tr[8]")
	private WebElement anothertext;

	@FindBy(xpath = "//button[@id='mousehover']")
	private WebElement mouseover;

	@FindBy(xpath = "//a[text()='Reload']")
	private WebElement reloadpage;

	@FindBy(xpath = "//iframe[@id='courses-iframe']")
	private WebElement numberframe;
	
	@FindBy(xpath = "//a[text()='Blog']")
	private WebElement blog;

	WebDriver driver;

	Alert a;

	public Automatingpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonradiobutton() {
		radiobutton.click();
	}

	public void autosuggestion() {
		suggestion.sendKeys("Ind");
		suggestion.sendKeys(Keys.ARROW_DOWN);
		suggestion.sendKeys(Keys.ARROW_DOWN);
		suggestion.sendKeys(Keys.ARROW_DOWN);
		suggestion.sendKeys(Keys.ENTER);

	}

	public void staticdropdown() {
		selectvalue.click();

		Select s = new Select(selectvalue);
		s.selectByValue("option1");
		System.out.println(s.getFirstSelectedOption().getText());
	}

	public void selectcheckbox() {
		checkbox.click();
	}

	public void clickonwindowbutton() {
		window.click();
		Set<String> rv = driver.getWindowHandles();
		Iterator<String> ref = rv.iterator();
		String par_wind = ref.next();
		String chi_wind = ref.next();
		driver.switchTo().window(chi_wind);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(par_wind);

	}

	public void clickontab() {

		tab.click();

		Set<String> str = driver.getWindowHandles();
		Iterator<String> itr = str.iterator();
		String parent_window = itr.next();
		String child_window = itr.next();
		driver.switchTo().window(child_window);
		System.out.println(thrirdrow.getText());
		driver.switchTo().window(parent_window);

	}

	public void entername() {
		name.sendKeys("shubham");
		alertbutton.click();

		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

	}

	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	public void textofcoursename() {
		System.out.println(coursename.getText());
	}

	public void scrolldown1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,150)");
	}

	public void getsecondwebtable() {
		System.out.println(anothertext.getText());
	}

	public void dynamicdropdown() {
		Actions a = new Actions(driver);
		a.moveToElement(mouseover).perform();
	}

	public void thereloadedpage() {
		reloadpage.click();
	}

	public void elementinframe() {
		driver.switchTo().frame(numberframe);
		blog.click();
		driver.navigate().back();
		System.out.println(driver.getTitle());

	}

	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}
