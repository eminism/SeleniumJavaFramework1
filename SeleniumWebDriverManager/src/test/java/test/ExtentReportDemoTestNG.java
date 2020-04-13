package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemoTestNG {

	// BeforeSuite will run once before test.
	// BeforeTest runs before each test. If I have multiple tests then it will run
	// before each test.

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;

	@BeforeSuite
	public void setUp() {

		htmlReporter = new ExtentHtmlReporter("extend.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@BeforeTest
	public void setupTest() {
		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath + "\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void test1() throws IOException {

		ExtentTest test = extent.createTest("My First Test", "Sample description");

		driver.get("https://facebook.com");
		test.pass("Navigated to facebook.com");
		test.log(Status.INFO, "This step shows usage of log");

		// info details
		test.info("This step shows usage of info");

		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screnshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screnshot.png");

	}

	@Test
	public void test2() throws IOException {

		ExtentTest test = extent.createTest("My First Test", "Sample description");

		test.log(Status.INFO, "This step shows usage of log");

		// info details
		test.info("This step shows usage of info");

		// log with snapshot
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screnshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screnshot.png");
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("test completed successfully");
	}

	@AfterSuite
	public void tearDown() {

		extent.flush();
	}
}
