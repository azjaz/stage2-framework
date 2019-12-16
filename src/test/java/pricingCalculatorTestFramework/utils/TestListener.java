package pricingCalculatorTestFramework.utils;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import pricingCalculatorTestFramework.driver.DriverSingleton;

import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener implements ITestListener {
    private final Logger logger = LogManager.getRootLogger();

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        createScreenshot();
    }

    private void createScreenshot() {
        File screenShot = ((TakesScreenshot) DriverSingleton.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File("target\\screenshots\\" +
                    getCurrentTimeAsString() +
                    ".png"));
        } catch (IOException e) {
           logger.error("Filed to save screenshot: " + e.getLocalizedMessage());
        }
    }
    private String getCurrentTimeAsString() {
        return ZonedDateTime.now().format(DateTimeFormatter.ofPattern("uuuu-MM-dd_HH-mm-ss"));
    }
}
