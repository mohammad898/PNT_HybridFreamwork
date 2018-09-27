package Search;

import home.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LoginPageTest extends LoginPage {

    LoginPageTest loginPageTest;

    @BeforeMethod
    public void initelement(){
        loginPageTest= PageFactory.initElements(driver,LoginPageTest.class);
        //driver.get("https://www.santanderbank.com/us/home");
    }
@Test(dataProvider = "supplyData")
public void signIn(String email,String passCode) throws InterruptedException {
        TestLogger.log("email: " + email);
         TestLogger.log("password: " + passCode);
         // TestLogger.log("message: " + message);

   // loginPageTest.LoginPage.click();;
    //loginPageTest.log("In Sign In Page");
    loginPageTest.ValidUserInput(email,passCode);
    TestLogger.log("Test Passed");

}


}
