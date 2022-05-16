package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragandDropInFrame {
	@FindBy(xpath = "//a[text()='Droppable']")
	private WebElement draggablebutton;

	@FindBy(xpath = "//div[@id='draggable']")
	private WebElement drag;

	@FindBy(xpath = "//div[@id='droppable']")
	private WebElement drop;

	@FindBy(xpath = "//iframe[@class='demo-frame']")
	private WebElement me;

	WebDriver driver;

	public DragandDropInFrame(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickondragbutton() {
		draggablebutton.click();
	}

	public void navigatetoframe() {
		driver.switchTo().frame(me);
	}

	public void draganddropmethod() {
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
	}
}
