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
    
    
}
