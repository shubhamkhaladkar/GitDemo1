package basic;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v97.fetch.Fetch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetworkMocking {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		DevTools rv = driver.getDevTools();

		rv.createSession();

		rv.send(Fetch.enable(Optional.empty(), Optional.empty()));

		rv.addListener(Fetch.requestPaused(), request ->

		{
			if (request.getRequest().getUrl().contains("Shetty")) {
				String mockedurl = request.getRequest().getUrl().replace("=Shetty", "=BadGuy");

				System.out.println(mockedurl);

				rv.send(Fetch.continueRequest(request.getRequestId(), Optional.empty(), Optional.empty(),
						Optional.empty(), Optional.empty(), Optional.empty()));

			} else {
				rv.send(Fetch.continueRequest(request.getRequestId(), Optional.empty(), Optional.empty(),
						Optional.empty(), Optional.empty(), Optional.empty()));
			}
		});

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//button[@routerlink='/library']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
	}
}
