package utility;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.opera.OperaDriver;         // Deprecated
//import io.github.bonigarcia.wdm.WebDriverManager;

// BaseClass + BrowserFactory
public class TestBase 
{
    public static WebDriver driver = null;
    
    @BeforeSuite
    public void initialize() throws IOException, InterruptedException
    {
    	/*  OLD TECHNIQUE-1 */
	    /*
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	
		System.setProperty("webdriver.gecko.driver", "C:/jars_selenium/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	
		System.setProperty("webdriver.chrome.driver", "C:/jars_selenium/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	    */
		
		/*  OLD TECHNIQUE-2 */
		/*
		WebDriverManager.chromedriver().setup();                      // 4.4.3
    	WebDriver driver = new ChromeDriver();
    	[OR]
    	WebDriver driver = WebDriverManager.chromedriver().create();  // 5.9.1
    	*/
				
		// [OR]
				
		/*
			ChromeOptions co = new ChromeOptions();
			co.setHeadless(true);
			WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();  // 5.1.1
		*/	
				
		/*
			ChromeOptions co = new ChromeOptions();
			co.setHeadless(false);
			WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();  // 5.1.1
		*/
		
		/*
			ChromeOptions options = new ChromeOptions();
			Map<String, Integer> prefs = new HashMap<String, Integer>();
			prefs.put("profile.default_content_setting_values.notifications", 0);  // 0-Ask(Default), 1-Allow, 2-Block
			options.setExperimentalOption("prefs", prefs);
			// options.addArguments("disable-notifications"); // To disable the notifications based permission popup
    		// options.addArguments("disable-geolocation");   // To disable the location based permission popup
    		// options.addArguments("disable-media-stream");  // To disable the microphone or camera based permission popup
			System.setProperty("webdriver.chrome.driver", "C:/jars_selenium/drivers/chromedriver.exe");
			driver = new ChromeDriver(options);
        */

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
    
    @AfterSuite
    public void tearDownTest()
    {
		// driver.close();  // Close the current window, quitting the browser if it's the last window currently open.

		// driver.quit();   // Quits this driver, closing every associated window. Closes all the windows which are currently open.
    	
    	// driver.quit();   // Recommended
    	
    	if (driver != null)
    	{
            driver.quit();           // ← preferred
            // driver = null;        // optional but good practice
        }
    }
}


