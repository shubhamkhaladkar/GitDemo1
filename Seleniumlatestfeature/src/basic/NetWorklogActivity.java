package basic;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v97.network.Network;
import org.openqa.selenium.devtools.v97.network.model.Request;
import org.openqa.selenium.devtools.v97.network.model.Response;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetWorklogActivity {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		DevTools devs = driver.getDevTools();

		devs.createSession();

		devs.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		
		devs.addListener(Network.requestWillBeSent() , request->
		{
			  Request rv = request.getRequest();
			  //System.out.println(rv.getUrl());
		});
		
		// event will get fired
		devs.addListener(Network.responseReceived(), response ->

		{
			Response rs = response.getResponse();
			//System.out.println(rs.getUrl());
			//System.out.println(rs.getStatus());
			
			if (rs.getStatus()!=200)
			{
			System.out.println(rs.getStatus()+"API is failed");	
			}
			
		});

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");

		driver.findElement(By.xpath("//button[@routerlink='/library']")).click();

		
	
	}
}
