package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Dashboard 
{
	public WebDriver driver = null;
	
	public Dashboard(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/*
	@FindBy(how = How.ID, using="welcome") WebElement profile;
	@FindBy(how = How.XPATH , using="//a[text()='Logout']") WebElement profilelogout;
	//@FindBy(how = How.XPATH , using="//*[@id=\"welcome-menu\"]/ul/li[2]/a") WebElement profilelogout;	
	*/
	
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

