package pricingCalculatorTestFramework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GetTrialForFreePage extends AbstractCorePage {

    private final By termsCheckBox = By.xpath("//label[@class='mat-checkbox-layout']//a[contains(@href, 'terms/free-trial')]");

    @FindBy(xpath = "//div[@class='cfc-getting-started-top-content']//button")
    private WebElement tryFreeTrialButton;

    public GetTrialForFreePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public GetTrialForFreePage pressGetTrialButton() {
        fillFieldsWithClick(tryFreeTrialButton);
//        tryFreeTrialButton.click();
        return this;
    }
    public List<WebElement> presenceOfCheckBoxWithTerms() {
        return new WebDriverWait(driver, DRIVER_TIMEOUT)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(termsCheckBox));
    }
}
