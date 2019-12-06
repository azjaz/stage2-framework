package pricingCalculatorTestFramework.utils;

public class XpathCreator {
    public static String createXpath(String option) {
        return String.format("//md-option[contains(%s)]", option);
    }
}
