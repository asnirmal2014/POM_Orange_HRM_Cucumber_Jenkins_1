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

public class Admin_Page 
{
	public WebDriver driver = null;
   
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
    By jobLinkLocator = By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='User Management']");
	
    
	public void clickOnUserMgmt()
    {
		WaitUtils.pause(5);   // 5 seconds
		
		System.out.println("Current URL: " + driver.getCurrentUrl());
		System.out.println("Page title: " + driver.getTitle());
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usermgmtLink = wait.until(ExpectedConditions.elementToBeClickable(usermgmtLinkLocator));
        usermgmtLink.click();
    }
}

