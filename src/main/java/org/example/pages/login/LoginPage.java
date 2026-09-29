package org.example.pages.login;

import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private final By userNameField=By.id("user-name");
    private final By passwordField=By.id("password");
    private final By loginButton=By.id("login-button");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUserNameField() {
        return findElement(userNameField);
    }

    public WebElement getPasswordField() {
        return findElement(passwordField);
    }

    public WebElement getLoginButton() {
        return findElement(loginButton);
    }

    public void enterUserName(String userName){
        getUserNameField().sendKeys(userName);
    }
    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }
    public void enterLoginButton(){
        getLoginButton().click();
    }




}
