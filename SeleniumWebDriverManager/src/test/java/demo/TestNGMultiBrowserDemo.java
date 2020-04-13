package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;
	String driverPath = System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("browser name is : " + browserName);
		System.out.println("Thread id: "+Thread.currentThread().getId());

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", driverPath + "\\Drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverPath + "\\Drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.gecko.driver", driverPath + "\\Drivers\\edgedriver\\msedgedriver.exe");
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void test1() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(3000);
	}

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("test completed successfully");
	}
}
