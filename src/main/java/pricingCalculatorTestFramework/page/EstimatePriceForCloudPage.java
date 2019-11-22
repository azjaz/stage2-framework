package pricingCalculatorTestFramework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EstimatePriceForCloudPage extends AbstractCorePage {
    public EstimatePriceForCloudPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = "//iframe[contains(@src,'cloudpricingcalculator')]")
    private WebElement googleFrame;

    @FindBy(xpath = "//a[contains(@class,'cloud-free-trial-button')]")
    private WebElement getStartedForFreeButton;

    @FindBy(xpath = "//a[@data-label='Sign in button']")
    private WebElement enterViaGoogleAccount;

    public String[] getTotalCostFromCalculator() {
        driver.switchTo().frame(googleFrame);
        String totalCostValue = driver.findElement(By.xpath("//h2[@class='md-title']/b")).getText();
        driver.switchTo().defaultContent();
        return totalCostValue.split(" ");
    }
    public GoogleAccountLoginPage pressGetStartedForFreeButton() {
        getStartedForFreeButton.click();
        return new GoogleAccountLoginPage(driver);
    }
    public GoogleAccountLoginPage loginToGoogleAccount() {
        enterViaGoogleAccount.click();
        return new GoogleAccountLoginPage(driver);
    }
}
