package main;

import driver.Driver;

import pages.LoginPage;

import org.openqa.selenium.WebDriver;
/**
 * <pre>
 * Title: Main
 * Date: Jul 10, 2018
 * </pre>
 * @author ekin
 */
public class Main {
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        WebDriver driver = Driver.get("https://mail.ru");  
        LoginPage loginPage = new LoginPage(driver); 
        loginPage.typeUsername("test@mail.ru")
        .typePassword("password")
        .submitLogin()
        .buttonClickNewMessage()
        .setFieldTo("test@mail.ru")
        .setSubject("Test")
        .setBody("This is a test message.")
        .send();
    }
}
