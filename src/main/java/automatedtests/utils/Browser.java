package automatedtests.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver driver;
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void quit() {
		driver.quit();
	}

}
