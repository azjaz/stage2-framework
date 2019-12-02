package pricingCalculatorTestFramework.models.VirtualMachine;

import java.util.Objects;

public class MaxConfiguration {

    private String instancesNumber = "6";
    private String purposeOfVMachine = "Enterprise Server";
    private String operatingSystem = "//md-option[contains(@value,'sql-web')]";
    private String vmClass = "//md-option[contains(@id,'select_option_67')]";
    private String vmType = "//md-option[contains(@value,'STANDARD-8')]";
    private String numberOfGPUs = "4";
    private String typeOfGPU = "//md-option[contains(@value,'TESLA_V100')]";
    private String SSDsize = "//md-option[contains(@id,'select_option_174')]";
    private String dataCenter = "//md-option[contains(@id,'select_option_184')]";
    private String usageTerm = "//md-option[contains(@id,'select_option_84')]";

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaxConfiguration that = (MaxConfiguration) o;
        return Objects.equals(instancesNumber, that.instancesNumber) &&
                Objects.equals(purposeOfVMachine, that.purposeOfVMachine) &&
                Objects.equals(operatingSystem, that.operatingSystem) &&
                Objects.equals(vmClass, that.vmClass) &&
                Objects.equals(vmType, that.vmType) &&
                Objects.equals(numberOfGPUs, that.numberOfGPUs) &&
                Objects.equals(typeOfGPU, that.typeOfGPU) &&
                Objects.equals(SSDsize, that.SSDsize) &&
                Objects.equals(dataCenter, that.dataCenter) &&
                Objects.equals(usageTerm, that.usageTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instancesNumber, purposeOfVMachine, operatingSystem, vmClass, vmType, numberOfGPUs, typeOfGPU, SSDsize, dataCenter, usageTerm);
    }

    @Override
    public String toString() {
        return "MaxConfiguration{" +
                "instancesNumber='" + instancesNumber + '\'' +
                ", purposeOfVMachine='" + purposeOfVMachine + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", vmClass='" + vmClass + '\'' +
                ", vmType='" + vmType + '\'' +
                ", numberOfGPUs='" + numberOfGPUs + '\'' +
                ", typeOfGPU='" + typeOfGPU + '\'' +
                ", SSDsize='" + SSDsize + '\'' +
                ", dataCenter='" + dataCenter + '\'' +
                ", usageTerm='" + usageTerm + '\'' +
                '}';
    }
}
