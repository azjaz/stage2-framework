package pricingCalculatorTestFramework.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pricingCalculatorTestFramework.models.VirtualMachine.BasicConfiguration;
//import pricingCalculatorTestFramework.models.VirtualMachine.VirtualMachine;
import pricingCalculatorTestFramework.models.VirtualMachine.VirtualMachineConfig;
import pricingCalculatorTestFramework.page.GoogleHomePage;
import pricingCalculatorTestFramework.page.ResultsOfCountingEstimateCostPage;
import pricingCalculatorTestFramework.services.VirtualMachineCreator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class GooglePriceCalculatorTests extends TestCommonConditions {
    VirtualMachineConfig config = VirtualMachineCreator.createConfiguration();

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

        String totalCostFromCalculator = Arrays.stream(testPage.getTotalCostFromCalculator())
                .filter((p) -> p.matches(REGEX_ESTIMATED_COST_SUM))
                .collect(Collectors.joining());

        ResultsOfCountingEstimateCostPage testEmailServicePage = testPage.pressEmailEstimateButton()
                .fillEmailField()
                .pressSendEmailButton()
                .spinMessageList();

        String totalCostFromMail = Arrays.stream(testEmailServicePage.getTotalCostFromTheLetter())
                .filter((p) -> p.matches(REGEX_ESTIMATED_COST_SUM))
                .collect(Collectors.joining());

        Assert.assertEquals(totalCostFromCalculator, totalCostFromMail);

    }

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
