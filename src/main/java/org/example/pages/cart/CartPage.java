package org.example.pages.cart;

import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    private final By shoppingCartLink=By.className("shopping_cart_link");
    private final By checkoutButton=By.id("checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getShoppingCartLink() {
        return findElement(shoppingCartLink);
    }

    public void clickShoppingCartLink(){
         getShoppingCartLink().click();
    }
    public void clickOnCheckoutButton(){
        findElement(checkoutButton).click();
    }

    public List<Integer> multipleAddToCart(List<String> produtsName, List<WebElement> products){
        int count=0;

        for(String produtName:produtsName){
            for(WebElement product:products){
                String productID= product.getAttribute("id");
                if(productID.contains(produtName)){
                    product.click();
                    count++;
                    break;
                }
            }
        }

        int cartCount = Integer.parseInt(
                driver.findElement(By.className("shopping_cart_badge")).getText()
        );

        return List.of(count,cartCount);
    }



}
