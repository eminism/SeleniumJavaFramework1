package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.inject.Key;

public class ExtentReportsBasicDemo {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extendReports.html");
		
		//Create ExtendReport and attach Report(s)
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//creates a toggle for the given test, adds all log events under it
		
		ExtentTest test1 = extent.createTest("Google Search Test One","This is the test to validate google search funcionality");
		
		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath +"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting test case" );
		
		driver.get("https://facebook.com");
		
		test1.pass("Navigated to facebook.com");
		
		driver.findElement(By.name("firstname")).sendKeys("Java OOP");
		
		test1.pass("Input text to the search box");
		
		driver.findElement(By.name("websubmit")).sendKeys(Keys.RETURN); // analogue of .click 
		
		test1.pass("Clicked 'Registration' button");
		
		driver.close();
		driver.quit();
		
		test1.pass("Closed the browser");
		
		test1.pass("Test completed");
		
		extent.flush(); //This must be here 
		
	}

}
