package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard 
{
	public WebDriver driver = null;
	
	public Dashboard(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//div[@class='oxd-sidepanel-body']//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and normalize-space()='PIM']") WebElement pimPageLink;
	
	public void clickOnPIMPageLink()
	{
		WebDriverWait customWait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(500));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pimPageLink));
        pimPageLink.click();
	}
}
