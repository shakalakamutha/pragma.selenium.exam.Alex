package automatedtests.pages;

import org.openqa.selenium.By;

import automatedtests.utils.Browser;

public class AdminLogout {


	public static void logout() {
		Browser.driver.findElement(By.cssSelector(".nav.navbar-nav.navbar-right>li>a")).click();
		
	}

}
