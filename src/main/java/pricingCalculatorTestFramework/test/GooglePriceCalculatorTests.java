package pricingCalculatorTestFramework.test;

import org.testng.annotations.Test;
import pricingCalculatorTestFramework.page.CloudPricingCalcPage;
import pricingCalculatorTestFramework.page.GoogleHomePage;


public class GooglePriceCalculatorTests extends TestCommonConditions {
    private String termToSearch = "Google Cloud Platform Pricing Calculator";


    @Test
    public void correspondenceOfTotalCostTest() {
        CloudPricingCalcPage testPage = new GoogleHomePage(driver)
                .openPage()
                .searchForTerm(termToSearch)
                .clickOnRequiredLink();
    }


//    @Test
//    public void correspondenceOfTotalCostTest() {
//        GoogleCloudPricingCalcPage testPage = new CloudGoogleHomePage(driver)
//                .openPage()
//                .searchForTerm(termToSearch)
//                .clickOnRequiredLink()
//                .activateComputeEngineBlock()
//                .fillNumberOfInstancesField()
//                .fillPurposeOfInstancesBlock()
//                .chooseSoftwareBlock()
//                .chooseVMachineClassBlock()
//                .chooseMachineTypeBlock()
//                .chooseGPUTypeBlock()
//                .chooseLocalSSDBlock()
//                .chooseDatacenterLocationBlock()
//                .chooseCommittedUsageBlock()
//                .pressAddToEstimateButton();
//
//        String totalCostFromCalculator = Arrays.stream(testPage.getTotalCostFromCalculator())
//                .filter((p) -> p.matches(regExForCheckedValue))
//                .collect(Collectors.joining());
//
//        TemporaryEmailServicePage testEmailServicePage = testPage.pressEmailEstimateButton()
//                .fillEmailField()
//                .pressSendEmailButton()
//                .spinMessageList();
//
//        String totalCostFromMail = Arrays.stream(testEmailServicePage.getTotalCostFromTheLetter())
//                .filter((p) -> p.matches(regExForCheckedValue))
//                .collect(Collectors.joining());
//
//        Assert.assertEquals(totalCostFromCalculator, totalCostFromMail);
//
//    }

}
