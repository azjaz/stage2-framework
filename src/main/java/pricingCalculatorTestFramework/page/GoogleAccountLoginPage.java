package pricingCalculatorTestFramework.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleAccountLoginPage extends AbstractCorePage {

    @FindBy(xpath = "//input[@type='email']")
    WebElement formForEmailOrPhoneLogin;

    @FindBy(xpath = "//input[@type='password']")
    WebElement formForPasswordLogin;

    protected GoogleAccountLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public GoogleAccountLoginPage inputEmailForLoginToGoogle(String existingEmail) {
        fillFieldsWithSendKeysValue(formForEmailOrPhoneLogin, existingEmail);
//        formForEmailOrPhoneLogin.sendKeys(existingEmail);
        formForEmailOrPhoneLogin.sendKeys(Keys.ENTER);
        return this;
    }
    public GetTrialForFreePage inputPasswordForLoginPageGoogle(String legalPassword) {
        fillFieldsWithSendKeysValue(formForPasswordLogin, legalPassword);
//        formForPasswordLogin.sendKeys(legalPassword);
        formForPasswordLogin.sendKeys(Keys.ENTER);
        return new GetTrialForFreePage(driver);
    }
}