package pricingCalculatorTestFramework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CloudPricingCalcPage extends AbstractCorePage {
//    protected WebElement googleFrame = driver.findElement(By.xpath("//iframe[contains(@src,'cloudpricingcalculator')]"));
    @FindBy(xpath = "//iframe[contains(@src,'cloudpricingcalculator')]")
    private WebElement googleFrame;

    @FindBy(xpath = "//md-tab-item/div[contains(@class,'compute')]")
    private WebElement computeEngineBlock;

    @FindBy(xpath = "//input[@id='input_53']")
    private WebElement numberOfInstances;

    @FindBy(xpath = "//input[@id='input_54']")
    private WebElement purposeOfInstances;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_46']")
    private WebElement softwareType;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_47']")
    private WebElement vMachineClass;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_49']")
    private WebElement vMachineType;

    @FindBy(xpath = "//md-checkbox[contains(@ng-model, 'computeServer.addGPUs')]")
    private WebElement addGPUsCheckbox;

    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuCount')]")
    private WebElement numberOfGPUs;

    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuType')]")
    private WebElement gpuTypeSelect;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_50']")
    private WebElement localSSDSize;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_51']")
    private WebElement datacenterLocation;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_52']")
    private WebElement committedUsageTerm;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']//button[contains(text(),'Add') and contains(text(),'Estimate')]")
    private WebElement addToEstimateButton;

    public CloudPricingCalcPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public CloudPricingCalcPage activateComputeEngineBlock() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithClick(computeEngineBlock);
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage fillNumberOfInstancesField()  {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithSendKeysValue(numberOfInstances, "4");
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage fillPurposeOfInstancesBlock() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithSendKeysValue(purposeOfInstances, "");
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseSoftwareBlock() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(softwareType, By.xpath("//md-option[contains(@value,'free')]"));
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseVMachineClassBlock() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(vMachineClass, By.xpath("//md-option[contains(@id,'select_option_67')]"));
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseMachineTypeBlock() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(vMachineType, By.xpath("//md-option[contains(@value,'STANDARD-8')]"));
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseGPUTypeBlock() {
        driver.switchTo().frame(googleFrame);
        if(addGPUsCheckbox.getAttribute("aria-disabled").equals("false")) {
            if(!addGPUsCheckbox.isSelected()) {
                fillFieldsWithClick(addGPUsCheckbox);
            }
            fillFieldsWithSendKeysValue(numberOfGPUs, "1");
            fillFieldsWithDroppedList(gpuTypeSelect, By.xpath("//md-option[contains(@value,'TESLA_V100')]"));
        }
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseLocalSSDBlock() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(localSSDSize, By.xpath("//md-option[contains(@id,'select_option_172')]"));
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseDatacenterLocationBlock() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(datacenterLocation, By.xpath("//md-option[contains(@id,'select_option_185')]"));
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseCommittedUsageBlock() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(committedUsageTerm, By.xpath("//md-option[contains(@id,'select_option_83')]"));
        driver.switchTo().defaultContent();
        return this;
    }
    public ResultsOfCountingEstimateCostPage pressAddToEstimateButton() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithClick(addToEstimateButton);
        driver.switchTo().defaultContent();
        return new ResultsOfCountingEstimateCostPage(driver);
    }

}
