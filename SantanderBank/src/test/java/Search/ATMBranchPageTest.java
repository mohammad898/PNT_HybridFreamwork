package Search;

import home.ATMBranchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMBranchPageTest extends ATMBranchPage {
    @BeforeMethod
    public void initelement(){
        ATMBranchPageTest atmBranchPageTest= PageFactory.initElements(driver,ATMBranchPageTest.class);
        driver.get("https://locations.santanderbank.com/search.html");
    }
    @Test
    public void TextInput_Test(){TextInput();}
    @Test
    public void BrowseByState_Test(){BrowseByState();}
}
