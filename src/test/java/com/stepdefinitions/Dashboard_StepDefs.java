package com.stepdefinitions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.Dashboard_Page;
import utility.DriverManager;
import static org.junit.jupiter.api.Assertions.assertTrue;

/* Only method calling happens in the Step Definition file and method definition happens in the Page files */
public class Dashboard_StepDefs
{
    public WebDriver driver = null;
    public WebDriverWait wait = null;
    public Dashboard_Page dashboard;

    public Dashboard_StepDefs()
    {
    	driver = DriverManager.getDriver();
    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	dashboard = PageFactory.initElements(driver, Dashboard_Page.class);
    }

    @Given("User is on the Dashboard page")
    public void user_is_on_the_dashboard_page()
    {
        wait.until(ExpectedConditions.urlContains("/dashboard"));
        String currentUrl = driver.getCurrentUrl();
        System.out.println("On Dashboard? URL = " + currentUrl);
        assertTrue(currentUrl.contains("/dashboard"), "User is NOT on the Dashboard page. URL = " + currentUrl);
    }

    @When("User clicks on the PIM page icon from the Dashboard page")
    public void user_clicks_on_the_pim_page_icon_from_the_dashboard_page() 
    {
        dashboard.clickOnPIMPageLink();
        wait.until(ExpectedConditions.urlContains("/pim/"));
        System.out.println("Clicked on the PIM page icon");
    }

    @Then("User should be navigated to the PIM page")
    public void user_should_be_navigated_to_the_pim_page()
    {
        wait.until(ExpectedConditions.urlContains("/pim/"));
        String currentUrl = driver.getCurrentUrl();
        System.out.println("After clicking PIM – URL = " + currentUrl);
        assertTrue(currentUrl.contains("/pim/"), "User is NOT on the PIM page. URL = " + currentUrl);
    }
}
