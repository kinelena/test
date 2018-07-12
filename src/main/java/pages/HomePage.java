package pages;

import pages.MailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * <pre>
 * Title: HomePageMailRu
 * Date: Jul 10, 2018
 * </pre>
 * @author ekin
 */
public class HomePage
{
    private final WebDriver driver;
    private static final By newMessageLocator = By.cssSelector("#b-toolbar__left > div > div > div.b-toolbar__group.b-toolbar__group_left > div > a");
    
    /**
     * @param driver
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    /**
     * @return mailPage
     */
    public MailPage buttonClickNewMessage(){
        driver.findElement(newMessageLocator).click();
        return new MailPage(driver);
    }
    
}

