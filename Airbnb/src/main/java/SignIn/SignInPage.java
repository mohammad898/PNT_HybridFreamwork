package SignIn;

import PageObject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class SignInPage extends PageObject {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[5]/div/div/header/div/div/div[3]/div/div/nav/ul/li[5]/div/div/div/button/div/div")
    public static WebElement loginButton;
    @FindBy(className = "_n5wk6ic")
    public static WebElement useAnotherAccount;
    @FindBy(className = "_ni9axhe")
    public static WebElement usingEmail;
    @FindBy(id = "email-login-email")
    public static WebElement inputEmail;
    @FindBy(id = "email-login-password")
    public static WebElement inputPasword;
    @FindBy(className = "_12cyg0af")
    public static WebElement clickLogin;
    @FindBy(className = "_16kmizaz")
    public static WebElement errorMsg;

    public void clikSignIn() {
        if (loginButton.findElements(By.className("_lvb55za")).contains("Log in")){
        loginButton.click();
        useAnotherAccount.click();
        usingEmail.click();}
    }
    public void signInUsingDataProvider(String email, String passCode, String message) throws InterruptedException {

        inputEmail.sendKeys(email);
        inputPasword.sendKeys(passCode);
        Thread.sleep(3000);
        clickLogin.click();
        String errorMessage = errorMsg.getText();
        TestLogger.log("Error Message: "+errorMessage);
        Assert.assertEquals(errorMessage.contains(message), true);

    }
    }
