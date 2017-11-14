package automatedtests.pages;

import org.junit.Assert;

import automatedtests.utils.Browser;

public class AdminDashboard {

	/**
	 * THis method asserts that the title on the Admin Dashboard page
	 * is the one as you expected, and it will show a message on failure if it
	 * is not as you expected it.
	 * 
	 * @param messageOnFailure the message you would like to be shown in case of failure
	 * @param expectedTitle the expected title that you expect to be present
	 */
	public static void verifyTitle(String messageOnFailure, String expectedTitle) {
		String actualTitle = Browser.driver.getTitle();
		
		Assert.assertEquals(messageOnFailure, expectedTitle, actualTitle);
	}

}
