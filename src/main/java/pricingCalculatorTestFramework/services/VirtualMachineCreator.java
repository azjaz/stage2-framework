package pricingCalculatorTestFramework.services;

import pricingCalculatorTestFramework.models.VirtualMachineConfig;
import pricingCalculatorTestFramework.utils.XpathCreator;


public class VirtualMachineCreator {

    public static final String instancesNumber = TestDataConfigurator.getTestData("test.instancesNumber");
    public static final String purposeOfVMachine = TestDataConfigurator.getTestData("test.purposeOfVMachine");
    public static final String operatingSystem = XpathCreator.createXpath(TestDataConfigurator.getTestData("test.operatingSystem"));
    public static final String vmClass = XpathCreator.createXpath(TestDataConfigurator.getTestData("test.vmClass"));
    public static final String vmType = XpathCreator.createXpath(TestDataConfigurator.getTestData("test.vmType"));
    public static final String numberOfGPUs = TestDataConfigurator.getTestData("test.numberOfGPUs");
    public static final String typeOfGPU = XpathCreator.createXpath(TestDataConfigurator.getTestData("test.typeOfGPU"));
    public static final String SSDsize = XpathCreator.createXpath(TestDataConfigurator.getTestData("test.SSDsize"));
    public static final String dataCenter = XpathCreator.createXpath(TestDataConfigurator.getTestData("test.dataCenter"));
    public static final String usageTerm = XpathCreator.createXpath(TestDataConfigurator.getTestData("test.usageTerm"));

    public static VirtualMachineConfig createConfiguration() {
        VirtualMachineConfig userChoiceConfig = new VirtualMachineConfig();
                userChoiceConfig.setInstancesNumber(instancesNumber);
                userChoiceConfig.setPurposeOfVMachine(purposeOfVMachine);
                userChoiceConfig.setOperatingSystem(operatingSystem);
                userChoiceConfig.setVmType(vmClass);
                userChoiceConfig.setVmClass(vmType);
                userChoiceConfig.setNumberOfGPUs(numberOfGPUs);
                userChoiceConfig.setTypeOfGPU(typeOfGPU);
                userChoiceConfig.setSSDsize(SSDsize);
                userChoiceConfig.setDataCenter(dataCenter);
                userChoiceConfig.setUsageTerm(usageTerm);
        return userChoiceConfig;
    }
}
