package pricingCalculatorTestFramework.models.VirtualMachine;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasicConfiguration extends VirtualMachine {

    public BasicConfiguration() {
        super();
    }
    private String instancesNumber = "4";
    private String purposeOfVMachine = "Web";
    private String operatingSystem = "//md-option[contains(@value,'free')]";
    private String vmClass = "//md-option[contains(@id,'select_option_67')]";
    private String vmType = "//md-option[contains(@value,'STANDARD-8')]";
    private String numberOfGPUs = "1";
    private String typeOfGPU = "//md-option[contains(@value,'TESLA_V100')]";
    private String SSDsize = "//md-option[contains(@id,'select_option_172')]";
    private String dataCenter = "//md-option[contains(@id,'select_option_185')]";
    private String usageTerm = "//md-option[contains(@id,'select_option_83')]";

    public String getInstancesNumber() {
        return instancesNumber;
    }

    public String getPurposeOfVMachine() {
        return purposeOfVMachine;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getVmClass() {
        return vmClass;
    }

    public String getVmType() {
        return vmType;
    }

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public String getTypeOfGPU() {
        return typeOfGPU;
    }

    public String getSSDsize() {
        return SSDsize;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public String getUsageTerm() {
        return usageTerm;
    }
}
