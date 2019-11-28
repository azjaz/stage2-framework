package pricingCalculatorTestFramework.services;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GPUBlockCreator {

    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuCount')]")
    private static WebElement numberOfGPUs;

    @FindBy(xpath = "//md-select[contains(@ng-model, 'computeServer.gpuType')]")
    private static WebElement gpuTypeSelect;

    public static void createGPUConfig(WebDriver driver, String number, By type) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", numberOfGPUs);
        numberOfGPUs.sendKeys(number);
        executor.executeScript("arguments[0].click();", gpuTypeSelect);
        executor.executeScript("arguments[0].click();", driver.findElement(type));
    }
}
