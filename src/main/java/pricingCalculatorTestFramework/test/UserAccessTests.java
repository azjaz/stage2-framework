package pricingCalculatorTestFramework.test;

import org.testng.annotations.Test;
import pricingCalculatorTestFramework.page.GoogleHomePage;

public class UserAccessTests extends TestCommonConditions{

    @Test
    public void openFreeTrialViaButtonTest() {
        new GoogleHomePage(driver)
                .openPage()
                .pressGetStartedForFreeButton()
                .inputEmailForLoginToGoogle(USER_EMAIL)
                .inputPasswordForLoginPageGoogle(USER_PASSWORD)
                .pressGetTrialButton()
                .presenceOfCheckBoxWithTerms();

    }

    @Test
    public void openFreeTrialViaGoogleConsoleTest() {
        new GoogleHomePage(driver)
                .openPage()
                .pressGettingStartedLink()
                .inputEmailForLoginToGoogle(USER_EMAIL)
                .inputPasswordForLoginPageGoogle(USER_PASSWORD)
                .pressGetTrialButton()
                .presenceOfCheckBoxWithTerms();
    }
}
