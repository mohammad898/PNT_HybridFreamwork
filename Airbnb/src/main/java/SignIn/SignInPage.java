package SignIn;

import Elements.LoginBox;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import reporting.TestLogger;

public class SignInPage extends LoginBox {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignIn() {
        loginButton.click();
    }
    public void signInUsingDataProvider(String email, String passCode, String message) {
            inputEmail.sendKeys(email, Keys.ENTER);
            inputPasword.sendKeys(passCode, Keys.ENTER);
            String errorMessage = errorMsg.getText();
            TestLogger.log("Error Message: " + errorMessage);
            Assert.assertEquals(errorMessage.contains(message), true);
        }

    }
