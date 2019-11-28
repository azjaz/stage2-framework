package pricingCalculatorTestFramework.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pricingCalculatorTestFramework.models.VirtualMachine.BasicConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.VirtualMachine;
import pricingCalculatorTestFramework.page.GoogleHomePage;
import pricingCalculatorTestFramework.page.ResultsOfCountingEstimateCostPage;
import pricingCalculatorTestFramework.services.VirtualMachineCreator;

import java.util.Arrays;
import java.util.stream.Collectors;


public class GooglePriceCalculatorTests extends TestCommonConditions {
    BasicConfiguration baseConf = VirtualMachineCreator.createBasicConfiguration();
    @Test
    public void correspondenceOfTotalCostOnPageAndMailTest() {

        ResultsOfCountingEstimateCostPage testPage = new GoogleHomePage(driver)
                .openPage()
                .searchForTerm(termToSearch)
                .clickOnRequiredLink()
                .activateComputeEngineBlock()
                .fillNumberOfInstancesField(baseConf.getNumberOfInstances(), baseConf.getInstancesNumber())
                .fillPurposeOfInstancesBlock(baseConf.getPurposeOfInstances(), baseConf.getPurposeOfVMachine())
                .chooseSoftwareBlock(baseConf.getSoftwareType(), baseConf.getOperatingSystem())
                .chooseVMachineClassBlock(baseConf.getvMachineClass(), baseConf.getVmClass())
                .chooseMachineTypeBlock(baseConf.getvMachineType(), baseConf.getVmType())
                .chooseGPUTypeBlock(baseConf.getNumberOfGPUs(), baseConf.getTypeOfGPU())
                .chooseLocalSSDBlock(baseConf.getLocalSSDSize(), baseConf.getSSDsize())
                .chooseDatacenterLocationBlock(baseConf.getDatacenterLocation(), baseConf.getDataCenter())
                .chooseCommittedUsageBlock(baseConf.getCommittedUsageTerm(), baseConf.getUsageTerm())
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
                .fillNumberOfInstancesField(baseConf.getNumberOfInstances(), baseConf.getInstancesNumber())
                .fillPurposeOfInstancesBlock(baseConf.getPurposeOfInstances(), baseConf.getPurposeOfVMachine())
                .chooseSoftwareBlock(baseConf.getSoftwareType(), baseConf.getOperatingSystem())
                .chooseVMachineClassBlock(baseConf.getvMachineClass(), baseConf.getVmClass())
                .chooseMachineTypeBlock(baseConf.getvMachineType(), baseConf.getVmType())
                .chooseGPUTypeBlock(baseConf.getNumberOfGPUs(), baseConf.getTypeOfGPU())
                .chooseLocalSSDBlock(baseConf.getLocalSSDSize(), baseConf.getSSDsize())
                .chooseDatacenterLocationBlock(baseConf.getDatacenterLocation(), baseConf.getDataCenter())
                .chooseCommittedUsageBlock(baseConf.getCommittedUsageTerm(), baseConf.getUsageTerm())
                .pressAddToEstimateButton()
                .isTotalCostCalculated();
        Assert.assertTrue(presenceOfTotalCostOnPage, "Estimated total cost is not calculated!");
    }

}
