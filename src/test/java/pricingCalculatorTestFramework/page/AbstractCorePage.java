package pricingCalculatorTestFramework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AbstractCorePage {

    protected static final String HOMEPAGE_URL = "https://cloud.google.com/";
    protected static final String EMAIL_CREATOR_PAGE = "https://10minutemail.com";
    protected final int DRIVER_TIMEOUT = 30;
    protected WebDriver driver;

    private static final String JS_CLICK = "arguments[0].click();";

    protected AbstractCorePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void fillFieldsWithClick(WebElement element) {
        waiter(element);
        ((JavascriptExecutor) driver).executeScript(JS_CLICK, element);
    }
    protected void fillFieldsWithDroppedList(WebElement element, String itemXpath) {
        waiter(element);
        fillFieldsWithClick(element);
        ((JavascriptExecutor) driver).executeScript(JS_CLICK, driver.findElement(By.xpath(itemXpath)));
    }
    protected void fillFieldsWithSendKeysValue(WebElement element, String key) {
        waiter(element).sendKeys(key);
    }

    protected WebElement waiter(WebElement element) {
        return new WebDriverWait(driver, DRIVER_TIMEOUT)
                .until(ExpectedConditions.visibilityOf(element));
    }

}
