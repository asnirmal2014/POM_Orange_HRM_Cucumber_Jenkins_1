package com.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PIM_Page;
import utility.WebDriverManager;

/* Only method calling happens in the Step Definition file and method definition happens in the Page files */
public class PIM_StepDefs
{
	public WebDriver driver = null;
    public WebDriverWait wait = null;
    public PIM_Page pimPage = null;
    
    // Page objects are initialized with the driver created by Hooks.@Before
    public PIM_StepDefs()
    {
    	driver = WebDriverManager.getDriver();
    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	pimPage = PageFactory.initElements(driver, PIM_Page.class);
    }
    
    @When("User clicks the Employee List link")
    public void user_clicks_the_employee_list_link() 
    {
    	pimPage.clickOnEmpListLink();
    	System.out.println("User clicks the Employee List link");
    }
        
    @When("User clicks on the Admin page icon from the PIM page")
    public void user_clicks_on_the_admin_page_icon_from_the_pim_page() 
    {
        pimPage.clickOnAdminPageLink();
        wait.until(ExpectedConditions.urlContains("/admin/")); // Wait for the new page to load
        System.out.println("Clicked on the Admin page icon");
    }

    @Then("User should be navigated to the Admin page")
    public void user_should_be_navigated_to_the_admin_page()
    {
        wait.until(ExpectedConditions.urlContains("/admin/"));
        String currentUrl = driver.getCurrentUrl();
        System.out.println("After clicking Admin – URL = " + currentUrl);
        assertTrue(currentUrl.contains("/admin/"), "User is NOT on the Admin page. URL = " + currentUrl);
    }
}
