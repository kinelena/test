package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * <pre>
 * Title: SendMailPage
 * Date: Jul 10, 2018
 * </pre>
 * @author ekin
 */
public class MailPage
{
    private final WebDriver driver;
    private final static By fieldToLocator = By.cssSelector("textarea.js-input.compose__labels__input");
    private final static By subjectLocator = By.name("Subject");
    private final static By bodyLocator = By.id("tinymce");
    private final static By sendButtonLocator = By.cssSelector("#b-toolbar__right > div:nth-child(3) > div > div:nth-child(2) > div.b-toolbar__item.b-toolbar__item_.b-toolbar__item_false > div");
    private final static By iFrameLocator = By.xpath("//iframe[contains(@id,'composeEditor_ifr')]");
    
    /**
     * @param driver
     */
    public MailPage(WebDriver driver)
    {
        this.driver = driver;
    }
    
    /**
     * @param email
     * @return mailPage
     */
    public MailPage setFieldTo(String email) 
    {
        driver.findElement(fieldToLocator).sendKeys(email);
        return this;
    }

    /**
     * @param subject
     * @return mailPage
     */
    public MailPage setSubject(String subject) 
    {
        driver.findElement(subjectLocator).sendKeys(subject);
        return this;
    }
    /**
     * @param message
     * @return mailPage
     */
    public MailPage setBody(String message) 
    {
        WebElement iFrame = driver.findElement(iFrameLocator);
        driver.switchTo().frame(iFrame);  
        driver.findElement(bodyLocator).sendKeys(message);
        driver.switchTo().defaultContent();
        return this;
    }

    /**
     * @return homePage
     */
    public HomePage send() 
    {
        driver.findElement(sendButtonLocator).click();
        return new HomePage(driver);
    }

}

