package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.LoginPage;

public class Hooks 
{
    public static WebDriver driver = null;

    @Before(order = 1)                                  // Runs for every Scenario
    public void setUp() throws InterruptedException 
    {
        System.out.println("@Before Hook : Launching browser and opening OrangeHRM");

        driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		//driver = new SafariDriver();
		//driver = new InternetExplorerDriver();
		//driver = new OperaDriver();            // Deprecated
    	driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
	    driver.manage().deleteAllCookies();

        driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(5000);
    }
    
    @Before(order = 2, value = "@loggedIn")             // Runs only for @loggedIn Scenarios
    public void performLogin() 
    {
        System.out.println("@Before Hook (@loggedIn) : Performing login");
        
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.setUserName("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickOnLoginButton();

        new WebDriverWait(driver, Duration.ofSeconds(15))
            .until(ExpectedConditions.urlContains("/dashboard"));
    }

    @After
    public void tearDown() 
    {
        System.out.println("@After Hook : Closing browser");
    
        if (driver != null) 
        {
            driver.quit();
        }
    }
}
