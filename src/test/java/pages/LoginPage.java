package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	public WebDriver driver = null;
   
    public LoginPage(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
    @FindBy(how = How.NAME, using = "username") WebElement un;
    @FindBy(how = How.NAME, using = "password") WebElement pwd;
    @FindBy(how = How.XPATH, using = "//a[contains(@class,'oxd-userdropdown-link') and contains(text(),'Logout')]") WebElement lgnbtn;
    // @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement lgnbtn;
        
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lgnbtn));
        lgnbtn.click();
    }
}
