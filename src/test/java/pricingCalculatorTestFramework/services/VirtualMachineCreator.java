package pricingCalculatorTestFramework.services;

import pricingCalculatorTestFramework.models.VirtualMachineConfig;
import pricingCalculatorTestFramework.utils.XpathCreator;


public class VirtualMachineCreator {

    public static final String INSTANCES_NUMBER = TestDataConfigurator.getTestData("test.instancesNumber");
    public static final String PURPOSE_OF_VMACHINE = TestDataConfigurator.getTestData("test.purposeOfVMachine");
    public static final String OPERATING_SYSTEM = XpathCreator.createXpath(TestDataConfigurator.getTestData("test.operatingSystem"));
    public static final String VM_CLASS = XpathCreator.createXpath(TestDataConfigurator.getTestData("test.vmClass"));
    public static final String VM_TYPE = XpathCreator.createXpath(TestDataConfigurator.getTestData("test.vmType"));
    public static final String NUMBER_OF_GPUS = TestDataConfigurator.getTestData("test.numberOfGPUs");
    public static final String TYPE_OF_GPU = XpathCreator.createXpath(TestDataConfigurator.getTestData("test.typeOfGPU"));
    public static final String SSD_SIZE = XpathCreator.createComplexXpath(TestDataConfigurator.getTestData("test.SSDsize"));
    public static final String DATA_CENTER = XpathCreator.createComplexXpath(TestDataConfigurator.getTestData("test.dataCenter"));
    public static final String USAGE_TERM = XpathCreator.createComplexXpath(TestDataConfigurator.getTestData("test.usageTerm"));

    public static VirtualMachineConfig createConfiguration() {
        VirtualMachineConfig userChoiceConfig = new VirtualMachineConfig();
                userChoiceConfig.setInstancesNumber(INSTANCES_NUMBER);
                userChoiceConfig.setPurposeOfVMachine(PURPOSE_OF_VMACHINE);
                userChoiceConfig.setOperatingSystem(OPERATING_SYSTEM);
                userChoiceConfig.setVmType(VM_TYPE);
                userChoiceConfig.setVmClass(VM_CLASS);
                userChoiceConfig.setNumberOfGPUs(NUMBER_OF_GPUS);
                userChoiceConfig.setTypeOfGPU(TYPE_OF_GPU);
                userChoiceConfig.setSSDsize(SSD_SIZE);
                userChoiceConfig.setDataCenter(DATA_CENTER);
                userChoiceConfig.setUsageTerm(USAGE_TERM);

                return userChoiceConfig;
    }
}
