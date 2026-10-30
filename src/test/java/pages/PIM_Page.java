package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.WaitUtils;

/* Only method calling happens in the Step Definition file and method definition happens in the Page files */
public class PIM_Page 
{
	public WebDriver driver = null;
	public WebDriverWait wait = null;
   
    public PIM_Page(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
    // Create the WebDriverWait once, reuse it
    private WebDriverWait wdWait()
    {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    @FindBy(how = How.XPATH, using="//a[@class='oxd-topbar-body-nav-tab-item'][text()='Employee List']") WebElement empListLink;
    @FindBy(how = How.XPATH, using="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][text()='Admin']") WebElement adminPageLink;
    
	public void clickOnEmpListLink()
    {
		WaitUtils.pause(5);   // 5 seconds
		
        // WebElement webElement = wdWait().until(ExpectedConditions.elementToBeClickable(empListLink));
        // webElement.click();
        
        // [OR]
        
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(empListLink));
        empListLink.click();        
    }
	
	public void clickOnAdminPageLink()
	{
		WaitUtils.pause(5);   // 5 seconds
		
		WebElement webElement = wdWait().until(ExpectedConditions.elementToBeClickable(adminPageLink));
		webElement.click();
	}
}
