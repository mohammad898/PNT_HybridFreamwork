package Search;

import base.ReusableAPI;
import home.HomePage;
import home.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;



public class LoginPageTest extends LoginPage {
    LoginPage loginPage;
    HomePage homePage;
    @BeforeMethod
    public void initelement(){
       homePage=PageFactory.initElements(ReusableAPI.driver,HomePage.class);
        loginPage= PageFactory.initElements(ReusableAPI.driver,LoginPage.class);}

@Test(dataProvider = "supplyData")
public void signIn(String email,String passCode) throws InterruptedException {
    //TestLogger.log("email: " + email);
    //TestLogger.log("password: " + passCode);
    //TestLogger.log("message: " + message);
    //loginPageTest.LoginPage.click();
    //loginPageTest.log("In Sign In Page");
    //loginPageTest.ValidUserInput(email, passCode);
    //TestLogger.log("Test Passed");
}
@Test
public void checkinput()throws Exception{
    //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.login();
        loginPage.checkLoginFuction();
}



}

