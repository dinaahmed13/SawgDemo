package org.example.pages.product;

import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class ProductPage extends BasePage {


    private final By title=By.className("title");
    private final By sauceLabsBackpackProduct=By.xpath("//div[text()='Sauce Labs Backpack']");
    private final By addToCart=By.xpath("//button[text()='Add to cart']");
    private final By addToCartButtons = By.xpath("//button[contains(text(),'Add to cart')]");
    private final By addRemoveButtons = By.xpath("//button[contains(text(),'Remove')]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTitle() {
        return findElement(title);
    }

    public String enterTitle(){
       return getTitle().getText();
    }
    public void clickSauceLabsBackpackProduct(){
         findElement(sauceLabsBackpackProduct).click();
    }
    public void clickOfAddToCart(){
        findElement(addToCart).click();
    }


    public List<WebElement> getAddToCartButtons(){
        return findElements(addToCartButtons);
    }

    public List<WebElement> getAddRemoveButtons(){
        return findElements(addRemoveButtons);
    }
}
