package pom_based_structure_tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_based_structure_pages.Facebook_page;


public class Facebook_tests {
	
	private static WebDriver driver=null;

	public static void main(String[] args) {
		Facebook_pages();
	}
	
	public static void Facebook_pages() {
		
		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath + "\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Facebook_page.nameBox(driver).sendKeys("name");
		Facebook_page.regButton(driver).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
	

	
}
