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
import pages.Admin_Time_Page;
import utility.WebDriverManager;
import utility.WaitUtils;

/* Only method calling happens in the Step Definition file and method definition happens in the Page files */
public class Admin_Time_StepDefs
{
    public WebDriver driver = null;
    public WebDriverWait wait = null;
    public Admin_Time_Page adminTimePage = null;

    // Page objects are initialized with the driver created by Hooks.@Before
    public Admin_Time_StepDefs()
    {
    	driver = WebDriverManager.getDriver();
    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	adminTimePage = PageFactory.initElements(driver, Admin_Time_Page.class);
    }

    @When("the Admin clicks on the Time menu the Time\\/Timesheets page opens")
    public void the_admin_clicks_on_the_time_menu_the_time_timesheets_page_opens() 
    {
    	adminTimePage.clickOnAdminTimeSideMenu();
    	System.out.println("Admin clicks on the Time menu the Time/Timesheets page opens");
    }
    
    @When("the Admin clicks Timesheets link")
    public void the_admin_clicks_timesheets_link() 
    {

    }
    
    @When("the Admin clicks the Attendance link")
    public void the_admin_clicks_the_attendance_link() 
    {

    }
    
    @When("the Admin clicks the Timesheets Reports link")
    public void the_admin_clicks_the_timesheets_reports_link() 
    {

    }
    
    @When("the Admin clicks the ProjectInfo link")
    public void the_admin_clicks_the_project_info_link() 
    {

    }
}
