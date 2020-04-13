package desireCapabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesireCapabilities {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver", driverPath + "\\Drivers\\edgedriver\\msedgedriver.exe"); 
		
		WebDriver driver = new InternetExplorerDriver(caps);
		

		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("name");
		driver.findElement(By.name("websubmit")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
		
	}

}
