package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Admin_Page;
import utility.WebDriverManager;
import utility.WaitUtils;

/* Only method calling happens in the Step Definition file and method definition happens in the Page files */
public class Admin_StepDefs
{
    public WebDriver driver = null;
    public WebDriverWait wait = null;
    public Admin_Page adminPage = null;

    // Page objects are initialized with the driver created by Hooks.@Before
    public Admin_StepDefs()
    {
    	driver = WebDriverManager.getDriver();
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
    	adminPage.clickOnJob();
    	System.out.println("User clicks the Job link");
    }
    
    @When("the user clicks the Organization link")
    public void the_user_clicks_the_organization_link() 
    {
    	adminPage.clickOnOrganization();
    	System.out.println("User clicks the Organization link");
    }
    
    @When("the user clicks the Qualifications link")
    public void the_user_clicks_the_qualifications_link() 
    {
    	adminPage.clickOnQualifications();
    	System.out.println("User clicks the Qualifications link");
    }
    
    @When("the user clicks the Nationalities link")
    public void the_user_clicks_the_nationalities_link() 
    {
    	adminPage.clickOnNationalities();
    	System.out.println("User clicks the Nationalities link");
    }
    
    @When("the user clicks the Corporate Branding link")
    public void the_user_clicks_the_corporate_branding_link() 
    {
    	adminPage.clickOnCorporateBranding();
    	System.out.println("User clicks the Corporate Branding link");
    }
    
    @When("the user clicks the Configuration link")
    public void the_user_clicks_the_configuration_link() 
    {
    	adminPage.clickOnConfiguration();
    	System.out.println("User clicks the Configuration link");
    }

    @When("the user clicks the Help icon")
    public void the_user_clicks_the_Help_icon()
    {
    	// adminPage.clickOnHelpIcon();
    	// System.out.println("User clicks the Help icon");
    	// The control should come back to the same page. 
    	
    	// 1. Store the current (original) window handle
        String originalWindow = driver.getWindowHandle();

        // 2. Click the Help icon (this opens a new tab)
        adminPage.clickOnHelpIcon();
        System.out.println("User clicks the Help icon");
        
        // WaitUtils.pause(25);   // 25 seconds
        
        // Wait properly for the new tab instead of a blind 25s sleep
        /*    
        Both ds are the same thing — the WebDriver instance.
        First d (before ->) is the lambda parameter — the input variable the lambda declares.
        Second d (after ->) is that same variable being used in the body to call getWindowHandles().
        */
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(d -> d.getWindowHandles().size() > 1);

        // Switch to the Help tab
        // Wait for the new window/tab to open and switch
        String helpWindow = null;
        for (String handle : driver.getWindowHandles()) 
        {
            if (!handle.equals(originalWindow)) 
            {
                helpWindow = handle;
                driver.switchTo().window(handle);
                break;
            }
        }

        // NOW the scroll actually hits the Help page
        JavascriptExecutor jse = (JavascriptExecutor) driver;                           // Downcasting or Sidecasting       
		jse.executeScript("window.scrollBy(0,1450)", "");    // Width and Height        // Scroll Down
		// jse.executeScript("window.scrollBy(0,-350)", ""); // Up Width and Up Height  // Scroll Up
		// jse.executeScript("window.scrollBy(0, document.body.scrollHeight)");         // Scroll Down to the bottom of the Web Page

		WaitUtils.pause(25);   // 25 seconds
		
        /*
        We can close the new 'Help' page.
        Wait a moment for the new tab to open (optional but safer)
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(d -> d.getWindowHandles().size() > 1);
        */
        
        // Switch to the new tab, do something if needed, then close the newly opened tab
        for (String windowHandle : driver.getWindowHandles()) 
    	{
            if (!windowHandle.equals(originalWindow)) 
    		{
                driver.switchTo().window(windowHandle);
                // Optional: verify help page title/url here
                driver.close();               // close the Help tab
                break;
            }
        }

        // 3. Switch back to the original window
        driver.switchTo().window(originalWindow);
        // Now driver is focused on the original Admin page again
    }
    
    @Then("the help content should be displayed")
    public void the_help_content_should_be_displayed() 
    {
    	System.out.println("Help content should be displayed");
    }
    
    @When("User clicks on the Buzz page icon from the Admin page")
    public void user_clicks_on_the_Buzz_page_icon_from_the_Admin_page() 
    {
    	adminPage.clickOnBuzzPageLink();
    }
    
    /* As of now we didn't use this method */
    @Then("User should be navigated to the Buzz page")
    public void user_should_be_navigated_to_the_Buzz_page()
    {
    	//https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz
    	wait.until(ExpectedConditions.urlContains("/buzz/"));
    	
    	System.out.println("Current URL: " + driver.getCurrentUrl());
		System.out.println("Page title: " + driver.getTitle());
    }
}
