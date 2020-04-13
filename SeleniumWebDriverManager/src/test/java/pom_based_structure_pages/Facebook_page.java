package pom_based_structure_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook_page {

	
	
	private static WebElement element = null;
	
	public static WebElement nameBox (WebDriver driver) { //если написать WebDriver drive в этой части кода, то этот ВедДривер будет работать только для теста ниже. Поэтому мы пишем его в public static.
	element = driver.findElement(By.name("firstname"));
	return element;
	}
	
	public static WebElement regButton (WebDriver driver) {
		element = driver.findElement(By.name("websubmit"));
		return element;
	}
}
