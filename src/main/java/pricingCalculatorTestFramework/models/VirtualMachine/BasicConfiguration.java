package pricingCalculatorTestFramework.models.VirtualMachine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasicConfiguration extends VirtualMachine {

    public BasicConfiguration() {
        super();

    }
    private String instancesNumber = "4";
    private String purposeOfVMachine = "Web";
    private By operatingSystem = By.xpath("//md-option[contains(@value,'free')]");
    protected By vmClass = By.xpath("//md-option[contains(@id,'select_option_67')]");
    protected By vmType = By.xpath("//md-option[contains(@value,'STANDARD-8')]");
    protected String numberOfGPUs = "1";
    protected By typeOfGPU = By.xpath("//md-option[contains(@value,'TESLA_V100')]");
    protected By SSDsize = By.xpath("//md-option[contains(@id,'select_option_172')]");
    protected By dataCenter = By.xpath("//md-option[contains(@id,'select_option_185')]");
    protected By usageTerm = By.xpath("//md-option[contains(@id,'select_option_83')]");



}
