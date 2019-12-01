package pricingCalculatorTestFramework.services;

import pricingCalculatorTestFramework.models.VirtualMachine.BasicConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.RecommendedConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.VirtualMachineConfig;


public class VirtualMachineCreator {
    private VirtualMachineCreator() {}

    public static VirtualMachineConfig createConfiguration() {

        VirtualMachineConfig userChoiceConfig = new VirtualMachineConfig();
        System.setProperty("configuration", "recommended");
        switch (System.getProperty("configuration")) {
            case "base" : {
                BasicConfiguration basic = new BasicConfiguration();
                userChoiceConfig.setInstancesNumber(basic.getInstancesNumber());
                userChoiceConfig.setPurposeOfVMachine(basic.getPurposeOfVMachine());
                userChoiceConfig.setOperatingSystem(basic.getOperatingSystem());
                userChoiceConfig.setVmType(basic.getVmType());
                userChoiceConfig.setVmClass(basic.getVmClass());
                userChoiceConfig.setNumberOfGPUs(basic.getNumberOfGPUs());
                userChoiceConfig.setTypeOfGPU(basic.getTypeOfGPU());
                userChoiceConfig.setSSDsize(basic.getSSDsize());
                userChoiceConfig.setDataCenter(basic.getDataCenter());
                userChoiceConfig.setUsageTerm(basic.getUsageTerm());
                break;
            }
            default: {
                RecommendedConfiguration recommended = new RecommendedConfiguration();
                userChoiceConfig.setInstancesNumber(recommended.getInstancesNumber());
                userChoiceConfig.setPurposeOfVMachine(recommended.getPurposeOfVMachine());
                userChoiceConfig.setOperatingSystem(recommended.getOperatingSystem());
                userChoiceConfig.setVmType(recommended.getVmType());
                userChoiceConfig.setVmClass(recommended.getVmClass());
                userChoiceConfig.setNumberOfGPUs(recommended.getNumberOfGPUs());
                userChoiceConfig.setTypeOfGPU(recommended.getTypeOfGPU());
                userChoiceConfig.setSSDsize(recommended.getSSDsize());
                userChoiceConfig.setDataCenter(recommended.getDataCenter());
                userChoiceConfig.setUsageTerm(recommended.getUsageTerm());
                break;
            }
        }

        return userChoiceConfig;
    }
}
