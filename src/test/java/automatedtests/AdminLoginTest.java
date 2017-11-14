package automatedtests;



import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import automatedtests.pages.AdminDashboard;
import automatedtests.pages.AdminLogin;
import automatedtests.pages.AdminLogout;
import automatedtests.utils.Browser;


public class AdminLoginTest {

	
	@Before
	public void setup() {
		Browser.openBrowser();
	}
	
	
	@Test
	public void createGroup() {
		AdminLogin.open();
		AdminLogin.login("admin4", "parola123!");
		AdminDashboard.verifyTitle("You did not login successfully so there might"
				+ "be a bug in that functionatlity because the Dashboard"
				+ "was not present.", "Dashboard");
	
		Browser.driver.findElement(By.xpath(".//*[@id='menu-customer']/a")).click();
		Browser.driver.findElement(By.xpath(".//*[@id='collapse33']/li[2]/a")).click();
		WebElement existingGroup = Browser.driver.findElement(By.cssSelector(".text-left"));
		if(existingGroup.getText().contains("Alex"));
		{
		List<WebElement> allRows = (List<WebElement>) Browser.driver.findElement(By.cssSelector(".table.table-bordered.table-hover>tbody"));
		for (WebElement curRow : allRows) {
			List<WebElement> allColumns = curRow.findElements(By.tagName("td"));
			for (WebElement curColumn : allColumns) {
				if(curColumn.getText().equals("Alex")) {
					curRow.findElement(By.tagName("td")).click();
				}
				
			}
			
		}
		
		Browser.driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/button")).click();
		Browser.driver.switchTo().alert().accept();
		}
		Browser.driver.findElement(By.cssSelector(".fa.fa-plus")).click();
		Browser.driver.findElement(By.xpath(".//*[@id='form-customer-group']/div[1]/div/div/input")).sendKeys("Alex");
		Browser.driver.findElement(By.xpath(".//*[@id='input-description1']")).sendKeys("I created this group for testing purposes");
		Browser.driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		

		
	}
	
	
	@After
	public void tearDown() {
	AdminLogout.logout();
		Browser.quit();
	}
}
