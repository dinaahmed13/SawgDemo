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

    public WebElement getFirstNameField() {
        return findElement(firstNameField);
    }
    public WebElement getPostalCodeField() {
        return findElement(postalCodeField);
    }
    public WebElement getLastNameField() {
        return findElement(lastNameField);
    }

    public void enterFirstName(String firstname){
        getFirstNameField().sendKeys(firstname);
    }
    public void enterLastName(String lastname){
        getLastNameField().sendKeys(lastname);
    }
    public void enterPostalCode(String postalcode){
        getPostalCodeField().sendKeys(postalcode);
    }

    public WebElement getCheckoutFinishButton() {
        return findElement(checkoutFinishButton);
    }

    public void clickCheckoutFinishButton(){
        getCheckoutFinishButton().click();
    }
    public WebElement getCompleteHeader() {
        return findElement(completeHeader);
    }
    public String getTextCompleteHeader(){
         return getCompleteHeader().getText();
    }



}
