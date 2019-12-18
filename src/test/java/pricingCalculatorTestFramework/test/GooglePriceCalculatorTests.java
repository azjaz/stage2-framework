package pricingCalculatorTestFramework.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pricingCalculatorTestFramework.models.VirtualMachineConfig;
import pricingCalculatorTestFramework.page.GoogleHomePage;
import pricingCalculatorTestFramework.page.ResultsOfCountingEstimateCostPage;
import pricingCalculatorTestFramework.services.VirtualMachineCreator;

public class GooglePriceCalculatorTests extends TestCommonConditions {
    private VirtualMachineConfig config = VirtualMachineCreator.createConfiguration();

    @Test
    public void correspondenceOfTotalCostOnPageAndMailTest() {

        ResultsOfCountingEstimateCostPage testPage = new GoogleHomePage(driver)
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
                .pressAddToEstimateButton();

        String totalCostFromCalculator = totalCostCounter(testPage.getTotalCostFromCalculator().split(" "));

        ResultsOfCountingEstimateCostPage testEmailServicePage = testPage.pressEmailEstimateButton()
                .getEmailFromField()
                .fillEmailField()
                .pressSendEmailButton()
                .spinMessageList();


        String totalCostFromMail = totalCostCounter(testEmailServicePage.getTotalCostFromTheLetter().split(" "));

        Assert.assertEquals(totalCostFromCalculator, totalCostFromMail);

    }

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
        Assert.assertEquals(presenceOfTotalCostOnPage, COST_FOR_CONFIG, "Estimated total cost is not calculated!");
    }

}
