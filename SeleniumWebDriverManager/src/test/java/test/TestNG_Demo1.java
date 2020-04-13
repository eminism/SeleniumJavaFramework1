package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

public class TestNG_Demo1 {

	private static WebDriver driver = null;

	@BeforeTest
	public void setupTest() {
		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath + "\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearch2() {

		driver.get("https://www.google.com/");

		GoogleSearchPage.textBox_search(driver).sendKeys("Coronavirus update");

		GoogleSearchPage.button_search(driver).click();

		driver.close();
		System.out.println("test completed successfully");
	}

	
	@Test
	public void googleSearch3() {

		driver.get("https://www.google.com/");

		GoogleSearchPage.textBox_search(driver).sendKeys("Coronavirus update");

		GoogleSearchPage.button_search(driver).click();

		driver.close();
		System.out.println("test completed successfully");
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("test completed successfully");
	}

}
