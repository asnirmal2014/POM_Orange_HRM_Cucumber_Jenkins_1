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
public class Admin_Time_Page 
{
	public WebDriver driver = null;
	public WebDriverWait wait = null;
   
    public Admin_Time_Page(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
    // Create the WebDriverWait once, reuse it
    private WebDriverWait wdWait()
    {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    /*
    By adminLeaveSideMenuLinkLocator = By.xpath("//span[contains(@class,'oxd-text oxd-text--span oxd-main-menu-item--name') and normalize-space()='Leave']");
    By adminApplyLeaveLinkLocator = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='Apply']");
    By adminMyLeaveLinkLocator = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='My Leave']");
    By adminEntitlementsLinkLocator = By.xpath("//span[contains(@class,'oxd-topbar-body-nav-tab-item') and normalize-space()='Entitlements']");
    By adminReportsLinkLocator = By.xpath("//span[contains(@class,'oxd-topbar-body-nav-tab-item') and normalize-space()='Reports']");
    By adminConfigureLinkLocator = By.xpath("//span[contains(@class,'oxd-topbar-body-nav-tab-item') and normalize-space()='Configure']");
    By adminLeaveListLinkLocator = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='Leave List']");
    By adminAssignLeaveLinkLocator = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='Assign Leave']");
    
    public void clickOnAdminLeaveSideMenu()
    {
		WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminLeaveSideMenuLink = wait.until(ExpectedConditions.elementToBeClickable(adminLeaveSideMenuLinkLocator));
        adminLeaveSideMenuLink.click();
    }
    
    public void clickOnAdminApplyLeaveLink()
    {
		WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminApplyLeaveLink = wait.until(ExpectedConditions.elementToBeClickable(adminApplyLeaveLinkLocator));
        adminApplyLeaveLink.click();
    }
    
    public void clickOnAdminMyLeaveLink()
    {
		WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminMyLeaveLink = wait.until(ExpectedConditions.elementToBeClickable(adminMyLeaveLinkLocator));
        adminMyLeaveLink.click();
    }
    
    public void clickOnAdminEntitlementsLink()
    {
		WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminEntitlementsLink = wait.until(ExpectedConditions.elementToBeClickable(adminEntitlementsLinkLocator));
        adminEntitlementsLink.click();
    }
    
    public void clickOnAdminReportsLink()
    {
		WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminReportsLink = wait.until(ExpectedConditions.elementToBeClickable(adminReportsLinkLocator));
        adminReportsLink.click();
    }
    
    public void clickOnAdminConfigureLink()
    {
		WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminConfigureLink = wait.until(ExpectedConditions.elementToBeClickable(adminConfigureLinkLocator));
        adminConfigureLink.click();
    }
    
    public void clickOnAdminLeaveListLink()
    {
		WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminLeaveListLink = wait.until(ExpectedConditions.elementToBeClickable(adminLeaveListLinkLocator));
        adminLeaveListLink.click();
    }
    
    public void clickOnAdminAssignLeaveLink()
    {
		WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminAssignLeaveLink = wait.until(ExpectedConditions.elementToBeClickable(adminAssignLeaveLinkLocator));
        adminAssignLeaveLink.click();
    }
    */
    
    By adminTimeSideMenuLinkLocator = By.xpath("//span[contains(@class,'oxd-text oxd-text--span oxd-main-menu-item--name') and normalize-space()='Time']");
    
    public void clickOnAdminTimeSideMenu()
    {
		WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminTimeSideMenuLink = wait.until(ExpectedConditions.elementToBeClickable(adminTimeSideMenuLinkLocator));
        adminTimeSideMenuLink.click();
    }
}
