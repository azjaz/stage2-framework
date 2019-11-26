package pricingCalculatorTestFramework.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pricingCalculatorTestFramework.driver.DriverSingleton;

public class TestCommonConditions {
    protected WebDriver driver;
    protected static final String USER_EMAIL = "testuserattraining@gmail.com";
    protected static final String USER_PASSWORD = "Pass1234!";
    protected static final String REGEX_ESTIMATED_COST_SUM = "\\d?.?\\d+\\.\\d+";
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
