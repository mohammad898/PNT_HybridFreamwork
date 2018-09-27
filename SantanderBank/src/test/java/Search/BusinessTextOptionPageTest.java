package Search;

import home.BusinessTextOptionPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BusinessTextOptionPageTest extends BusinessTextOptionPage {
    BusinessTextOptionPage businessTextOptionPage;
    @BeforeMethod
    public void initelement() {
        businessTextOptionPage = PageFactory.initElements(driver, BusinessTextOptionPage.class);
        driver.get("https://www.santanderbank.com/us/business");
    }
//    @Test
//    public void BusinessPage_Test(){Business();}
    @Test
    public void Banking_Test(){Banking();}
    @Test
    public void Borrowing_Test(){Borrowing();}
    @Test
    public void BusinessFirst_Test(){BusinessFirst();}


}
