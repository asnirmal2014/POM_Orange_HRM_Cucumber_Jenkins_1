package utility;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import pages.Login_Page;

public class Hooks 
{
    public static WebDriver driver = null;

    // Runs only once before the entire suite
    @BeforeAll
    public static void setUpOnce() throws InterruptedException 
    {
        System.out.println("@BeforeAll : Launching browser + Login once for the whole project");
        
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();
        
        /*
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
        driver.manage().deleteAllCookies();
        */

        driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(3000);

        // Perform login only once
        Login_Page loginPage = PageFactory.initElements(driver, Login_Page.class);
        loginPage.setUserName("Admin");
        loginPage.setPassword("admin123");
        
        WaitUtils.pause(5);   // 5 seconds
        
        loginPage.clickOnLoginButton();

        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.urlContains("/dashboard"));

        System.out.println("@BeforeAll : Login successful. Session will be shared across all features.");
    }

    // Runs only once after the entire suite
    @AfterAll
    public static void tearDownOnce() 
    {
        System.out.println("@AfterAll : Closing browser after all tests");
    
        if (driver != null) 
        {
            driver.quit();
            driver = null;
        }
    }
}