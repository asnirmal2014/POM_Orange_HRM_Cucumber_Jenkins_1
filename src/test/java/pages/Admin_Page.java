package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.WaitUtils;

/* Only method calling happens in the Step Definition file and method definition happens in the Page files */
public class Admin_Page 
{
	public WebDriver driver = null;
	public WebDriverWait wait = null;
   
    public Admin_Page(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
    // Create the WebDriverWait once, reuse it
    private WebDriverWait wdWait()
    {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    By usermgmtLinkLocator = By.xpath("//span[contains(@class,'oxd-topbar-body-nav-tab-item') and normalize-space()='User Management']");
    By jobLinkLocator = By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='Job']");
    By organizationLinkLocator = By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='Organization']");
    By qualificationsLinkLocator = By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='Qualifications']");
    By nationalitiesLinkLocator = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='Nationalities']");
    By corporatebrandingLinkLocator = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='Corporate Branding']");
    By configurationLinkLocator = By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='Configuration']");
    By helpIconLocator = By.xpath("//i[@class='oxd-icon bi-question-lg']");
        
    By buzzLinkLocator = By.xpath("//span[contains(@class,'oxd-text oxd-text--span oxd-main-menu-item--name') and normalize-space()='Buzz']");

    public void clickOnUserMgmt()
    {
		// No need to use the System.out.println().
		//System.out.println("@Current URL: " + driver.getCurrentUrl());
		//System.out.println("@Page title: " + driver.getTitle());

		WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usermgmtLink = wait.until(ExpectedConditions.elementToBeClickable(usermgmtLinkLocator));
        usermgmtLink.click();
    }
	
	public void clickOnJob()
	{
		WaitUtils.pause(5);   // 5 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement jobLink = wait.until(ExpectedConditions.elementToBeClickable(jobLinkLocator));
        jobLink.click();
	}
	
	public void clickOnOrganization()
	{
		WaitUtils.pause(5);   // 5 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement organizationLink = wait.until(ExpectedConditions.elementToBeClickable(organizationLinkLocator));
		organizationLink.click();
	}
	
	public void clickOnQualifications()
	{
		WaitUtils.pause(5);   // 5 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement qualificationsLink = wait.until(ExpectedConditions.elementToBeClickable(qualificationsLinkLocator));
		qualificationsLink.click();
	}
	
	public void clickOnNationalities()
	{
		WaitUtils.pause(5);   // 5 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement nationalitiesLink = wait.until(ExpectedConditions.elementToBeClickable(nationalitiesLinkLocator));
		nationalitiesLink.click();
	}
	
	public void clickOnCorporateBranding()
	{
		WaitUtils.pause(5);   // 5 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement corporatebrandingLink = wait.until(ExpectedConditions.elementToBeClickable(corporatebrandingLinkLocator));
		corporatebrandingLink.click();
	}
	
	public void clickOnConfiguration()
	{
		WaitUtils.pause(5);   // 5 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement configurationLink = wait.until(ExpectedConditions.elementToBeClickable(configurationLinkLocator));
		configurationLink.click();
	}
	
	public void clickOnHelpIcon()
	{
		WaitUtils.pause(5);   // 5 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement helpIconLink = wait.until(ExpectedConditions.elementToBeClickable(helpIconLocator));
		helpIconLink.click();
	}
	
	/* As of now we didn't use this method */
	public void clickOnBuzzPageLink()
	{
		WaitUtils.pause(5);   // 5 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement buzzpageLink = wait.until(ExpectedConditions.elementToBeClickable(buzzLinkLocator));
		buzzpageLink.click();
	}
}
