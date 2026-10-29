package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.WaitUtils;

public class Logout_Page 
{
	public WebDriver driver = null;
	   
    public Logout_Page(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
    // Create the WebDriverWait once, reuse it
    private WebDriverWait wdWait()
    {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }

	@FindBy(how = How.XPATH, using="//img[@class='oxd-userdropdown-img']") WebElement profile;
	@FindBy(how = How.XPATH , using="//a[normalize-space()='Logout']") WebElement profilelogout;
	
	public void clickOnProfile()
    {
		System.out.println("Current URL: " + driver.getCurrentUrl());
		System.out.println("Page title: " + driver.getTitle());
		
		WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(profile));
        profile.click();
    }

    public void clickOnProfileLogOut()
    {
    	WaitUtils.pause(5);   // 5 seconds
    	
		/*
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(profilelogout));
		 profilelogout.click();
		*/
    	
    	/* [OR] */
        
        WebElement we = wdWait().until(ExpectedConditions.elementToBeClickable(profilelogout));
        we.click();
    }
}
