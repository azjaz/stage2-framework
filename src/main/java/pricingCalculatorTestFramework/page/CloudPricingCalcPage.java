package pricingCalculatorTestFramework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pricingCalculatorTestFramework.services.GPUBlockCreator;


public class CloudPricingCalcPage extends AbstractCorePage {
//    protected WebElement googleFrame = driver.findElement(By.xpath("//iframe[contains(@src,'cloudpricingcalculator')]"));
    @FindBy(xpath = "//iframe[contains(@src,'cloudpricingcalculator')]")
    private WebElement googleFrame;

    @FindBy(xpath = "//md-tab-item/div[contains(@class,'compute')]")
    private WebElement computeEngineBlock;

//    @FindBy(xpath = "//input[@id='input_53']")
//    private WebElement numberOfInstances;
//
//    @FindBy(xpath = "//input[@id='input_54']")
//    private WebElement purposeOfInstances;
//
//    @FindBy(xpath = "//md-select-value[@id='select_value_label_46']")
//    private WebElement softwareType;
//
//    @FindBy(xpath = "//md-select-value[@id='select_value_label_47']")
//    private WebElement vMachineClass;
//
//    @FindBy(xpath = "//md-select-value[@id='select_value_label_49']")
//    private WebElement vMachineType;
//
    @FindBy(xpath = "//md-checkbox[contains(@ng-model, 'computeServer.addGPUs')]")
    protected WebElement addGPUsCheckbox;
//
//    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuCount')]")
//    private WebElement numberOfGPUs;
//
//    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuType')]")
//    private WebElement gpuTypeSelect;
//
//    @FindBy(xpath = "//md-select-value[@id='select_value_label_50']")
//    private WebElement localSSDSize;
//
//    @FindBy(xpath = "//md-select-value[@id='select_value_label_51']")
//    private WebElement datacenterLocation;
//
//    @FindBy(xpath = "//md-select-value[@id='select_value_label_52']")
//    private WebElement committedUsageTerm;

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
    public CloudPricingCalcPage fillNumberOfInstancesField(WebElement instancesNumber, String number)  {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithSendKeysValue(instancesNumber, number);
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage fillPurposeOfInstancesBlock(WebElement purposeOfInstances, String purpose) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithSendKeysValue(purposeOfInstances, purpose);
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseSoftwareBlock(WebElement softwareType, By type) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(softwareType, type);
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseVMachineClassBlock(WebElement vMachineClass, By vmClass) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(vMachineClass, vmClass);
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseMachineTypeBlock(WebElement vMachineType, By vmType) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(vMachineType, vmType);
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseGPUTypeBlock(String numberOfGPUs, By typeOfGPU) {
        driver.switchTo().frame(googleFrame);
        if(addGPUsCheckbox.getAttribute("aria-disabled").equals("false")) {
            if(!addGPUsCheckbox.isSelected()) {
                fillFieldsWithClick(addGPUsCheckbox);
            }
            GPUBlockCreator.createGPUConfig(driver, numberOfGPUs, typeOfGPU);
//            fillFieldsWithSendKeysValue(GPU.getNumberOfGPUs(), );
//            fillFieldsWithDroppedList(gpuTypeSelect, By.xpath("//md-option[contains(@value,'TESLA_V100')]"));
        }
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseLocalSSDBlock(WebElement localSSDSize, By SSDSize) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(localSSDSize, SSDSize);
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseDatacenterLocationBlock(WebElement datacenterLocation, By dataCenter) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(datacenterLocation, dataCenter);
        driver.switchTo().defaultContent();
        return this;
    }
    public CloudPricingCalcPage chooseCommittedUsageBlock(WebElement committedUsageTerm, By usageTerm) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(committedUsageTerm, usageTerm);
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
