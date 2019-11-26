package pricingCalculatorTestFramework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleton {
    private static WebDriver driver;
    private static final String RESOURCE_PATH = "src\\main\\resources\\";

    private DriverSingleton() {}

    public static WebDriver getDriver() {
        if(driver == null) {
            switch (System.getProperty("browser")) {
                case "firefox": {
                    System.setProperty("webdriver.gecko.driver", RESOURCE_PATH + "geckodriver.exe");
                    driver = new FirefoxDriver();
                }
                default: {
                    System.setProperty("webdriver.chrome.driver", RESOURCE_PATH + "chromedriver.exe");
                    driver = new ChromeDriver();
                }
            }
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
