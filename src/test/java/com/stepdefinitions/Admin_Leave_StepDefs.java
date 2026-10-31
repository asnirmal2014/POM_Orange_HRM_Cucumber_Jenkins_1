package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Admin_Leave_Page;
import pages.Admin_Page;
import utility.WebDriverManager;
import utility.WaitUtils;

/* Only method calling happens in the Step Definition file and method definition happens in the Page files */
public class Admin_Leave_StepDefs
{
    public WebDriver driver = null;
    public WebDriverWait wait = null;
    public Admin_Leave_Page adminLeavePage = null;

    // Page objects are initialized with the driver created by Hooks.@Before
    public Admin_Leave_StepDefs()
    {
    	driver = WebDriverManager.getDriver();
    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	adminLeavePage = PageFactory.initElements(driver, Admin_Leave_Page.class);
    }
    
    @When("the Admin clicks on the Leave menu the Leave page opens")
    public void the_admin_clicks_on_the_leave_menu_the_leave_page_opens() 
    {
    	adminLeavePage.clickOnAdminLeaveSideMenu();
    	System.out.println("Admin clicks on the Leave menu the Leave page opens");
    }
    
    @When("the Admin clicks Apply Leave link")
    public void the_admin_clicks_apply_leave_link() 
    {
    	adminLeavePage.clickOnAdminApplyLeaveLink();
    	System.out.println("Admin clicks Apply Leave link");
    }
    
    @When("the Admin clicks the My Leave link")
    public void the_admin_clicks_the_my_leave_link() 
    {
    	adminLeavePage.clickOnAdminMyLeaveLink();
    	System.out.println("Admin clicks the My Leave link");
    }
    
    @When("the Admin clicks the Entitlement link")
    public void the_admin_clicks_the_entitlement_link() 
    {
    	adminLeavePage.clickOnAdminEntitlementsLink();
    	System.out.println("Admin clicks the Entitlement link");
    }
    
    @When("the Admin clicks the Reports link")
    public void the_admin_clicks_the_reports_link() 
    {
    	adminLeavePage.clickOnAdminReportsLink();
    	System.out.println("Admin clicks the Reports link");
    }
    
    @When("the Admin clicks the Configure link")
    public void the_admin_clicks_the_configure_link() 
    {

    }
    
    @When("the Admin clicks the Leave List link")
    public void the_admin_clicks_the_leave_list_link() 
    {

    }
    
    @When("the Admin clicks the Assign Leave link")
    public void the_admin_clicks_the_assign_leave_link() 
    {

    }
}
