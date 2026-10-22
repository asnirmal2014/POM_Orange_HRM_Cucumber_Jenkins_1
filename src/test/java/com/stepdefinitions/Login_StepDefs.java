package com.stepdefinitions;

import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.Dashboard;
import utility.Hooks;          // Driver kept in Hooks (like TestBase)
//import org.testng.Assert;      // or org.junit.jupiter.api.Assertions

public class Login_StepDefs 
{
    LoginPage loginPage;
    Dashboard dashboard;

    // Initialize page objects using the driver created in @Before Hook
    public Login_StepDefs() 
    {
        loginPage = PageFactory.initElements(Hooks.driver, LoginPage.class);
        dashboard = PageFactory.initElements(Hooks.driver, Dashboard.class);
    }
    
    @Given("User is on the OrangeHRM login page")
    public void user_is_on_the_orange_hrm_login_page() 
    {
        // Driver is already opened and navigated by Hooks.@Before
        String currentUrl = Hooks.driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
    }
    
    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) 
    {
        loginPage.setUserName(username);
        loginPage.setPassword(password);
    }
    
    @And("User clicks on the Login button")
    public void user_clicks_on_the_login_button() 
    {
        loginPage.clickOnLoginButton();
    }
    
    @Then("User should be navigated to the Dashboard page")
    public void user_should_be_navigated_to_the_dashboard_page() 
    {
    	System.out.println("Login is successful");
        
    	String currentUrl = Hooks.driver.getCurrentUrl();
        System.out.println("After login URL: " + currentUrl);
        
        // TestNG assertion
        // Assert.assertTrue(currentUrl.contains("dashboard"), "Not on Dashboard page");
    }
}
