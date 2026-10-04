package tests;

import base.BaseTest;
import org.example.pages.Checkout.CheckoutPage;
import org.example.pages.cart.CartPage;
import org.example.pages.login.LoginPage;
import org.example.pages.product.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

public class InValidScripts extends BaseTest {
    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;




    @Test(dataProvider = "credentials",dataProviderClass = DataProvidorTest.class)
    public void inValidCartCheckout(String Username, String Password){
        loginPage=new LoginPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage= new CheckoutPage(driver);

        loginPage.enterUserName(Username);
        loginPage.enterPassword(Password);
        loginPage.clickLoginButton();
        cartPage.clickShoppingCartLink();
        checkoutPage.clickCheckoutButton();
        String header = checkoutPage.enterCheckoutSpan();
        Assert.assertEquals(header, "Checkout: Your Information");
    }

    @Test(dataProvider = "credentials",dataProviderClass =DataProvidorTest.class)
    public void inValidCheckoutWithNoData(String Username, String Password){
//        loginPage=new LoginPage(driver);
//        cartPage = new CartPage(driver);
//        checkoutPage= new CheckoutPage(driver);

        loginPage.enterUserName(Username);
        loginPage.enterPassword(Password);
        loginPage.clickLoginButton();
        cartPage.clickShoppingCartLink();
        cartPage.clickOnCheckoutButton();
        checkoutPage.clickContinueButton();
       Assert.assertTrue(checkoutPage.getErrorH3().isDisplayed());
    }

    @Test(dataProvider = "credentials",dataProviderClass =DataProvidorTest.class)
    public void inValidCheckoutWithSomeData(String Username, String Password){
        driver.findElement(By.id("user-name")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("login-button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Sauce Labs Backpack']"))).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Checkout']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name"))).sendKeys("dina");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("continue"))).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed());

    }

    @Test(dataProvider = "credentials",dataProviderClass =DataProvidorTest.class)
    public void inValidContinueShopping(String Username, String Password){
        driver.findElement(By.id("user-name")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Sauce Labs Backpack']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("shopping_cart_link"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("continue-shopping"))).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']"))).isDisplayed());
    }

}
