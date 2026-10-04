package tests;
import base.BaseTest;

import org.example.pages.login.LoginPage;
import org.example.pages.product.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest  extends BaseTest {

    @Test(dataProvider = "credentials",dataProviderClass = DataProvidorTest.class)
   public void validLoginTestInChrome(String Username, String Password){
        LoginPage loginPage=new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        loginPage.enterUserName(Username);
        loginPage.enterPassword(Password);
        loginPage.clickLoginButton();

        String title=productPage.enterTitle();
        Assert.assertEquals(title,"Products");

   }

}
