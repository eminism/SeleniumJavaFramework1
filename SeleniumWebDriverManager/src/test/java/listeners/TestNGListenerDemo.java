package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {

	@Test
	public void test1() {
		System.out.println("i'm inside test 1");
	}

	@Test
	public void test2() {
		System.out.println("i'm inside test 2");

		String driverPath = System.getProperty("user.dir");
		System.out.println("driverPath : " + driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath + "\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.forumdaily.com/");

		WebElement textBox = driver.findElement(By.xpath("//input[@id='top-search']"));
		textBox.sendKeys("123");

	}

	@Test
	public void test3() {
		System.out.println("i'm inside test 3");
	}

}
