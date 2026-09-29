package org.example.pages.Checkout;

import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {
    private final By checkoutButton=By.xpath("//button[text()='Checkout']");
    private final By checkoutSpan=By.xpath("//span[text()='Checkout: Your Information']");
    private final By continueButton=By.id("continue");
    private final By errorH3=By.xpath("//h3[@data-test='error']");


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getCheckoutButton() {
        return findElement(checkoutButton);
    }

    public void enterCheckoutButton(){
        getCheckoutButton().click();
    }

    public WebElement getCheckoutSpan() {
        return findElement(checkoutSpan);
    }

    public String enterCheckoutSpan(){
      return getCheckoutSpan().getText();
    }

    public WebElement getContinueButton() {
        return findElement(continueButton);
    }

    public void enterContinueButton(){
        getContinueButton().click();
    }
    public WebElement getErrorH3() {
        return findElement(errorH3);
    }

    public void enterErrorH3(){
        getCheckoutButton().isDisplayed();
    }


}
