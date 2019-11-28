package pricingCalculatorTestFramework.models.VirtualMachine;

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
    @FindBy(xpath = "//input[@id='input_53']")
    protected WebElement numberOfInstances;

    @FindBy(xpath = "//input[@id='input_54']")
    protected WebElement purposeOfInstances;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_46']")
    protected WebElement softwareType;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_47']")
    protected WebElement vMachineClass;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_49']")
    protected WebElement vMachineType;
// gpu
    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuCount')]")
    protected WebElement numberOfGPUs;

    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuType')]")
    protected WebElement gpuTypeSelect;

// gpu
    @FindBy(xpath = "//md-select-value[@id='select_value_label_50']")
    protected WebElement localSSDSize;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_51']")
    protected WebElement datacenterLocation;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_52']")
    protected WebElement committedUsageTerm;
}
