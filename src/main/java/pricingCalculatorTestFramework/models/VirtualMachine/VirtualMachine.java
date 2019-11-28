package pricingCalculatorTestFramework.models.VirtualMachine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualMachine {
    protected WebDriver driver;

    public VirtualMachine(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//    @FindBy(xpath = "//input[@id='input_53']")
    private WebElement numberOfInstances = driver.findElement(By.xpath("//input[@id='input_53']"));

    @FindBy(xpath = "//input[@id='input_54']")
    private WebElement purposeOfInstances;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_46']")
    private WebElement softwareType;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_47']")
    private WebElement vMachineClass;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_49']")
    private WebElement vMachineType;
// gpu
//    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuCount')]")
//    protected WebElement numberOfGPUs;
//
//    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuType')]")
//    protected WebElement gpuTypeSelect;

// gpu
    @FindBy(xpath = "//md-select-value[@id='select_value_label_50']")
    private WebElement localSSDSize;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_51']")
    private WebElement datacenterLocation;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_52']")
    private WebElement committedUsageTerm;

    public WebElement getNumberOfInstances() {
        return numberOfInstances;
    }

    public WebElement getPurposeOfInstances() {
        return purposeOfInstances;
    }

    public WebElement getSoftwareType() {
        return softwareType;
    }

    public WebElement getvMachineClass() {
        return vMachineClass;
    }

    public WebElement getvMachineType() {
        return vMachineType;
    }

    public WebElement getLocalSSDSize() {
        return localSSDSize;
    }

    public WebElement getDatacenterLocation() {
        return datacenterLocation;
    }

    public WebElement getCommittedUsageTerm() {
        return committedUsageTerm;
    }
}
