package Elements;

import PageObject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginBox extends PageObject {
    public LoginBox(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(text(), 'Log in')]")
    public static WebElement loginButton;
    @FindBy(className = "_n5wk6ic")
    public static WebElement useAnotherAccount;
    @FindBy(className = "_ni9axhe")
    public static WebElement usingEmail;
    @FindBy(xpath = "//*[@id=\"email-login-email\"]")
    public static WebElement inputEmail;
    @FindBy(id = "email-login-password")
    public static WebElement inputPasword;
    @FindBy(className = "_12cyg0af")
    public static WebElement clickLogin;
    @FindBy(className = "_16kmizaz")
    public static WebElement errorMsg;
    @FindBy(xpath = "//div[@class='recaptcha-checkbox-checkmark']")
    public static WebElement reCaptha;
}
