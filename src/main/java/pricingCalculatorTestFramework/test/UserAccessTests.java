package pricingCalculatorTestFramework.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pricingCalculatorTestFramework.page.GoogleHomePage;

import java.util.List;

public class UserAccessTests extends TestCommonConditions {

    @Test
    public void openFreeTrialViaButtonTest() {
        List<WebElement> confirmTermsForFreeTrial =  new GoogleHomePage(driver)
                .openPage()
                .pressGetStartedForFreeButton()
                .inputEmailForLoginToGoogle(USER_EMAIL)
                .inputPasswordForLoginPageGoogle(USER_PASSWORD)
                .presenceOfCheckBoxWithTerms();
        Assert.assertTrue(confirmTermsForFreeTrial.size() > 0, "Can't use for Free trial");

    }

    @Test
    public void openFreeTrialViaGoogleConsoleTest() {
        List<WebElement> confirmTermForFreeTrial = new GoogleHomePage(driver)
                .openPage()
                .pressGettingStartedLink()
                .inputEmailForLoginToGoogle(USER_EMAIL)
                .inputPasswordForLoginPageGoogle(USER_PASSWORD)
                .pressGetTrialButton()
                .presenceOfCheckBoxWithTerms();
        Assert.assertTrue(confirmTermForFreeTrial.size() > 0, "Can't use for Free trial");
    }
}
