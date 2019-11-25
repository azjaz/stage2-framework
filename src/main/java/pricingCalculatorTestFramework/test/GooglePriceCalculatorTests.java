package pricingCalculatorTestFramework.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pricingCalculatorTestFramework.page.GoogleHomePage;
import pricingCalculatorTestFramework.page.ResultsOfCountingEstimateCostPage;

import java.util.Arrays;
import java.util.stream.Collectors;


public class GooglePriceCalculatorTests extends TestCommonConditions {

    @Test
    public void correspondenceOfTotalCostOnPageAndMailTest() {
        ResultsOfCountingEstimateCostPage testPage = new GoogleHomePage(driver)
                .openPage()
                .searchForTerm(termToSearch)
                .clickOnRequiredLink()
                .activateComputeEngineBlock()
                .fillNumberOfInstancesField()
                .fillPurposeOfInstancesBlock()
                .chooseSoftwareBlock()
                .chooseVMachineClassBlock()
                .chooseMachineTypeBlock()
                .chooseGPUTypeBlock()
                .chooseLocalSSDBlock()
                .chooseDatacenterLocationBlock()
                .chooseCommittedUsageBlock()
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
                .fillNumberOfInstancesField()
                .fillPurposeOfInstancesBlock()
                .chooseSoftwareBlock()
                .chooseVMachineClassBlock()
                .chooseMachineTypeBlock()
                .chooseGPUTypeBlock()
                .chooseLocalSSDBlock()
                .chooseDatacenterLocationBlock()
                .chooseCommittedUsageBlock()
                .pressAddToEstimateButton()
                .isTotalCostCalculated();
        Assert.assertTrue(presenceOfTotalCostOnPage, "Estimated total cost is not calculated!");
    }

}
