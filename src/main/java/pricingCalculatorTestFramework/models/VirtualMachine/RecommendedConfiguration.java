package pricingCalculatorTestFramework.models.VirtualMachine;

public class RecommendedConfiguration {
    private String instancesNumber = "4";
    private String purposeOfVMachine = "Bank DB";
    private String operatingSystem = "//md-option[contains(@value,'sql-standard')]";
    private String vmClass = "//md-option[contains(@id,'select_option_67')]";
    private String vmType = "//md-option[contains(@value,'STANDARD-8')]";
    private String numberOfGPUs = "2";
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
