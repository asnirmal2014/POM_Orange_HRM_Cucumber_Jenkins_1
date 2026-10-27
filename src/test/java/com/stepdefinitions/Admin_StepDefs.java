package com.stepdefinitions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Admin_Page;
import utility.Hooks;

public class Admin_StepDefs
{
    Admin_Page adminPage;
    WebDriverWait wait;

    // Page objects are initialized with the driver created by Hooks.@Before
    public Admin_StepDefs()
    {
        adminPage = PageFactory.initElements(Hooks.driver, Admin_Page.class);
        // wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
    }

    @When("User clicks the profile picture")
    public void user_clicks_the_profile_picture() 
    {
    	adminPage.clickOnProfile();
    	System.out.println("User clicks the profile picture");
    }
    
    @When("User clicks on the logout button")
    public void user_clicks_on_the_logout_button() 
    {
    	adminPage.clickOnProfileLogOut();
    	System.out.println("User clicks on the logout button");
    }
    
    @Then("User should be logged out from the application")
    public void user_should_be_logged_out_from_the_application() 
    {
    	System.out.println("User is logged out from the application");
    }
}
