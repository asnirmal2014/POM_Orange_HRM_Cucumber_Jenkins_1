package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.WaitUtils;

public class Login_Page 
{
	public WebDriver driver = null;
   
    public Login_Page(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
    @FindBy(how = How.NAME, using = "username") WebElement un;
    @FindBy(how = How.NAME, using = "password") WebElement pwd;
    @FindBy(how = How.XPATH, using = "//div[@class='oxd-form-actions orangehrm-login-action']") WebElement lgnbtn;
        
    public void setUserName(String username)
    {
    	un.sendKeys(username);
    }
    
    public void setPassword(String password)
    {
    	pwd.sendKeys(password);
    }
    
    public void clickOnLoginButton()
    {
    	WaitUtils.pause(5);   // 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lgnbtn));
        lgnbtn.click();
    }
}
