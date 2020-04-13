package pom_based_structure_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook_Page_Objects {

	WebDriver driver = null;

	By firstName = By.name("firstname");
	By regButton = By.name("websubmit");

	public Facebook_Page_Objects(WebDriver driver) {
		this.driver=driver;
	}

	public void inputText(String text) {
		driver.findElement(firstName).sendKeys(text);
	}

	public void clickButton() {
		driver.findElement(regButton).click();
	}

}
