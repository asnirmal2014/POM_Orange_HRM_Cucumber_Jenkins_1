package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/* Only method calling happens in the Step Definition file and method definition happens in the Page files */
public class Login_Page 
{
    private WebDriver driver;
    private WebDriverWait wait;

    public Login_Page(WebDriver driver) 
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By username = By.name("username");
    private By password = By.name("password");
    private By loginButton = By.xpath("//button[normalize-space()='Login']");

    public void openLoginPage() 
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));
    }

    public void login(String user, String pass) 
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(pass);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        wait.until(ExpectedConditions.urlContains("/dashboard"));
    }

    public boolean isDashboardDisplayed() 
    {
        return wait.until(ExpectedConditions.urlContains("/dashboard"));
    }
}
