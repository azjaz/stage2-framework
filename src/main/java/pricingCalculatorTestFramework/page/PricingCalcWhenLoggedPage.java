package pricingCalculatorTestFramework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricingCalcWhenLoggedPage extends AbstractCorePage {
    public PricingCalcWhenLoggedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

}
