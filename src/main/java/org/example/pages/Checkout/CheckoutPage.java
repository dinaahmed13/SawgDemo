package org.example.pages.Checkout;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {
    Logger log = LogManager.getLogger(CheckoutPage.class);
    private final By checkoutButton=By.xpath("//button[text()='Checkout']");
    private final By checkoutSpan=By.xpath("//span[text()='Checkout: Your Information']");
    private final By continueButton=By.id("continue");
    private final By errorH3=By.xpath("//h3[@data-test='error']");
    private final By firstNameField=By.id("first-name");
    private final By lastNameField=By.id("last-name");
    private final By postalCodeField=By.id("postal-code");
    private final By checkoutFinishButton=By.xpath("//button[text()='Finish']");
    private final By completeHeader=By.className("complete-header");



    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCheckoutButton() {
        return findElement(checkoutButton);
    }

    public void clickCheckoutButton(){
        log.info("Click Checkout Button");
        getCheckoutButton().click();
    }

    public WebElement getCheckoutSpan() {
        return findElement(checkoutSpan);
    }

    public String enterCheckoutSpan(){
        log.info("Getting Checkout Span");
      return getCheckoutSpan().getText();
    }

    public WebElement getContinueButton() {
        log.info("Getting Continue Button");
        return findElement(continueButton);
    }

    public void clickContinueButton(){
        log.info("Click Continue Button");
        getContinueButton().click();
    }
    public WebElement getErrorH3() {
        log.info("Getting Error H3");
        return findElement(errorH3);
    }

    public void enterErrorH3(){
        getCheckoutButton().isDisplayed();
    }

    public WebElement getFirstNameField() {
        log.info("Getting First Name Field");
        return findElement(firstNameField);
    }
    public WebElement getPostalCodeField() {
        log.info("Getting Postal Code Field");
        return findElement(postalCodeField);
    }
    public WebElement getLastNameField() {
        log.info("Getting Last Name Field");
        return findElement(lastNameField);
    }

    public void enterFirstName(String firstname){
        log.debug("Enter firstname {}",firstname);
        getFirstNameField().sendKeys(firstname);
    }
    public void enterLastName(String lastname){
        log.debug("Enter lastname {}",lastname);
        getLastNameField().sendKeys(lastname);
    }
    public void enterPostalCode(String postalcode){
        log.debug("Enter postal code {}",postalcode);
        getPostalCodeField().sendKeys(postalcode);
    }

    public WebElement getCheckoutFinishButton() {
        log.info("Getting Checkout Finish Button");
        return findElement(checkoutFinishButton);
    }

    public void clickCheckoutFinishButton(){
        log.info("Click Checkout Finish Button");
        getCheckoutFinishButton().click();
    }
    public WebElement getCompleteHeader() {
        log.info("Getting Complete Header");
        return findElement(completeHeader);
    }
    public String getTextCompleteHeader(){
        log.info("Getting Text Complete Header");
         return getCompleteHeader().getText();
    }




}
