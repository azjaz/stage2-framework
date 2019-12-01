package pricingCalculatorTestFramework.models.VirtualMachine;

public class VirtualMachineConfig {
    private String instancesNumber;
    private String purposeOfVMachine;
    private String operatingSystem;
    private String vmClass;
    private String vmType;
    private String numberOfGPUs;
    private String typeOfGPU;
    private String SSDsize;
    private String dataCenter;
    private String usageTerm;

    public String getInstancesNumber() {
        return instancesNumber;
    }

    public void setInstancesNumber(String instancesNumber) {
        this.instancesNumber = instancesNumber;
    }

    public String getPurposeOfVMachine() {
        return purposeOfVMachine;
    }

    public void setPurposeOfVMachine(String purposeOfVMachine) {
        this.purposeOfVMachine = purposeOfVMachine;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getVmClass() {
        return vmClass;
    }

    public void setVmClass(String vmClass) {
        this.vmClass = vmClass;
    }

    public String getVmType() {
        return vmType;
    }

    public void setVmType(String vmType) {
        this.vmType = vmType;
    }

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public void setNumberOfGPUs(String numberOfGPUs) {
        this.numberOfGPUs = numberOfGPUs;
    }

    public String getTypeOfGPU() {
        return typeOfGPU;
    }

    public void setTypeOfGPU(String typeOfGPU) {
        this.typeOfGPU = typeOfGPU;
    }

    public String getSSDsize() {
        return SSDsize;
    }

    public void setSSDsize(String SSDsize) {
        this.SSDsize = SSDsize;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getUsageTerm() {
        return usageTerm;
    }

    public void setUsageTerm(String usageTerm) {
        this.usageTerm = usageTerm;
    }
}
