package pricingCalculatorTestFramework.services;


import pricingCalculatorTestFramework.models.VirtualMachine.DefaultConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.MaxConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.MinConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.VirtualMachineConfig;
import pricingCalculatorTestFramework.utils.XpathCreator;


public class VirtualMachineCreator {
//    private VirtualMachineCreator() {}

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
//        System.setProperty("configuration", "max");
//        switch (System.getProperty("configuration")) {
//            case "min" : {
//                MinConfiguration min = new MinConfiguration();
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
//                break;
//            }
//            case "max" : {
//                MaxConfiguration max = new MaxConfiguration();
//                userChoiceConfig.setInstancesNumber(max.getInstancesNumber());
//                userChoiceConfig.setPurposeOfVMachine(max.getPurposeOfVMachine());
//                userChoiceConfig.setOperatingSystem(max.getOperatingSystem());
//                userChoiceConfig.setVmType(max.getVmType());
//                userChoiceConfig.setVmClass(max.getVmClass());
//                userChoiceConfig.setNumberOfGPUs(max.getNumberOfGPUs());
//                userChoiceConfig.setTypeOfGPU(max.getTypeOfGPU());
//                userChoiceConfig.setSSDsize(max.getSSDsize());
//                userChoiceConfig.setDataCenter(max.getDataCenter());
//                userChoiceConfig.setUsageTerm(max.getUsageTerm());
//                break;
//            }
//            default: {
//                DefaultConfiguration def = new DefaultConfiguration();
//                userChoiceConfig.setInstancesNumber(def.getInstancesNumber());
//                userChoiceConfig.setPurposeOfVMachine(def.getPurposeOfVMachine());
//                userChoiceConfig.setOperatingSystem(def.getOperatingSystem());
//                userChoiceConfig.setVmType(def.getVmType());
//                userChoiceConfig.setVmClass(def.getVmClass());
//                userChoiceConfig.setNumberOfGPUs(def.getNumberOfGPUs());
//                userChoiceConfig.setTypeOfGPU(def.getTypeOfGPU());
//                userChoiceConfig.setSSDsize(def.getSSDsize());
//                userChoiceConfig.setDataCenter(def.getDataCenter());
//                userChoiceConfig.setUsageTerm(def.getUsageTerm());
//            }
//        }
//
        return userChoiceConfig;
    }
}
