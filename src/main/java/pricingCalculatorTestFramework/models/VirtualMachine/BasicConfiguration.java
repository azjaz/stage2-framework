package pricingCalculatorTestFramework.models.VirtualMachine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasicConfiguration extends VirtualMachine {

    public BasicConfiguration(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    protected String numberOfInstances = "4";
    protected String purposeOfVMachine = "Web";
    protected By operatingSystem = By.xpath("//md-option[contains(@value,'free')]");
    protected By vmClass = By.xpath("//md-option[contains(@id,'select_option_67')]");
    protected By vmType = By.xpath("//md-option[contains(@value,'STANDARD-8')]");
    protected String numberOfGPUs = "1";
    protected By typeOfGPU = By.xpath("//md-option[contains(@value,'TESLA_V100')]");
    protected By localSSDsize = By.xpath("//md-option[contains(@id,'select_option_172')]");
    protected By dataCenterLocation = By.xpath("//md-option[contains(@id,'select_option_185')]");
    protected By committedUsage = By.xpath("//md-option[contains(@id,'select_option_83')]");
}
