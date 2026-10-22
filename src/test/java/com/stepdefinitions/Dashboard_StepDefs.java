package com.stepdefinitions;

import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.Dashboard;
import utility.Hooks;
import org.testng.Assert; // or org.junit.jupiter.api.Assertions


public class Dashboard_StepDefs 
{
    Dashboard dashboard;
    
    public Dashboard_StepDefs() 
    {
        dashboard = PageFactory.initElements(Hooks.driver, Dashboard.class);
    }
    
    @Given("User is on the Dashboard page")
    public void user_is_on_the_dashboard_page() 
    {
        String currentUrl = Hooks.driver.getCurrentUrl();
        System.out.println("On Dashboard? URL = " + currentUrl);
        Assert.assertTrue(currentUrl.contains("dashboard"), "User is not on the Dashboard page.");
    }
    
    @When("User clicks on the PIM page icon from the Dashboard page")
    public void user_clicks_on_the_pim_page_icon_from_the_dashboard_page() 
    {
        dashboard.clickOnPIMPageLink();
    }
    
    @Then("User should be navigated to the PIM page")
    public void user_should_be_navigated_to_the_pim_page() 
    {
        String currentUrl = Hooks.driver.getCurrentUrl();
        System.out.println("After clicking PIM – URL = " + currentUrl);
        Assert.assertTrue(currentUrl.contains("pim"), "Not on PIM page");
    }
}