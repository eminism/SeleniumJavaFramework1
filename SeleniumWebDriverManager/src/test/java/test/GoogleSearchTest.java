package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		googleSearch();
	}

	public static void googleSearch() {

		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath + "\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		// go to google.com
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

}
