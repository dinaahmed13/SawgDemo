import org.example.pages.Checkout.CheckoutPage;
import org.example.pages.cart.CartPage;
import org.example.pages.login.LoginPage;
import org.example.pages.product.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class AddToCard{
    WebDriver driver;
    SoftAssert softAssert;
    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @BeforeTest
    public void setUp(){
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        softAssert = new SoftAssert();
        loginPage=new LoginPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage= new CheckoutPage(driver);
    }

    /*


        loginPage.enterUserName(Username);
        loginPage.enterPassword(Password);
        loginPage.enterLoginButton();

        String title=productPage.enterTitle();

    * */

    @Test(dataProvider = "credentialsChekOut",dataProviderClass =DataProvidorTest.class)
    public void validAddToCard(String Username, String Password,String Firstname,String Lastname,String PostalCode){


        loginPage.enterUserName(Username);
        loginPage.enterPassword(Password);
        loginPage.enterLoginButton();
        productPage.clickSauceLabsBackpackProduct();
        productPage.clickOfAddToCart();
        cartPage.clickShoppingCartLink();
        cartPage.clickOnCheckoutButton();
        checkoutPage.enterFirstName(Firstname);
        checkoutPage.enterLastName(Lastname);
        checkoutPage.enterPostalCode(PostalCode);
        checkoutPage.enterContinueButton();
        checkoutPage.clickCheckoutFinishButton();
        String header = checkoutPage.getTextCompleteHeader();
        Assert.assertEquals(header, "Thank you for your order!");


    }

    @Test(priority=1,dataProvider = "credentials",dataProviderClass =DataProvidorTest.class)
    public void multipleValidAddToCart(String Username, String Password){
        loginPage.enterUserName(Username);
        loginPage.enterPassword(Password);
        loginPage.enterLoginButton();
        List<String> productsName=List.of("jacket","t-shirt","backpack");
        List<WebElement> products =productPage.getAddToCartButtons();
        List<Integer> countAndCountCar= cartPage.multipleAddToCart(productsName,products);
        softAssert.assertEquals(countAndCountCar.get(1), countAndCountCar.get(0));
        cartPage.clickShoppingCartLink();

        List<WebElement> productsInCart = productPage.getAddRemoveButtons();
        System.out.println("==========="+productsInCart.size());

    }
}
