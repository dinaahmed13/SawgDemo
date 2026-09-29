import org.example.pages.login.LoginPage;
import org.example.pages.product.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class LoginTest {
    ChromeDriver driver;

    @BeforeMethod
    public void setUp(){
        ChromeOptions  chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @DataProvider(name = "credentials")
    public Object[][] getData() {
        return new Object[][] {
                {"standard_user", "secret_sauce"}
        };
    }

    @Test(dataProvider = "credentials",dataProviderClass =DataProvidorTest.class)
   public void validLoginTestInChrome(String Username, String Password){

        LoginPage loginPage=new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        loginPage.enterUserName(Username);
        loginPage.enterPassword(Password);
        loginPage.enterLoginButton();

        String title=productPage.enterTitle();
        Assert.assertEquals(title,"Products");

   }

}
