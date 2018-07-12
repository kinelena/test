package sendMessageTest;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import driver.Driver;
import pages.LoginPage;

/**
 * <pre>
 * Title: Test
 * Date: Jul 11, 2018
 * </pre>
 * @author ekin
 */
public class sendMessageTest
{
    WebDriver driver;
    LoginPage loginPage;
    
    /**
     * test
     */
    @Test
    public void test()
    {
       loginPage.typeUsername("test@mail.ru")
                .typePassword("password")
                .submitLogin()
                .buttonClickNewMessage()
                .setFieldTo("test@mail.ru")
                .setSubject("Test")
                .setBody("This is a test message.")
                .send();
    }
    
    /**
     * before
     */
    @Before
    public void before()
    {
        driver = Driver.get("http://mail.ru");
        loginPage = new LoginPage(driver);
    }
    
    /**
     * after
     */
    @After
    public void after()
    {
        driver.quit();
    }

}

