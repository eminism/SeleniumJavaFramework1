package seleniumTest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {

		String driverPath = System.getProperty("user.dir");
		System.out.println("driverPath : " + driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath + "\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.forumdaily.com/");
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='top-search']"));
		
		List<WebElement> listOfInputElements=driver.findElements(By.xpath("//input"));
		int countOfElement = listOfInputElements.size();
		System.out.println("Count of Input Element is: " +countOfElement);
		
		
		
		textBox.sendKeys("Emin Ismikhan");
		Thread.sleep(2000);
		driver.close();

	}

}
