package pricingCalculatorTestFramework.services;

import org.openqa.selenium.WebDriver;
import pricingCalculatorTestFramework.models.VirtualMachine.BasicConfiguration;
import pricingCalculatorTestFramework.models.VirtualMachine.VirtualMachine;

public class VirtualMachineCreator {
    public static WebDriver driver;
    public static BasicConfiguration createBasicConfiguration() {
        return new BasicConfiguration(driver);
    }
}
