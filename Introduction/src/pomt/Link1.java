package pomt;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Report;

public class Link1 {

	WebElement ref;
	int visible_links = 0;

	int Invisible_links = 0;
	@FindBy(xpath = "//a")

	private List<WebElement> link;

	public Link1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sizeofthelinks() {
		Reporter.log("Size of the links:" + link.size(), true);
	}

	public void getetxt_1() {
		for (int i = 0; i < link.size(); i++) {
			// Reporter.log(link.get(i).getText(),true);

			ref = link.get(i);

			if (ref.isDisplayed()) {
				visible_links++;
			} else {
				Invisible_links++;
			}

		}

		Reporter.log("The visible links are:" + visible_links, true);

		Reporter.log("The invisible links are:" + Invisible_links, true);

	}
}
