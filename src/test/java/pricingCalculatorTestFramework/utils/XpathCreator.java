package pricingCalculatorTestFramework.utils;

public class XpathCreator {
    public static String createXpath(String option) {
        return String.format("//md-option[contains(%s)]", option);
    }

    public static String createComplexXpath(String option) {
        return String.format("//md-option/div[contains(%s)]", option);
    }
}
