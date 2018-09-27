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
//    @Test
//    public void InvalidUser_Test(){InvalidUsernameInput();}
//    @Test
//    public void ValidUser_Test(){ValidUserInput();}
//    @Test
//    public void EnrollNow_Test(){Enrollnow();}
//    @Test
//    public void ForgetId_Test(){ForgetId();}
//    @Test
//    public void CheckDropDown_Test(){CheckDropDown();}
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
