package pricingCalculatorTestFramework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ResultsOfCountingEstimateCostPage extends AbstractCorePage {

    private List<String> openedTabs;

    @FindBy(xpath = "//iframe[contains(@src,'cloudpricingcalculator')]")
    private WebElement googleFrame;
//    protected WebElement googleFrame = driver.findElement(By.xpath("//iframe[contains(@src,'cloudpricingcalculator')]"));
    @FindBy(xpath = "//button[contains(@aria-label,'Email') and contains(., 'Estimate')]")
    private WebElement emailEstimateButton;



    @FindBy(xpath = "//button[contains(@aria-label,'Send') and contains(., 'Email')]")
    WebElement sendEmailButton;

    @FindBy(xpath = "//div[@class='mail-address']/input[@id='mailAddress']")
    private WebElement emailAddress;

    @FindBy(xpath = "//h3[@id='ui-id-1']")
    WebElement messageList;

    @FindBy(xpath = "//div[@id='Email']//table[@class='table']//h2")
    private WebElement totalCostInLetter;

    public ResultsOfCountingEstimateCostPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public String[] getTotalCostFromCalculator() {
        driver.switchTo().frame(googleFrame);
        String totalCostValue = driver.findElement(By.xpath("//h2[@class='md-title']/b")).getText();
        driver.switchTo().defaultContent();
        return totalCostValue.split(" ");
    }

    public ResultsOfCountingEstimateCostPage pressEmailEstimateButton() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithClick(emailEstimateButton);
        driver.switchTo().defaultContent();
        return new ResultsOfCountingEstimateCostPage(driver);
    }
    public ResultsOfCountingEstimateCostPage fillEmailField() {
        ((JavascriptExecutor) driver).executeScript(String.format("window.open('%s');", EMAIL_CREATOR_PAGE));
        openedTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(openedTabs.get(1));
        String emailToPaste = new WebDriverWait(driver, DRIVER_TIMEOUT)
                .until(ExpectedConditions.visibilityOf(emailAddress))
                .getAttribute("value");
        driver.switchTo().window(openedTabs.get(0));

        driver.switchTo().frame(googleFrame);
        fillFieldsWithSendKeysValue(driver.findElement(By.xpath("//form[@name='emailForm']//input[@type='email']")), emailToPaste);
        driver.switchTo().defaultContent();
        return this;
    }
    public ResultsOfCountingEstimateCostPage pressSendEmailButton() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithClick(sendEmailButton);
        driver.switchTo().defaultContent();
        return this;
    }

    public ResultsOfCountingEstimateCostPage spinMessageList() {
        driver.switchTo().window(openedTabs.get(1));
        fillFieldsWithClick(messageList);
        return this;
    }

    public String[] getTotalCostFromTheLetter() {
        String costFromEmail = new WebDriverWait(driver, DRIVER_TIMEOUT)
                .until(ExpectedConditions.visibilityOf(totalCostInLetter))
                .getText();
        return costFromEmail.split(" ");
    }
    public boolean isTotalCostCalculated() {
        driver.switchTo().frame(googleFrame);
        List<WebElement> totalCostCalculated = driver.findElements(By.xpath("//h2[@class='md-title']/b"));
        driver.switchTo().defaultContent();
        return totalCostCalculated.size() > 0;
    }
}
