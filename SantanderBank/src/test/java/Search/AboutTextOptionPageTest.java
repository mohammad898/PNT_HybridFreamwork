package Search;

import home.AboutTextOptionPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AboutTextOptionPageTest extends AboutTextOptionPage {
    AboutTextOptionPage aboutTextOptionPage;
    @BeforeMethod
    public void initelement(){
       aboutTextOptionPage= PageFactory.initElements(driver,AboutTextOptionPage.class);
        driver.get("https://www.santanderbank.com/us/about/about-us");
    }
    @Test
    public void WhoWeAre_Test (){
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WhoWeAre();}
    @Test
    public void SantanderBankUni_Test(){
       // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SantanderBankUni();}
}
