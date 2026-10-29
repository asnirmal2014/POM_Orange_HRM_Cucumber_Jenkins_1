package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager 
{
    private static WebDriver driver;

    public static WebDriver getDriver() 
    {
        return driver;
    }

    public static void startBrowser() 
    {
        if (driver == null) 
        {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
            driver.manage().deleteAllCookies();
        }
    }

    public static void closeBrowser() 
    {
        if (driver != null) 
        {
            driver.quit();
            driver = null;
        }
    }
}