package pricingCalculatorTestFramework.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pricingCalculatorTestFramework.driver.DriverSingleton;
import pricingCalculatorTestFramework.services.TestDataConfigurator;
import pricingCalculatorTestFramework.utils.TestListener;

@Listeners({TestListener.class})
public class TestCommonConditions {
    protected WebDriver driver;

    protected static final String REGEX_ESTIMATED_COST_SUM = "\\d?.?\\d+\\.\\d+";
    protected static final String COST_FOR_CONFIG = "Total Estimated Cost: USD " +
            TestDataConfigurator.getTestData("totalCost") +
            " per 1 month";
    protected String termToSearch = "Google Cloud Platform Pricing Calculator";

    @BeforeMethod(alwaysRun = true)
    public void browserSetUp() {
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void browserTermination() {
        DriverSingleton.closeDriver();
    }
}
