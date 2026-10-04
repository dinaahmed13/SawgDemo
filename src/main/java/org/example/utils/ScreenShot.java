package org.example.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenShot {

    public static File screenShot(WebDriver driver){
        try{
            File image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            return image;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
      //  return null;
    }
}
