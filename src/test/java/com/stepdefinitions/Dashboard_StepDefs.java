package com.stepdefinitions;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.Dashboard;
import utility.Hooks;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Dashboard_StepDefs
{
    Dashboard dashboard;
    WebDriverWait wait;

    public Dashboard_StepDefs()
    {
        dashboard = PageFactory.initElements(Hooks.driver, Dashboard.class);
        wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(15));
    }

    @Given("User is on the Dashboard page")
    public void user_is_on_the_dashboard_page()
    {
        // The @loggedIn tagged Hook already performed login before this step runs.
        // This step is a precondition assertion — it does NOT log in again.
        wait.until(ExpectedConditions.urlContains("/dashboard"));
        String currentUrl = Hooks.driver.getCurrentUrl();
        System.out.println("On Dashboard? URL = " + currentUrl);
        assertTrue(currentUrl.contains("/dashboard"), "User is NOT on the Dashboard page. URL = " + currentUrl);
    }

    @When("User clicks on the PIM page icon from the Dashboard page")
    public void user_clicks_on_the_pim_page_icon_from_the_dashboard_page()
    {
        dashboard.clickOnPIMPageLink();
        System.out.println("Clicked on the PIM page icon");
    }

    @Then("User should be navigated to the PIM page")
    public void user_should_be_navigated_to_the_pim_page()
    {
        wait.until(ExpectedConditions.urlContains("/pim"));
        String currentUrl = Hooks.driver.getCurrentUrl();
        System.out.println("After clicking PIM – URL = " + currentUrl);
        assertTrue(currentUrl.contains("/pim"), "User is NOT on the PIM page. URL = " + currentUrl);
    }
}
