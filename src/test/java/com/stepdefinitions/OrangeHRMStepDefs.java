package com.stepdefinitions;

import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.Dashboard;
import pages.AdminPage;
import utility.Hooks;          // We will keep driver in Hooks (like TestBase)

public class OrangeHRMStepDefs 
{
    LoginPage loginPage;
    Dashboard dashboard;
    AdminPage adminPage;

    @Given("User is on the OrangeHRM login page")
    public void user_is_on_the_OrangeHRM_login_page() 
    {
        // Driver is already launched in @Before hook
        // URL is already opened in the hook
        System.out.println("User is on the OrangeHRM login page");
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) 
    {
        loginPage = PageFactory.initElements(Hooks.driver, LoginPage.class);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
    }

    @When("User clicks on the Login button")
    public void user_clicks_on_the_Login_button() throws InterruptedException 
    {
        loginPage.clickOnLoginButton();
        Thread.sleep(3000);
    }

    @Then("User should be navigated to the Dashboard page")
    public void user_should_be_navigated_to_the_Dashboard_page() 
    {
        dashboard = PageFactory.initElements(Hooks.driver, Dashboard.class);
        System.out.println("Successfully navigated to Dashboard");
    }

    @When("User clicks on the Admin menu link")
    public void user_clicks_on_the_Admin_menu_link() throws InterruptedException 
    {
        dashboard.clickOnAdminPageLink();
        Thread.sleep(3000);
    }

    @Then("User should be navigated to the Admin page")
    public void user_should_be_navigated_to_the_Admin_page() 
    {
        adminPage = PageFactory.initElements(Hooks.driver, AdminPage.class);
        System.out.println("Successfully navigated to Admin page");
    }

    @When("User clicks on the profile dropdown")
    public void user_clicks_on_the_profile_dropdown() throws InterruptedException 
    {
        adminPage.clickOnProfile();
        Thread.sleep(2000);
    }

    @When("User clicks on the Logout link")
    public void user_clicks_on_the_Logout_link() throws InterruptedException 
    {
        adminPage.clickOnProfileLogOut();
        Thread.sleep(3000);
    }

    @Then("User should be logged out successfully")
    public void user_should_be_logged_out_successfully() 
    {
        System.out.println("User logged out successfully");
    }
}

