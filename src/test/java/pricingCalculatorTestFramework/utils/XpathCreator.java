package pricingCalculatorTestFramework.utils;

public class XpathCreator {

    public static String createXpath(String option) {
        return String.format("//md-option/div[contains(text(),'%s')]", option);
    }
}
