package pricingCalculatorTestFramework.utils;

public class XpathCreator {
    public static final String OPTION_XPATH = "//md-option/div[contains(text(),'%s')]";
    public static String createXpath(String option) {
        return String.format(OPTION_XPATH, option);
    }
}
