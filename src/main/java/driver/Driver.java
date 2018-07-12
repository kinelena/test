package driver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * <pre>
 * Title: Driver
 * Date: Jul 10, 2018
 * </pre>
 * @author ekin
 */
public class Driver
{
     /**
     * @param URL
     * @return driver
     */
    public static WebDriver get(String URL)
     {
         System.setProperty("webdriver.chrome.driver", "/sendMailTest/src/main/resources/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get(URL);
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         return driver;
     }
}

