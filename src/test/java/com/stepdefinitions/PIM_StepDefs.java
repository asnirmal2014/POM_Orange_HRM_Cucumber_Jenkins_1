package com.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PIM_Page;
import utility.Hooks;

public class PIM_StepDefs
{
	PIM_Page pimPage;
    WebDriverWait wait;
    
    // Page objects are initialized with the driver created by Hooks.@Before
    public PIM_StepDefs()
    {
    	pimPage = PageFactory.initElements(Hooks.driver, PIM_Page.class);
        wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
    }
    
    @When("User clicks the Employee List link")
    public void user_clicks_the_employee_list_link() 
    {
    	pimPage.clickOnEmpListLink();
    	System.out.println("User clicks the Employee List link");
    }
    
    @When("User clicks on the search button")
    public void user_clicks_on_the_search_button() 
    {
    	pimPage.clickOnAdminPageLink();
    	System.out.println("User clicks on the search button");
    }
        
    @When("User clicks on the Admin page icon from the PIM page")
    public void user_clicks_on_the_admin_page_icon_from_the_pim_page() 
    {
        pimPage.clickOnAdminPageLink();

        // Wait for the new page to load
        wait.until(ExpectedConditions.urlContains("/admin/"));
        System.out.println("Clicked on the Admin page icon");
    }

    @Then("User should be navigated to the Admin page")
    public void user_should_be_navigated_to_the_admin_page()
    {
        wait.until(ExpectedConditions.urlContains("/admin/"));
        String currentUrl = Hooks.driver.getCurrentUrl();
        System.out.println("After clicking Admin – URL = " + currentUrl);
        assertTrue(currentUrl.contains("/admin/"), "User is NOT on the Admin page. URL = " + currentUrl);
    }
}
