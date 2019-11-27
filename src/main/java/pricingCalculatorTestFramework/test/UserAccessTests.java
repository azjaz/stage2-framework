package pricingCalculatorTestFramework.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pricingCalculatorTestFramework.models.User;
import pricingCalculatorTestFramework.page.GoogleHomePage;
import pricingCalculatorTestFramework.services.UserCreator;

import java.util.List;


public class UserAccessTests extends TestCommonConditions {
    User testUser = UserCreator.withCorrectCredentials();
    @Test
    public void openFreeTrialViaButtonTest() {
        List<WebElement> confirmTermsForFreeTrial =  new GoogleHomePage(driver)
                .openPage()
                .pressGetStartedForFreeButton()
                .inputEmailForLoginToGoogle(testUser.getEmail())
                .inputPasswordForLoginPageGoogle(testUser.getPassword())
                .presenceOfCheckBoxWithTerms();
        Assert.assertTrue(confirmTermsForFreeTrial.size() > 0, "Can't use for Free trial");

    }

    @Test
    public void openFreeTrialViaGoogleConsoleTest() {
        List<WebElement> confirmTermForFreeTrial = new GoogleHomePage(driver)
                .openPage()
                .pressGettingStartedLink()
                .inputEmailForLoginToGoogle(testUser.getEmail())
                .inputPasswordForLoginPageGoogle(testUser.getPassword())
                .pressGetTrialButton()
                .presenceOfCheckBoxWithTerms();
        Assert.assertTrue(confirmTermForFreeTrial.size() > 0, "Can't use for Free trial");
    }
}
