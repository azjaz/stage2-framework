package pricingCalculatorTestFramework.test;

import org.testng.annotations.Test;
import pricingCalculatorTestFramework.page.GoogleHomePage;

public class UserAccessTests extends TestCommonConditions{
    protected static final String USER_EMAIL = "testuserattraining@gmail.com";
    protected static final String USER_PASSWORD = "Pass1234!";
    @Test
    public void openFreeTrialViaButtonTest() {
        new GoogleHomePage(driver)
                .openPage()
                .pressGetStartedForFreeButton()
                .inputEmailForLoginToGoogle(USER_EMAIL)
                .inputPasswordForLoginPageGoogle(USER_PASSWORD);

    }

    @Test
    public void openFreeTrialViaConsoleTest() {

    }
}
