package org.example.pages.cart;

import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    private final By shoppingCartLink=By.className("shopping_cart_link");
    private final By checkoutButton=By.id("checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getShoppingCartLink() {
        return findElement(shoppingCartLink);
    }

    public void enterShoppingCartLink(){
         getShoppingCartLink().click();
    }
    public void clickOnCheckoutButton(){
        findElement(checkoutButton).click();
    }



}
