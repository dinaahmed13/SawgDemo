package org.example.pages.product;

import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    private final By title=By.className("title");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTitle() {
        return findElement(title);
    }

    public String enterTitle(){
       return getTitle().getText();
    }

}
