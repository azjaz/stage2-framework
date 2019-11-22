package pricingCalculatorTestFramework.page;

import org.openqa.selenium.WebDriver;


public abstract class AbstractCorePage {

    protected final int DRIVER_TIMEOUT = 15;
    protected WebDriver driver;



    protected AbstractCorePage(WebDriver driver) {
        this.driver = driver;
    }



}
