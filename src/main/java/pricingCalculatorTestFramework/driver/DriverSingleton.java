package pricingCalculatorTestFramework.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleton {
    private static WebDriver driver;
//    private static final String RESOURCE_PATH = "src\\main\\resources\\";

    private DriverSingleton() {}

    public static WebDriver getDriver() {
        System.setProperty("browser", "chrome");
        if(driver == null) {
            switch (System.getProperty("browser")) {
                case "firefox": {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                default: {
                    WebDriverManager.chromedriver().setup();
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
