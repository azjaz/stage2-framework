package pricingCalculatorTestFramework.page;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends AbstractCorePage {

    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//div[@id='searchbox']/input[@name='q']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@class='gs-title']//a[@href='https://cloud.google.com/products/calculator/']/b[text()='Google Cloud Platform Pricing Calculator']")
    private WebElement searchResult;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public GoogleHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        waiter(searchInput);
        return this;
    }
    public GoogleHomePage searchForTerm(String termToSearch) {
        searchInput.click();
        searchInput.sendKeys(termToSearch);
        searchInput.sendKeys(Keys.ENTER);
        return this;
    }
    public CloudPricingCalcPage clickOnRequiredLink() {
        waiter(searchResult).click();
        logger.info("Shifting on Pricing Calc Page was performed");
        return new CloudPricingCalcPage(driver);
    }

}
