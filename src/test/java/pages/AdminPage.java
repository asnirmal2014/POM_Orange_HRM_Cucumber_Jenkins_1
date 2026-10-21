package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage 
{
	public WebDriver driver = null;
   
    public AdminPage(WebDriver driver) 
    {
    	this.driver = driver;
    }
    
    @FindBy(how = How.XPATH, using="//img[@class='oxd-userdropdown-img']") WebElement profile;
	@FindBy(how = How.XPATH , using="//a[normalize-space()='Logout']") WebElement profilelogout;
	
	public void clickOnProfile()
	{
		profile.click();
	}
	
	public void clickOnProfileLogOut()
	{
		profilelogout.click();
	}
}
