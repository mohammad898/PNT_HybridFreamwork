package Search;

import home.PersonalTextOptionPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonalTextOptionPageTest extends PersonalTextOptionPage {
    @BeforeMethod
        public void initelement() {
        PersonalTextOptionPage personalTextOptionPage = PageFactory.initElements(driver,PersonalTextOptionPage.class);
    }
    //Personal Page Elements
    @Test
    public void Banking_Test(){Banking();}
    @Test void Borrowing_Test(){Borrowing();}
    @Test
    public void InvestmentandProtections_Test(){InvestmentandProtections();}
    @Test
    public void CreditCard_Test(){CreditCard();}
    @Test
    public void ProsperandThrives_Test(){ProsperandThrive();}
}
