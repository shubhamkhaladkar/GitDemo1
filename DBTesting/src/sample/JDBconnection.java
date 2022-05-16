package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JDBconnection {
	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String Port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + Port + "/qadbt", "root",
				"Shubh@0906");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo  where  name ='shubh'");
		rs.next();
		
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver  = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(rs.getString("name"));
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(rs.getString("age"));
			
			
			//System.out.println(rs.getString("name"));
			//System.out.println(rs.getInt("age"));
		
		

	}

}
