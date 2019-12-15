package pricingCalculatorTestFramework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AbstractCorePage {

    protected static final String HOMEPAGE_URL = "https://cloud.google.com/";
    protected static final String EMAIL_CREATOR_PAGE = "https://10minutemail.com";
    protected final int DRIVER_TIMEOUT = 30;
    protected WebDriver driver;


    protected AbstractCorePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void fillFieldsWithClick(WebElement element) {
        new WebDriverWait(driver, DRIVER_TIMEOUT).until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
    protected void fillFieldsWithDroppedList(WebElement element, String itemXpath) {
        new WebDriverWait(driver, DRIVER_TIMEOUT).until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath(itemXpath)));
    }
    protected void fillFieldsWithSendKeysValue(WebElement element, String key) {
        new WebDriverWait(driver, DRIVER_TIMEOUT).until(ExpectedConditions.elementToBeClickable(element))
                .sendKeys(key);
    }



}
