package test;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;
import properties.PropertiesFile;

public class TestNG_Demo {

	private static WebDriver driver = null;
	public static String browserName = null;

	@BeforeTest
	public void setupTest() {
		String driverPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath + "\\Drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverPath + "\\Drivers\\\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

	}

	@Test
	public void googleSearch() {

		driver.get("https://www.google.com/");

		// enter text to the search textbox
//		driver.findElement(By.name("q")).sendKeys("coronavirus update");

		GoogleSearchPage.textBox_search(driver).sendKeys("Coronavirus update");

		// click search button
//		driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN.ENTER);

		GoogleSearchPage.button_search(driver).click();

		driver.close();
		System.out.println("test completed successfully");
	}

	@AfterTest
	public void tearDownTest() {
//		driver.close();
		System.out.println("test completed successfully");
		PropertiesFile.setProperties();
	}

}
