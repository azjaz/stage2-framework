package pricingCalculatorTestFramework.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ResultsOfCountingEstimateCostPage extends AbstractCorePage {

    private List<String> openedTabs;
    private final Logger logger = LogManager.getRootLogger();

    private String totalCostFromCalcXpath = "//h2[@class='md-title']/b";
    private String formForEmailXpath = "//form[@name='emailForm']//input[@type='email']";

    @FindBy(xpath = "//iframe[contains(@src,'cloudpricingcalculator')]")
    private WebElement googleFrame;

    @FindBy(xpath = "//button[contains(@aria-label,'Email') and contains(., 'Estimate')]")
    private WebElement emailEstimateButton;

    @FindBy(xpath = "//button[contains(@aria-label,'Send') and contains(., 'Email')]")
    WebElement sendEmailButton;

    @FindBy(xpath = "//div[@class='mail-address']/input[@id='mailAddress']")
    private WebElement emailAddress;

    @FindBy(xpath = "//h3[@id='ui-id-1']")
    private WebElement messageList;

    @FindBy(xpath = "//div[@id='Email']//table[@class='table']//h2")
    private WebElement totalCostInLetter;

    public ResultsOfCountingEstimateCostPage(WebDriver driver) {
        super(driver);
    }
    public String getTotalCostFromCalculator() {
        driver.switchTo().frame(googleFrame);
        String totalCostValue = driver.findElement(By.xpath(totalCostFromCalcXpath)).getText();
        driver.switchTo().defaultContent();
        logger.info("The total cost was got from calculator");
        return totalCostValue;
    }

    public ResultsOfCountingEstimateCostPage pressEmailEstimateButton() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithClick(emailEstimateButton);
        driver.switchTo().defaultContent();
        logger.info("'Email Estimate' button was pressed");
        return new ResultsOfCountingEstimateCostPage(driver);
    }
    public ResultsOfCountingEstimateCostPage fillEmailField() {
        ((JavascriptExecutor) driver).executeScript(String.format("window.open('%s');", EMAIL_CREATOR_PAGE));
        openedTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(openedTabs.get(1));
        String emailToPaste = waiter(emailAddress).getAttribute("value");
        driver.switchTo().window(openedTabs.get(0));

        driver.switchTo().frame(googleFrame);
        fillFieldsWithSendKeysValue(driver.findElement(By.xpath(formForEmailXpath)), emailToPaste);
        driver.switchTo().defaultContent();
        return this;
    }
    public ResultsOfCountingEstimateCostPage pressSendEmailButton() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithClick(sendEmailButton);
        driver.switchTo().defaultContent();
        logger.info("E-mail was sent");
        return this;
    }

    public ResultsOfCountingEstimateCostPage spinMessageList() {
        driver.switchTo().window(openedTabs.get(1));
        fillFieldsWithClick(messageList);
        return this;
    }

    public String[] getTotalCostFromTheLetter() {
        String costFromEmail = waiter(totalCostInLetter).getText();
        logger.info("Total cost from letter is present");
        return costFromEmail.split(" ");
    }
}
