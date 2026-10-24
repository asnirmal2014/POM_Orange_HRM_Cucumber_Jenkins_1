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
		// Timeout 30s (must be LONGER than the 10s delay) + poll every 500ms
		WebDriverWait customWait = new WebDriverWait(driver, Duration.ofSeconds(30), Duration.ofMillis(500));
		
		// STEP 1: Fixed 10-second delay, expressed through the wait API
		final long startTime = System.currentTimeMillis();
		customWait.until(d -> System.currentTimeMillis() - startTime >= 10_000);
		
		// STEP 2: Real condition - link must exist, be visible and be enabled
		WebElement pimLink = customWait.until(ExpectedConditions.elementToBeClickable(pimPageLink));
		
		// STEP 3: Click the element returned by the wait
		pimLink.click();
	}
}