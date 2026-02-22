package utils;

import org.openqa.selenium.*;
import base.DriverFactory;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static void capture(String fileName) {

        WebDriver driver = DriverFactory.getDriver();

        if (driver == null) {
            System.out.println("Driver is NULL. Screenshot not captured.");
            return;
        }

        try {

            TakesScreenshot ts = (TakesScreenshot) driver;

            File src = ts.getScreenshotAs(OutputType.FILE);

            File dest = new File("target/screenshots/" + fileName + ".png");

            FileUtils.copyFile(src, dest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}