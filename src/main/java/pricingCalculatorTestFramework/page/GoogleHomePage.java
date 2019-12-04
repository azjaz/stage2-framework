package pricingCalculatorTestFramework.page;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage extends AbstractCorePage {

    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//div[@id='searchbox']/input[@name='q']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@class='gs-title']//a[@href='https://cloud.google.com/products/calculator/']/b[text()='Google Cloud Platform Pricing Calculator']")
    private WebElement searchResult;

    @FindBy(xpath = "//a[contains(@class,'cloud-free-trial-button')]")
    private WebElement getStartedForFreeButton;

    @FindBy(xpath = "//a[@data-label='Tab: Getting started']")
    private WebElement gettingStartedLink;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public GoogleHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, DRIVER_TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(searchInput));
        return this;
    }
    public GoogleHomePage searchForTerm(String termToSearch) {
        searchInput.click();
        searchInput.sendKeys(termToSearch);
        searchInput.sendKeys(Keys.ENTER);
        return this;
    }
    public CloudPricingCalcPage clickOnRequiredLink() {
        WebDriverWait wait = new WebDriverWait(driver, DRIVER_TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(searchResult))
                .click();
        logger.info("Shifting on Pricing Calc Page was performed");
        return new CloudPricingCalcPage(driver);
    }
    public GoogleAccountLoginPage pressGetStartedForFreeButton() {
        getStartedForFreeButton.click();
        return new GoogleAccountLoginPage(driver);
    }
    public GoogleAccountLoginPage pressGettingStartedLink() {
        gettingStartedLink.click();
        new WebDriverWait(driver, DRIVER_TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@track-name='console']/span")))
                .click();
        return new GoogleAccountLoginPage(driver);
    }

}
