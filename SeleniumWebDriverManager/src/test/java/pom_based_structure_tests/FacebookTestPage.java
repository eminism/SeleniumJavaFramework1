package pom_based_structure_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_based_structure_pages.Facebook_Page_Objects;

public class FacebookTestPage {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		facebookPageTest();  // it must be run from main method. just input class name
		
	}

	public static void facebookPageTest() {

		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath + "\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		Facebook_Page_Objects fbPageObj = new Facebook_Page_Objects(driver);

		driver.get("https://www.facebook.com/");

		fbPageObj.inputText("first name");
		fbPageObj.clickButton();

		driver.close();

	}

}
