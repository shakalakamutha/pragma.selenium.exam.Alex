package automatedtests.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automatedtests.utils.Browser;

public class AdminLogin {

	/**
	 * Using this method you will open http://shop.pragmatic.bg/admin
	 * in your web browser.
	 */
	public static void open() {
		Browser.driver.get("http://shop.pragmatic.bg/admin");
	}

	public static void login(String username, String password) {
		WebElement usernameInputField = Browser.driver.findElement(By.id("input-username"));
		usernameInputField.sendKeys(username);
		Browser.driver.findElement(By.id("input-password")).sendKeys(password);
		Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
	}

	public static void verifyValidationMessage(String messageOnFailure, String expectedValidationMessage) {
		String actualValidationMessage = Browser.driver.findElement(By.cssSelector(".alert-danger")).getText();
	
		Assert.assertTrue(messageOnFailure, actualValidationMessage.contains(expectedValidationMessage));
	}

}
