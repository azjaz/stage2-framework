package pricingCalculatorTestFramework.services;


import pricingCalculatorTestFramework.models.VirtualMachine.DefaultConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.MaxConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.MinConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.VirtualMachineConfig;


public class VirtualMachineCreator {
    private VirtualMachineCreator() {}

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
    public static VirtualMachineConfig createConfiguration() {

        VirtualMachineConfig userChoiceConfig = new VirtualMachineConfig();
//        System.setProperty("configuration", "max");
//        switch (System.getProperty("configuration")) {
//            case "min" : {
//                MinConfiguration min = new MinConfiguration();
                userChoiceConfig.setInstancesNumber(min.getInstancesNumber());
                userChoiceConfig.setPurposeOfVMachine(min.getPurposeOfVMachine());
                userChoiceConfig.setOperatingSystem(min.getOperatingSystem());
                userChoiceConfig.setVmType(min.getVmType());
                userChoiceConfig.setVmClass(min.getVmClass());
                userChoiceConfig.setNumberOfGPUs(min.getNumberOfGPUs());
                userChoiceConfig.setTypeOfGPU(min.getTypeOfGPU());
                userChoiceConfig.setSSDsize(min.getSSDsize());
                userChoiceConfig.setDataCenter(min.getDataCenter());
                userChoiceConfig.setUsageTerm(min.getUsageTerm());
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
