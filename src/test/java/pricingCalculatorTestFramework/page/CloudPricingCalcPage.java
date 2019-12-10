package pricingCalculatorTestFramework.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pricingCalculatorTestFramework.utils.GPUConfig;


public class CloudPricingCalcPage extends AbstractCorePage {

    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//iframe[contains(@src,'cloudpricingcalculator')]")
    private WebElement googleFrame;

    @FindBy(xpath = "//md-tab-item/div[contains(@class,'compute')]")
    private WebElement computeEngineBlock;

    @FindBy(xpath = "//input[contains(@ng-model,'.quantity')]")
    private WebElement numberOfInstances;

    @FindBy(xpath = "//input[contains(@ng-model,'computeServer.label')]")
    private WebElement purposeOfInstances;

    @FindBy(xpath = "//md-select[contains(@ng-model,'computeServer.os')]")
    private WebElement softwareType;

    @FindBy(xpath = "//md-select[contains(@ng-model,'computeServer.class')]")
    private WebElement vMachineClass;

    @FindBy(xpath = "//md-select[contains(@ng-model,'computeServer.family')]")
    private WebElement vMachineType;

    @FindBy(xpath = "//md-checkbox[contains(@ng-model, 'computeServer.addGPUs')]")
    protected WebElement addGPUsCheckbox;

    @FindBy(xpath = "//md-select[contains(@ng-model,'computeServer.ssd')]")
    private WebElement localSSDSize;

    @FindBy(xpath = "//md-select[contains(@ng-model,'computeServer.location')]")
    private WebElement datacenterLocation;

    @FindBy(xpath = "//md-select[contains(@ng-model,'computeServer.cud')]")
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
        logger.info("The 'Compute Engine Block' was activated");
        return this;
    }
    public CloudPricingCalcPage fillNumberOfInstancesField(String number)  {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithSendKeysValue(numberOfInstances, number);
        driver.switchTo().defaultContent();
        logger.info("Number of instances was input");
        return this;
    }
    public CloudPricingCalcPage fillPurposeOfInstancesBlock(String purpose) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithSendKeysValue(purposeOfInstances, purpose);
        driver.switchTo().defaultContent();
        logger.info("VM purpose was defined");
        return this;
    }
    public CloudPricingCalcPage chooseSoftwareBlock(String OSType) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(softwareType, OSType);
        driver.switchTo().defaultContent();
        logger.info("OS was chosen");
        return this;
    }
    public CloudPricingCalcPage chooseVMachineClassBlock(String vmClass) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(vMachineClass, vmClass);
        driver.switchTo().defaultContent();
        logger.info("VM class was chosen");
        return this;
    }
    public CloudPricingCalcPage chooseMachineTypeBlock(String vmType) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(vMachineType, vmType);
        driver.switchTo().defaultContent();
        logger.info("VM type was chosen");
        return this;
    }
    public CloudPricingCalcPage chooseGPUTypeBlock(String numberOfGPUs, String typeOfGPU) {
        driver.switchTo().frame(googleFrame);
        if(addGPUsCheckbox.getAttribute("aria-disabled").equals("false")) {
            if(!addGPUsCheckbox.isSelected()) {
                fillFieldsWithClick(addGPUsCheckbox);
            }
            GPUConfig config = new GPUConfig();
            fillFieldsWithSendKeysValue(driver.findElement(By.xpath(config.getNumberOfGPUs())), numberOfGPUs);
            fillFieldsWithDroppedList(driver.findElement(By.xpath(config.getGpuTypeSelect())), typeOfGPU);
        }
        driver.switchTo().defaultContent();
        logger.info("GPU block was defined");
        return this;
    }
    public CloudPricingCalcPage chooseLocalSSDBlock(String SSDSize) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(localSSDSize, SSDSize);
        driver.switchTo().defaultContent();
        logger.info("SSD size was chosen");
        return this;
    }
    public CloudPricingCalcPage chooseDatacenterLocationBlock(String dataCenter) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(datacenterLocation, dataCenter);
        driver.switchTo().defaultContent();
        logger.info("Datacenter was chosen");
        return this;
    }
    public CloudPricingCalcPage chooseCommittedUsageBlock(String usageTerm) {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithDroppedList(committedUsageTerm, usageTerm);
        driver.switchTo().defaultContent();
        logger.info("Usage term was chosen");
        return this;
    }
    public ResultsOfCountingEstimateCostPage pressAddToEstimateButton() {
        driver.switchTo().frame(googleFrame);
        fillFieldsWithClick(addToEstimateButton);
        driver.switchTo().defaultContent();
        logger.info("The 'Add To Estimate' button was pressed");
        return new ResultsOfCountingEstimateCostPage(driver);
    }

}
