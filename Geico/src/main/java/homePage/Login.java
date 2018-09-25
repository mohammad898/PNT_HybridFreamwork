package homePage;

import base.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends CommonClass {
    @FindBy(css = ".dummy-login.textbox")
    public static WebElement dummyLoginTextBox;
    @FindBy(xpath = "(//*[@id=\"LOGIN_policyNo\"])[2]")
    public static WebElement loginTextBox;
    @FindBy(xpath = "(//*[@id=\"LOGIN_password\"])[2]")
    public static WebElement passwordTextBox;
    @FindBy(xpath = "(//*[@id=\"manageSubmit\"])[2]")
    public static WebElement loginButton;

    public static void waitForLoginVisibility(){
        dummyLoginTextBox.click();
        wait.until(ExpectedConditions.visibilityOf(loginTextBox));
    }

    public void SendLoginInfo(String email, String password) throws InterruptedException {
        waitForLoginVisibility();
        loginTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);
        Thread.sleep(2000);
        loginButton.click();
    }
}
