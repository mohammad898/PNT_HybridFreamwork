package Search;

import home.AboutTextOptionPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutTextOptionPageTest extends AboutTextOptionPage {
    @BeforeMethod
    public void initelement(){
        AboutTextOptionPage aboutTextOptionPage= PageFactory.initElements(driver,AboutTextOptionPage.class);
        driver.get("https://www.santanderbank.com/us/about/about-us");
    }
    @Test
    public void WhoWeAre_Test(){WhoWeAre();}
    @Test
    public void SantanderBankUni_Test(){SantanderBankUni();}
}
