package pricingCalculatorTestFramework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public abstract class AbstractCorePage {

    protected static final String HOMEPAGE_URL = "https://cloud.google.com/";
    protected static final String EMAIL_CREATOR_PAGE = "https://10minutemail.com";
    protected final int DRIVER_TIMEOUT = 15;
    protected WebDriver driver;
    protected WebElement googleFrame = driver.findElement(By.xpath("//iframe[contains(@src,'cloudpricingcalculator')]"));

    protected AbstractCorePage(WebDriver driver) {
        this.driver = driver;
    }



}
