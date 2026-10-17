package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;
import pages.AdminPage;
import utility.TestBase;

public class OrangeHRM_TestCase extends TestBase 
{
	@Test
	public void init() throws InterruptedException 
	{
		// LoginPage loginPage = new LoginPage(null);
		// PageFactory.initElements(driver, loginPage);

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.setUserName("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickOnLoginButton();
		Thread.sleep(5000);

		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		dashboard.clickOnAdminPageLink();
		
		Thread.sleep(5000);
		
		AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
		Thread.sleep(2000);
		adminPage.clickOnProfile();
		Thread.sleep(5000);
		adminPage.clickOnProfileLogOut();
		
		Thread.sleep(5000);
	}
}


