package com.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Admin_Page;
import utility.DriverManager;

/* Only method calling happens in the Step Definition file and method definition happens in the Page files */
public class Admin_StepDefs
{
    public WebDriver driver = null;
    public WebDriverWait wait = null;
    public Admin_Page adminPage = null;

    // Page objects are initialized with the driver created by Hooks.@Before
    public Admin_StepDefs()
    {
    	driver = DriverManager.getDriver();
    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        adminPage = PageFactory.initElements(driver, Admin_Page.class);
    }
    
    @When("the user clicks the User Management link")
    public void the_user_clicks_the_user_management_link() 
    {
    	adminPage.clickOnUserMgmt();
    	System.out.println("User clicks the User Management link");
    }
    
    @When("the user clicks the Job link")
    public void the_user_clicks_the_job_link() 
    {
    	System.out.println("User clicks the Job link");
    }
    
    @When("the user clicks the Organization link")
    public void the_user_clicks_the_organization_link() 
    {
    	System.out.println("User clicks the Organization link");
    }
    
    @When("the user clicks the Qualifications link")
    public void the_user_clicks_the_qualifications_link() 
    {
    	System.out.println("User clicks the Qualifications link");
    }
    
    @When("the user clicks the Nationalities link")
    public void the_user_clicks_the_nationalities_link() 
    {
    	System.out.println("User clicks the Nationalities link");
    }
    
    @When("the user clicks the Corporate Banking link")
    public void the_user_clicks_the_corporate_banking_link() 
    {
    	System.out.println("User clicks the Corporate Banking link");
    }
    
    @When("the user clicks the Configuration link")
    public void the_user_clicks_the_configuration_link() 
    {
    	System.out.println("User clicks the Configuration link");
    }
    
    @When("User clicks on the Buzz page icon from the Admin page")
    public void user_clicks_on_the_Buzz_page_icon_from_the_Admin_page() 
    {
    	adminPage.clickOnBuzzPageLink();
    }

    @Then("User should be navigated to the Buzz page")
    public void user_should_be_navigated_to_the_Buzz_page()
    {
    	//https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz
    	wait.until(ExpectedConditions.urlContains("/buzz/"));
    }
    
    /*
    @When("the user clicks the Help icon")
    public void the_user_clicks_the_help_icon() 
    {
    	System.out.println("User clicks the Help icon");
    }
    
    @Then("the expected page or help content should be displayed")
    public void the_expected_page_or_help_content_should_be_displayed() 
    {
    	System.out.println("Expected page or help content should be displayed");
    }
    */
}
