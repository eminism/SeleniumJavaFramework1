package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath +"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//go to google.com
		
		driver.get("https://www.google.com/");
		
		//enter text to the search texbox
		
		driver.findElement(By.name("q")).sendKeys("coronavirus update");
		
		//click search button
		
//		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN.ENTER); //use this if auto suggestion menu blocks the "Search" button
		
		
		driver.close();
		
		System.out.println("test completed successfully");
	}

}
