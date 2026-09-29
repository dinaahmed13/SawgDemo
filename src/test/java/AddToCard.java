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

    @BeforeTest
    public void setUp(){
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        softAssert = new SoftAssert();
    }

    @Test
    public void validAddToCard(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.xpath("//button[text()='Checkout']")).click();
        driver.findElement(By.id("first-name")).sendKeys("dina");
        driver.findElement(By.id("last-name")).sendKeys("ahmed");
        driver.findElement(By.id("postal-code")).sendKeys("11111");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.xpath("//button[text()='Finish']")).click();
        String header = driver.findElement(By.className("complete-header")).getText();

        Assert.assertEquals(header, "Thank you for your order!");


    }
    @Test(priority=1)
    public void multipleValidAddToCart(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        List<String> produtsName=List.of("jacket","t-shirt","backpack");
        List<WebElement> products = driver.findElements(
                By.xpath("//button[contains(text(),'Add to cart')]")
        );
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

        softAssert.assertEquals(cartCount, count);

        driver.findElement(By.className("shopping_cart_link")).click();
        List<WebElement> productsInCart = driver.findElements(
                By.xpath("//button[contains(text(),'Remove')]")
        );
        System.out.println("==========="+productsInCart.size());
        driver.close();
    }
}
