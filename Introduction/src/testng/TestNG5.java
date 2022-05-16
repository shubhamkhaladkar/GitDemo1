package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestNG5 {
	public static void main(String[] args) throws IOException {

		Properties pop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\khala\\OneDrive\\Desktop\\Automation\\Introduction\\data.properties");

		pop.load(fis);

		System.out.println(pop.getProperty("Url"));

		System.out.println(pop.getProperty("browser"));

		pop.setProperty("browser", "chrome");

		System.out.println(pop.getProperty("browser"));

		pop.setProperty("Url", "Https://www.google.com");

		System.out.println(pop.getProperty("Url"));

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\khala\\OneDrive\\Desktop\\Automation\\Introduction\\data.properties");

		pop.store(fos, null);

	}
}
