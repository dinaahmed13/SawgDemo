package org.example.pages.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private Logger log= LogManager.getLogger(LoginPage.class);
    private final By userNameField=By.id("user-name");
    private final By passwordField=By.id("password");
    private final By loginButton=By.id("login-button");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUserNameField() {
        log.info("Getting username field");
        return findElement(userNameField);
    }

    public WebElement getPasswordField() {
        log.info("Getting password field");
        return findElement(passwordField);
    }

    public WebElement getLoginButton() {
        log.info("Getting login button");
        return findElement(loginButton);
    }

    public void enterUserName(String userName){
        getUserNameField().sendKeys(userName);
        log.debug("Enter username {}",userName);
    }
    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
        log.debug("Enter password {}",password);
    }
    public void clickLoginButton(){
        log.info("Click Login Button");
        getLoginButton().click();
    }
}
