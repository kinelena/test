package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

/**
 * <pre>
 * Title: LoginPage
 * Date: Jul 10, 2018
 * </pre>
 * @author ekin
 */
public class LoginPage
{
    private final WebDriver driver;
    private final static By loginLocator = By.id("mailbox:login");
    private final static By passwordLocator = By.id("mailbox:password");
    private final static By loginButtonLocator = By.id("mailbox:submit");
    
    /**
     * @param driver
     */
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    /**
     * @param username
     * @return loginPage
     */
    public LoginPage typeUsername(String username) 
    {
        driver.findElement(loginLocator).sendKeys(username);
        return this;    
    }
    
    /**
     * @param password
     * @return loginPage
     */
    public LoginPage typePassword(String password) 
    {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;    
    }
    
    /**
     * @return homePage
     */
    public HomePage submitLogin() {
        driver.findElement(loginButtonLocator).submit();
        return new HomePage(driver);    
    }
    
}

