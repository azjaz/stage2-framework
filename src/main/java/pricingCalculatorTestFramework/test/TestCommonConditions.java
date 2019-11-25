package pricingCalculatorTestFramework.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCommonConditions {
    protected WebDriver driver;
    private static final String RESOURCE_PATH = "src\\main\\resources\\";
    protected String termToSearch = "Google Cloud Platform Pricing Calculator";

    @BeforeMethod(alwaysRun = true)
    public void browserSetUp() {
        System.setProperty("webdriver.chrome.driver", RESOURCE_PATH + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod(alwaysRun = true)
    public void browserTermination() {
        driver.quit();
        driver = null;
    }
}
