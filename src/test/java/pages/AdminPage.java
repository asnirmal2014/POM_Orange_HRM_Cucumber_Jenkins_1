package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage 
{
	public WebDriver driver = null;
   
    public AdminPage(WebDriver driver) 
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(profile));
        profile.click();
    }

    public void clickOnProfileLogOut()
    {
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
