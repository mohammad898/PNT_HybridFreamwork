package Search;

import home.HomePage;
import home.KeyWordLogin;
import home.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class KeyWordLoginTest extends KeyWordLogin {
    KeyWordLogin keyWordLogin;


    @BeforeMethod

    public void init(){
        keyWordLogin= PageFactory.initElements(driver,KeyWordLogin.class);
    }
    @Test
    public void testLoginByKeyword() throws IOException,InterruptedException {
        keyWordLogin.loginByKeyword();
    }

}
