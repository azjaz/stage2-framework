package pricingCalculatorTestFramework.models.VirtualMachine;

public class MinConfiguration {

    private String instancesNumber = "2";
    private String purposeOfVMachine = "Web";
    private String operatingSystem = "//md-option[contains(@value,'free')]";
    private String vmClass = "//md-option[contains(@id,'select_option_67')]";
    private String vmType = "//md-option[contains(@value,'STANDARD-1')]";
    private String numberOfGPUs = "1";
    private String typeOfGPU = "//md-option[contains(@value,'TESLA_K80')]";
    private String SSDsize = "//md-option[contains(@id,'select_option_170')]";
    private String dataCenter = "//md-option[contains(@id,'select_option_183')]";
    private String usageTerm = "//md-option[contains(@id,'select_option_82')]";

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
