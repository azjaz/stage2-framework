package pricingCalculatorTestFramework.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pricingCalculatorTestFramework.models.VirtualMachineConfig;
import pricingCalculatorTestFramework.page.GoogleHomePage;
import pricingCalculatorTestFramework.services.VirtualMachineCreator;

public class GooglePricingCalculatorSmokeTest extends TestCommonConditions{

    VirtualMachineConfig config = VirtualMachineCreator.createConfiguration();

    @Test
    public void presenceOfTotalCostOnPageTest() {
        boolean presenceOfTotalCostOnPage = new GoogleHomePage(driver)
                .openPage()
                .searchForTerm(termToSearch)
                .clickOnRequiredLink()
                .activateComputeEngineBlock()
                .fillNumberOfInstancesField(config.getInstancesNumber())
                .fillPurposeOfInstancesBlock(config.getPurposeOfVMachine())
                .chooseSoftwareBlock(config.getOperatingSystem())
                .chooseVMachineClassBlock(config.getVmClass())
                .chooseMachineTypeBlock(config.getVmType())
                .chooseGPUTypeBlock(config.getNumberOfGPUs(), config.getTypeOfGPU())
                .chooseLocalSSDBlock(config.getSSDsize())
                .chooseDatacenterLocationBlock(config.getDataCenter())
                .chooseCommittedUsageBlock(config.getUsageTerm())
                .pressAddToEstimateButton()
                .isTotalCostCalculated();
        Assert.assertTrue(presenceOfTotalCostOnPage, "Estimated total cost is not calculated!");
    }
}
