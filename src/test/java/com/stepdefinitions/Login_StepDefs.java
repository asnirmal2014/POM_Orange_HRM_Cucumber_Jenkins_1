package com.stepdefinitions;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.Dashboard;
import utility.Hooks;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Login_StepDefs
{
    LoginPage loginPage;
    Dashboard dashboard;
    WebDriverWait wait;

    // Page objects are initialized with the driver created by Hooks.@Before
    public Login_StepDefs()
    {
        loginPage = PageFactory.initElements(Hooks.driver, LoginPage.class);
        dashboard = PageFactory.initElements(Hooks.driver, Dashboard.class);
        wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(15));
    }

    @Given("User is on the OrangeHRM login page")
    public void user_is_on_the_orange_hrm_login_page()
    {
        // Hooks.@Before already launched the browser and opened OrangeHRM URL.
        // This step just verifies we landed on the login page.
        wait.until(ExpectedConditions.urlContains("/auth/login"));
        String currentUrl = Hooks.driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        assertTrue(currentUrl.contains("/auth/login"), "User is NOT on the OrangeHRM login page. URL = " + currentUrl);
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password)
    {
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        System.out.println("Entered credentials: username = " + username);
    }

    @And("User clicks on the Login button")
    public void user_clicks_on_the_login_button()
    {
        loginPage.clickOnLoginButton();
        System.out.println("Clicked on the Login button");
    }

    @Then("User should be navigated to the Dashboard page")
    public void user_should_be_navigated_to_the_dashboard_page()
    {
        wait.until(ExpectedConditions.urlContains("/dashboard"));
        String currentUrl = Hooks.driver.getCurrentUrl();
        System.out.println("Login is successful. After login URL: " + currentUrl);
        assertTrue(currentUrl.contains("/dashboard"), "User is NOT on the Dashboard page. URL = " + currentUrl);
    }
}
