package Search;

import home.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends LoginPage {
    @BeforeMethod
    public void initelement(){
        LoginPageTest loginPageTest= PageFactory.initElements(driver,LoginPageTest.class);
        //driver.get("https://www.santanderbank.com/us/home");
    }
    @Test
    public void InvalidUser_Test(){InvalidUsernameInput();}
    @Test
    public void ValidUser_Test(){ValidUserInput();}
    @Test
    public void EnrollNow_Test(){Enrollnow();}
    @Test
    public void ForgetId_Test(){ForgetId();}
//    @Test
//    public void CheckDropDown_Test(){CheckDropDown();}


}
