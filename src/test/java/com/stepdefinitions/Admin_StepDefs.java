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
}
