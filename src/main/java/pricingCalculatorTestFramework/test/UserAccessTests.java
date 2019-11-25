package pricingCalculatorTestFramework.test;

import org.testng.annotations.Test;
import pricingCalculatorTestFramework.page.GoogleHomePage;

public class UserAccessTests extends TestCommonConditions{
    @Test
    public void openFreeTrialViaButtonWhenLoggedTest() {
        new GoogleHomePage(driver)
                .openPage()
                .searchForTerm(termToSearch)
                .clickOnRequiredLink()
    }

    @Test
    public void openFreeTrialViaConsoleWhenLoggedTest() {

    }
}
