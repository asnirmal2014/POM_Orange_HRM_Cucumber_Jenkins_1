package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.WaitUtils;

public class Dashboard_Page 
{
	public WebDriver driver = null;
	
	public Dashboard_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// Prefer href-based locator – unique and stable on OrangeHRM
    @FindBy(how = How.XPATH, using = "//a[contains(@href,'/pim/viewPimModule')]") 
    WebElement pimPageLink;
	
	// [OR]
    
    // @FindBy(how = How.XPATH, using = "//span[normalize-space()='PIM']")
    // WebElement pimPageLink;
	
    public void clickOnPIMPageLink() 
    {
    	WaitUtils.pause(10);   // 10 seconds
    	
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the menu item is clickable, then click
        WebElement pimLink = wait.until(ExpectedConditions.elementToBeClickable(pimPageLink));
        pimLink.click();

        // Optional but recommended: wait until URL actually changes to PIM
        wait.until(ExpectedConditions.urlContains("/pim"));
        
        /*
        pimLink.click() does not transfer control of your Java program to the browser page.
        It only sends a click command to the browser. 
        Your Java method continues to run on the next line i.e., wait.until(ExpectedConditions.urlContains("/pim"));
        Your Java method pauses here until browser finishes.  
        */
    }
}