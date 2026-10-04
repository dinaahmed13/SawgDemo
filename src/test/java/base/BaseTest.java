package base;

import io.qameta.allure.Allure;
import io.qameta.allure.model.TestResult;
import org.apache.logging.log4j.core.util.FileUtils;
import org.example.utils.ScreenShot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public SoftAssert softAssert;

    @BeforeMethod
    public void setUp(){
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        softAssert = new SoftAssert();
    }

    @AfterMethod
    public void failedTestCases(ITestResult result) throws IOException {
        if(result.getStatus() == ITestResult.FAILURE){
            File image= ScreenShot.screenShot(driver);
            FileInputStream fis= new FileInputStream(image);
            Allure.addAttachment("Faliure screenshot for TC:"+result.getTestName(),"image/png", fis,"png");
        }
    }




    }

