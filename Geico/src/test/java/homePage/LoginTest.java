package homePage;

import DataDrivenClass.Login;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import DataDrivenClass.XlsDataReaderUtil;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class LoginTest extends Login {

    Login loginObject;
    @BeforeMethod
    public void init(){
        loginObject = PageFactory.initElements(driver,Login.class);
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){

        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcelFM();

        return testData.iterator();

    }
    @Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode, String message) throws InterruptedException {
         navigateToLoginPage();
        /*TestLogger t1 = PageFactory.initElements(driver,TestLogger.class);
        t1.log("email: " + email);
        t1.log("password: " + passCode);*/
        //TestLogger.log("message: " + message);
        //TestLogger.log("In Log In Page");
        String errMessage = SendLoginInfo(email, passCode);
        Assert.assertEquals(message,errMessage);
        //TestLogger.log("Test Passed");

    }
}
