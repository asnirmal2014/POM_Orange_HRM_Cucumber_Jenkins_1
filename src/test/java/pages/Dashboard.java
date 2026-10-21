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
	
	@FindBy(how = How.XPATH, using="//div[@class='oxd-sidepanel-body']//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][text()='Admin']") WebElement adminPageLink;
	
	public void clickOnAdminPageLink()
	{
		adminPageLink.click();
	}
}


