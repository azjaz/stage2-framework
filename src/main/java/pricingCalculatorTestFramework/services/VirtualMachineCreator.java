package pricingCalculatorTestFramework.services;


import pricingCalculatorTestFramework.models.VirtualMachine.DefaultConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.MaxConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.MinConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.VirtualMachineConfig;
import pricingCalculatorTestFramework.utils.XpathCreator;


public class VirtualMachineCreator {
    private VirtualMachineCreator() {}

    public static final String instancesNumber = "test.instancesNumber";
    public static final String purposeOfVMachine = "test.purposeOfVMachine";
    public static final String operatingSystem = XpathCreator.createXpath("test.operatingSystem");
    public static final String vmClass = XpathCreator.createXpath("test.vmClass");
    public static final String vmType = XpathCreator.createXpath("test.vmType");
    public static final String numberOfGPUs = "test.numberOfGPUs";
    public static final String typeOfGPU = XpathCreator.createXpath("test.typeOfGPU");
    public static final String SSDsize = XpathCreator.createXpath("test.SSDsize");
    public static final String dataCenter = XpathCreator.createXpath("test.dataCenter");
    public static final String usageTerm = XpathCreator.createXpath("test.usageTerm");

    public static VirtualMachineConfig createConfiguration() {

        VirtualMachineConfig userChoiceConfig = new VirtualMachineConfig();
//        System.setProperty("configuration", "max");
//        switch (System.getProperty("configuration")) {
//            case "min" : {
//                MinConfiguration min = new MinConfiguration();
                userChoiceConfig.setInstancesNumber(TestDataConfigurator.getTestData(instancesNumber));
                userChoiceConfig.setPurposeOfVMachine(TestDataConfigurator.getTestData(purposeOfVMachine));
                userChoiceConfig.setOperatingSystem(TestDataConfigurator.getTestData(operatingSystem));
                userChoiceConfig.setVmType(TestDataConfigurator.getTestData(vmClass));
                userChoiceConfig.setVmClass(TestDataConfigurator.getTestData(vmType));
                userChoiceConfig.setNumberOfGPUs(TestDataConfigurator.getTestData(numberOfGPUs));
                userChoiceConfig.setTypeOfGPU(TestDataConfigurator.getTestData(typeOfGPU));
                userChoiceConfig.setSSDsize(TestDataConfigurator.getTestData(SSDsize));
                userChoiceConfig.setDataCenter(TestDataConfigurator.getTestData(dataCenter));
                userChoiceConfig.setUsageTerm(TestDataConfigurator.getTestData(usageTerm));
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
//        return userChoiceConfig;
    }
}
