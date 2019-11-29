package pricingCalculatorTestFramework.models.VirtualMachine;

public class GPUConfig {
    private String numberOfGPUs = "//md-select[contains(@ng-model, 'computeServer.gpuCount')]";
    private String gpuTypeSelect = "//md-select[contains(@ng-model, 'computeServer.gpuType')]";

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public String getGpuTypeSelect() {
        return gpuTypeSelect;
    }
}
