package Search;

import home.ATMBranchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMBranchPageTest extends ATMBranchPage {
    ATMBranchPageTest atmBranchPageTest;
    @BeforeMethod
    public void initelement(){
        atmBranchPageTest= PageFactory.initElements(driver,ATMBranchPageTest.class);
        driver.get("https://locations.santanderbank.com/search.html");
    }
    @Test
    public void TextInput_Test(){atmBranchPageTest.TextInput();}
    @Test
    public void BrowseByState_Test(){atmBranchPageTest.BrowseByState();}
}
