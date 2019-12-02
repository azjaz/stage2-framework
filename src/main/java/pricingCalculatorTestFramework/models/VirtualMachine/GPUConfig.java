package pricingCalculatorTestFramework.models.VirtualMachine;

import java.util.Objects;

public class GPUConfig {

    private String numberOfGPUs = "//md-select[contains(@ng-model, 'computeServer.gpuCount')]";
    private String gpuTypeSelect = "//md-select[contains(@ng-model, 'computeServer.gpuType')]";

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public String getGpuTypeSelect() {
        return gpuTypeSelect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GPUConfig gpuConfig = (GPUConfig) o;
        return Objects.equals(numberOfGPUs, gpuConfig.numberOfGPUs) &&
                Objects.equals(gpuTypeSelect, gpuConfig.gpuTypeSelect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfGPUs, gpuTypeSelect);
    }

    @Override
    public String toString() {
        return "GPUConfig{" +
                "numberOfGPUs='" + numberOfGPUs + '\'' +
                ", gpuTypeSelect='" + gpuTypeSelect + '\'' +
                '}';
    }
}
