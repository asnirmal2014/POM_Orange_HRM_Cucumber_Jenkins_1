
package com.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_Page;
import utility.DriverManager;

/* Only method calling happens in the Step Definition file and method definition happens in the Page files */
public class Login_StepDefs 
{
	public WebDriver driver = null;
    public WebDriverWait wait = null;
    public Login_Page loginPage;
	
	@Given("User opens the OrangeHRM login page")
	public void user_opens_the_orange_hrm_login_page() 
	{
		DriverManager.startBrowser();
		driver = DriverManager.getDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		loginPage = PageFactory.initElements(driver, Login_Page.class);
		loginPage.openLoginPage();
	}
	
	@When("User enters valid credentials and clicks Login")
	public void user_enters_valid_credentials_and_clicks_login() 
	{
		loginPage.login("Admin", "admin123");
	}
	
	@Then("User should be navigated to the Dashboard page")
	public void user_should_be_navigated_to_the_dashboard_page() 
	{
		assertTrue(loginPage.isDashboardDisplayed(), "Login failed: Dashboard page was not displayed.");
		System.out.println("Login successful.");
		System.out.println("Current URL: " + driver.getCurrentUrl());
	}
}
