package Search;

import home.CorporateTextOptionPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CorporateTextOptionPageTest extends CorporateTextOptionPage {
    @BeforeMethod
    public void initelement(){
        CorporateTextOptionPage corporateTextOptionPage= PageFactory.initElements(driver,CorporateTextOptionPage.class);
        driver.get("https://www.santanderbank.com/us/corporate");
    }
    @Test
    public void CorporateCapabilities_Test(){CorporateCapabilities();}
    @Test
    public void StanderderPrespectives_Test(){StanderderPrespectives();}
}
