package utility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{
    public static WebDriver driver = null;

    @Before
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
