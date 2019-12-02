package pricingCalculatorTestFramework.services;

import java.util.ResourceBundle;

public class TestDataConfigurator {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("environment"));
    public static String getTestData(String key) {
        return resourceBundle.getString(key);
    }
}
