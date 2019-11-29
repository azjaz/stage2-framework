package pricingCalculatorTestFramework.models.VirtualMachine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualMachine {

//    protected WebDriver driver;
//
//    public VirtualMachine(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
    private String numberOfInstances = "//input[@id='input_53']";
    private String purposeOfInstances = "//input[@id='input_54']";
    private String softwareType = "//md-select-value[@id='select_value_label_46']";
    private String vMachineClass = "//md-select-value[@id='select_value_label_47']";
    private String vMachineType = "//md-select-value[@id='select_value_label_49']";
    private String localSSDSize = "//md-select-value[@id='select_value_label_50']";
    private String datacenterLocation = "//md-select-value[@id='select_value_label_51']";
    private String committedUsageTerm = "//md-select-value[@id='select_value_label_52']";
    private String addGPUsCheckbox = "//md-checkbox[contains(@ng-model, 'computeServer.addGPUs')]";
// gpu
//    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuCount')]")
//    protected WebElement numberOfGPUs;
//
//    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuType')]")
//    protected WebElement gpuTypeSelect;

// gpu


    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public String getPurposeOfInstances() {
        return purposeOfInstances;
    }

    public String getSoftwareType() {
        return softwareType;
    }

    public String getvMachineClass() {
        return vMachineClass;
    }

    public String getvMachineType() {
        return vMachineType;
    }

    public String getLocalSSDSize() {
        return localSSDSize;
    }

    public String getDatacenterLocation() {
        return datacenterLocation;
    }

    public String getCommittedUsageTerm() {
        return committedUsageTerm;
    }

    public String getAddGPUsCheckbox() {
        return addGPUsCheckbox;
    }
}
