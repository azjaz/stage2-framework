package pricingCalculatorTestFramework.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pricingCalculatorTestFramework.models.VirtualMachineConfig;
import pricingCalculatorTestFramework.page.GoogleHomePage;
import pricingCalculatorTestFramework.services.VirtualMachineCreator;

public class GooglePricingCalculatorSmokeTest extends TestCommonConditions{

    protected VirtualMachineConfig config = VirtualMachineCreator.createConfiguration();

    @Test
    public void presenceOfTotalCostOnPageTest() {
        String presenceOfTotalCostOnPage = new GoogleHomePage(driver)
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
                .getTotalCostFromCalculator();

        Assert.assertTrue(presenceOfTotalCostOnPage.equals(COST_FOR_CONFIG), "Estimated total cost is not calculated!");
    }
}
