package Search;

import home.PageSearch_optional_attempt;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageSearch_option_attempt_Test extends PageSearch_optional_attempt {
    PageSearch_optional_attempt pageSearch_optional_attempt;
    @BeforeMethod
    public void init(){
        pageSearch_optional_attempt= PageFactory.initElements(driver,PageSearch_optional_attempt.class);
    }
    @Test
    public void SearchPage(){ searchpage();}
    @Test
    public void ClassBody(){ classbody();}
    @Test
    public void TermsofUse(){ TermsOfUse();}
    @Test
    public void privacypolicy(){ PrivacyPolicy();}
    @Test
    public void contactus(){ ContactUs();}
    @Test
    public void mortgageLending(){ MortgageLending();}
    @Test
    public void business(){ Business();}
    @Test
    public void aTMLocation(){ FindATM();}
    @Test
    public void findATM(){ FindATM();}
    @Test
    public void Hovermenu(){ hovermenu();}

}
